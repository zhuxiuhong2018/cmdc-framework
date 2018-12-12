/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.framework.service.base;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.WebApplicationContext;

import com.cm.cmdc.common.component.i18n.I18nUtils;
import com.cm.cmdc.common.constant.CommonConstant;
import com.cm.cmdc.common.exception.BaseException;
import com.cm.cmdc.framework.service.base.vo.ArgErrorVo;
import com.cm.cmdc.framework.service.base.vo.ArgVerifMsgVo;
import com.cm.cmdc.framework.service.util.MessageUtils;

/**
 * 处理通用异常
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class BaseController {
  @Autowired
  private I18nUtils i18nUtils;

  private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

  private static final String CONTEXT_ATTRIBUTE =
      WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;

  /**
   * 用于处理通用异常
   */
  @ExceptionHandler({Exception.class})
  @ResponseBody
  @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
  protected Object exception(Exception exception, HttpServletRequest request,
      HttpServletResponse response) {
    logger.warn("got a Exception", exception);
    String message = "";
    Object result = null;
//    ServletContext servletContext = request.getServletContext();
//    WebApplicationContext context =
//        (WebApplicationContext) servletContext.getAttribute(CONTEXT_ATTRIBUTE);

    String exceptionCode = "";
    if (exception instanceof BaseException) {
      BaseException baseException = (BaseException) exception;
      exceptionCode = baseException.getCode();
      Object[] args = baseException.getValues();
      message = message
          + i18nUtils.getMessage(exceptionCode, (String[]) args, exception.getMessage(), request);
      baseException.setMessage(message);
//      result = message;
      result = MessageUtils.getResponseByMessage(message);
    } else if (exception instanceof MethodArgumentNotValidException) {
      List<FieldError> errors =
          ((MethodArgumentNotValidException) exception).getBindingResult().getFieldErrors();
      List<ArgErrorVo> list = new LinkedList<ArgErrorVo>();
      StringBuilder builder = new StringBuilder(" {\"argErrorMsg\":[") ;
      if (null != errors && !errors.isEmpty()) {
      	for(int i = 0; i < errors.size(); ++i) {
      		ArgErrorVo vo = new ArgErrorVo(errors.get(i).getField(), errors.get(i).getDefaultMessage());
      		list.add(vo);
      		if(i > 0) {
      			builder.append(",");
      		}
      		builder.append(vo.toString());
      		logger.error("Object:{}, Field:{}, Message:{} ", errors.get(i).getObjectName(), errors.get(i).getField(), errors.get(i).getDefaultMessage() );
      	}
      	builder.append("]}");
      	
        exceptionCode = CommonConstant.DEFAULT_ARG_NOT_VALID_CODE;
      }
      message = builder.toString();
      logger.error("List:[{}], message:[{}]", list, message);
      ArgVerifMsgVo argVerifMsgVo = new ArgVerifMsgVo();
      argVerifMsgVo.setArgErrorMsg(list);
      result = argVerifMsgVo;
      
      String uri = request.getRequestURI();
      
      if (StringUtils.contains(uri, "/api/")) {
      	result = MessageUtils.getResponseByMessage(message, exceptionCode);
      }
      
    } else {
      logger.error(exception.getMessage(), exception);
      message = message + "系统内部错误！" + (exception == null ? "":exception.getMessage());
      result = message;
      result = MessageUtils.getResponseByMessage(message, exceptionCode);
    }

    response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
    return result;
  }

  public I18nUtils getI18nUtils() {
    return i18nUtils;
  }
}
