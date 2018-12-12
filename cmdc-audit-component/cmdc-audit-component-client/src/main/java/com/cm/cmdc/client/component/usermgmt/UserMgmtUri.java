/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.cm.cmdc.client.component.usermgmt;

import com.cm.cmdc.common.constant.CommonConstant;

/**
 * ApiUrl 常量类
 * 
 * @Author zhuxiuhong
 * @Create In 2018年01月25日
 */
public class UserMgmtUri {

  private UserMgmtUri() {}

  /**
   * 组织相关的服务 url
   */
  public static final String COMPONENT_NAME = "cmdc-usermgmt-component";
  
  public static final String CMDC_USER = "/user";
  public static final String API_USER = CommonConstant.URL_API + CMDC_USER;
  
  /**
   * 根据条件查询组织
   */
  public static final String API_USER_GET_DATA_BY_CONDITIONS = API_USER + CommonConstant.URL_GET_DATA_BY_CONDITIONS;
  public static final String API_USER_GET_DATA_BY_UUIDS = API_USER + CommonConstant.URL_GET_DATA_BY_UUIDS;
  
  public static final String AIP_USER_UPDATE = API_USER + CommonConstant.URL_UPDATE;
  public static final String AIP_USER_DELETE = API_USER + CommonConstant.URL_DELETE;
  
  /**
   * 
   */
  public static final String USER_GET_DATA_BY_CONDITIONS = CMDC_USER + CommonConstant.URL_GET_DATA_BY_CONDITIONS;
  public static final String USER_GET_DATA_BY_UUIDS = CMDC_USER + CommonConstant.URL_GET_DATA_BY_UUIDS;
  
  public static final String USER_INSERT = CMDC_USER + CommonConstant.URL_INSERT;
  public static final String USER_UPDATE = CMDC_USER + CommonConstant.URL_UPDATE;
  public static final String USER_DELETE = CMDC_USER + CommonConstant.URL_DELETE;
  
  
  
}

