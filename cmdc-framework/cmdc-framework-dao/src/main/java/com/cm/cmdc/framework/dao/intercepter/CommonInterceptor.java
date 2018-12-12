/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.framework.dao.intercepter;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cm.cmdc.common.component.auth.dto.User;
import com.cm.cmdc.common.component.auth.web.SecurityContext;

/**
 * 公共字段持久化拦截器
 * 
 * @author zhuxiuhong
 * @since 2018
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class,
    Object.class})})
@Component
public class CommonInterceptor implements Interceptor {

  private static final Logger logger = LoggerFactory.getLogger(CommonInterceptor.class);

  /**
   * 拦截插入和更新操作，更新公共字段值
   */
  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    int sqlType = 0;
    Object[] args = invocation.getArgs();
    for (int i = 0; i < args.length; i++) {
      Object arg = args[i];
      if (null == arg) {
        logger.info("arg[" + i + "] is null, continue");
      } else if (arg instanceof MappedStatement) {
        MappedStatement ms = (MappedStatement) arg;
        SqlCommandType sqlCommandType = ms.getSqlCommandType();
        if (sqlCommandType == SqlCommandType.INSERT) {
          sqlType = 1;  // 插入
        } else if (sqlCommandType == SqlCommandType.UPDATE) {
          sqlType = 2;  // 删除 
        } else {
          break;
        }
      } else {
        if (0 == sqlType) {
          continue;
        }
        if (arg instanceof Map) {
          Map<?, ?> map = (Map<?, ?>) arg;
          if (map.isEmpty()) {
            continue;
          }
          Collection<?> list = map.values();
          for (Object obj : list) {
            if (!(obj instanceof Collection)) {
              updateCommonFiled(obj, sqlType);
              continue;
            }
            Collection<?> entityList = (Collection<?>) obj;
            if (CollectionUtils.isEmpty(entityList)) {
              continue;
            }
            for (Object entity : entityList) {
              updateCommonFiled(entity, sqlType);
            }
          }
        } else {
          updateCommonFiled(arg, sqlType);
        }
      }
    }
    return invocation.proceed();
  }

  /**
   * 更新公共字段值
   * 
   * @param arg
   * @param sqlType void
   */
  private void updateCommonFiled(Object arg, int sqlType) {
    Date currentDate = new Date();
    updateCommonFiled(arg, "UpdateTime", currentDate, Date.class);
    
    String userId = "administator";
    User user = SecurityContext.getUserPrincipal();
    if (user != null) {
      if (StringUtils.isNotBlank(user.getUserId())) {
        userId = user.getUserId();
      }
    } else {
      logger.warn("login user is null");
    }
    updateCommonFiled(arg, "UpdateUser", userId, String.class);
    if (1 == sqlType) {
      updateCommonFiled(arg, "CreateTime", currentDate, Date.class);
      updateCommonFiled(arg, "CreateUser", userId, String.class);
    }
  }

  /**
   * 
   * @param arg
   * @param clazz
   * @param currentDate void
   */
  private void updateCommonFiled(Object arg, String filedName, Object filedValue, Class<?> cla) {
    Class<? extends Object> clazz = arg.getClass();
    try {
      Method getFiled = clazz.getDeclaredMethod("get" + filedName);
      Method setFiled = clazz.getDeclaredMethod("set" + filedName, cla);
      
      if(getFiled == null || setFiled == null) {
      	return;
      }
      
      Object value = getFiled.invoke(arg);
      
      if ((cla == Date.class && null == value && null != filedValue)   // 
          || (cla == String.class && StringUtils.isBlank((String) value) //
          && StringUtils .isNotBlank((String) filedValue))) {
      	try {
      		setFiled.invoke(arg, filedValue);
				} catch (Exception e) {
					logger.error("updateCommonFiled happend Exception: {} ", e.getMessage());
				}
      }
    } catch (Throwable e) {
      //logger.info(String.format("Java反射调用失败,调用类%s中没有 get%s或 set%s方法", clazz.getName(), filedName,
      //    filedName));
    }
  }

  @Override
  public Object plugin(Object target) {
    return Plugin.wrap(target, this);
  }

  @Override
  public void setProperties(Properties properties) {
    // Do nothing
  }
}
