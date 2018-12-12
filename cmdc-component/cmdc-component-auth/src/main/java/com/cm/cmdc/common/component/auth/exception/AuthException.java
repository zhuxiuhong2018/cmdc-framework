/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.auth.exception;

import com.cm.cmdc.common.exception.CommonException;

/**
 * 认证与鉴权组件异常定义
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class AuthException extends CommonException {

  /**
   * @Field long serialVersionUID 
   */
  private static final long serialVersionUID = 1L;

  /**
   * @param message
   */
  public AuthException(String message) {
    super(message);
  }
  
  /**
   * @param message
   */
  public AuthException(String message, Throwable cause) {
    super(null, message, null, cause);
  }

  /**
   * @param code
   * @param message
   */
  public AuthException(String code, String message) {
    super(code, message);
  }

  /**
   * @param code
   * @param message
   * @param values
   * @param cause
   */
  public AuthException(String code, String message, Object[] values, Throwable cause) {
    super(code, message, values, cause);
  }

}
