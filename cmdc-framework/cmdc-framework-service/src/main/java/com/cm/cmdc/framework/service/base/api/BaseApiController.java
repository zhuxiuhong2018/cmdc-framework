/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.framework.service.base.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cm.cmdc.common.constant.CommonConstant;
import com.cm.cmdc.common.exception.CommonException;
import com.cm.cmdc.framework.client.dto.RequestDto;
import com.cm.cmdc.framework.client.dto.ResponseDto;
import com.cm.cmdc.framework.service.base.BaseController;

/**
 * BaseApiController
 * @author zhuxiuhong
 * @since 2018年1月24日
 */
public class BaseApiController extends BaseController {
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public ResponseDto getDefaultResponseDto() {
		return new ResponseDto(CommonConstant.SUCCESS_CODE, null, "");
	}
	
	 /**
   * 拼接 返回成功的 ResponseDto
   * 
   * @param data 返回对象
   * @return ResponseDto
   */
  public ResponseDto successResponse(Object data) {
    return new ResponseDto(CommonConstant.SUCCESS_CODE, data, CommonConstant.SUCCESS_MESSAGE);
  }

  /**
   * 判断 requestDto.data() 是否为null , 为空即抛出异常
   * 
   * @param requestDto void
   */
  public void assertRequestDtoData(RequestDto<?> requestDto) throws CommonException {
    if (requestDto == null || requestDto.getData() == null) {
      logger.error("data 字段不能为空!!! requestDto = {}", requestDto);
      throw new CommonException( "ErrorCodeConstant.COMMON_DATA_NULL");
    }
  }


  /**
   * 检查插入数据库的返回结果.
   * 
   * @param cnt 插入行数
   * @throws MdmException 小于等于0时，抛出错误
   */
  public void assertInsertResult(int cnt) throws CommonException {
    assertInsertResult(cnt, 1);
  }

  /**
   * 检查插入数据库或更新的返回结果.
   * 
   * @Methods Name assertInsertResult
   * @Create In 2018年3月16日 By zhuxiuhong
   * @param cnt
   * @param targetLineCnt
   * @throws MdmException void
   */
  public void assertInsertResult(int cnt, int targetLineCnt) throws CommonException {
    if (cnt < targetLineCnt) {
      logger.error("数据插入失败, 目标影响行数: " + targetLineCnt + ", 实际影响行数: " + cnt);
      throw new CommonException("ErrorCodeConstant.COMMON_INSERT_FAILED");
    }
  }

  /**
   * 检查更新数据库的返回结果.
   * 
   * @param cnt 更新数量
   * @throws MdmException 小于等于0时，抛出错误
   */
  public  void assertUpdateResult(int cnt) throws CommonException {
    assertUpdateResult(cnt, 1);
  }

  /**
   * 检查更新的行数是否符合期望.
   * 
   * @Methods Name assertUpdateResult
   * @Create In 2018年3月16日 By zhuxiuhong
   * @param line
   * @throws MdmException void
   */
  public void assertUpdateResult(int cnt, int targetLineCnt) throws CommonException {
    if (cnt < targetLineCnt) {
      logger.error("数据更新失败, 目标影响行数: " + targetLineCnt + ", 实际影响行数: " + cnt);
      throw new CommonException("ErrorCodeConstant.COMMON_UPDATE_FAILED");
    }
  }

}
