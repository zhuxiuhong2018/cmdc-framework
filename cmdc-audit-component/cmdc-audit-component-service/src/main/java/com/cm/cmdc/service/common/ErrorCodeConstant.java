/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.cm.cmdc.service.common;

/**
 * 错误代码类
 * 
 * @author zhengzhenfu
 * @since 2018年1月16日
 */
public class ErrorCodeConstant {

  private ErrorCodeConstant() {}


  /**
   * 不能所有的条件都为空, 至少需要设置一个条件
   */
  public static final String COMMON_ALL_CONDITIONS_NULL = "common.allConditions.null";

  /**
   * 需要再另外设置一个或多个条件.
   */
  public static final String COMMON_OTHER_CONDITIONS_NULL = "common.otherConditions.null";

 
  /**
   * uuid 不能为空.
   */
  public static final String COMMON_UUID_NULL = "common.uuid.null";
  
  /**
   * 人员 uuid 不能为空.
   */
  public static final String COMMON_USER_UUID_NULL = "common.user.uuid.null";

  /**
   * 数据不能为空.
   */
  public static final String COMMON_DATA_NULL = "common.data.null";

  /**
   * 条件不能为空. 未传 data
   */
  public static final String COMMON_CONDITION_NULL = "common.condition.null";


  /**
   * 数据插入失败.
   */
  public static final String COMMON_INSERT_FAILED = "common.insert.failed";
  /**
   * 数据更新失败.
   */
  public static final String COMMON_UPDATE_FAILED = "common.update.failed";
  /**
   * 数据删除失败.
   */
  public static final String COMMON_DELETE_FAILED = "common.delete.failed";

}
