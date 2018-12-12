/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.constant;

/**
 * Common Constant
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public final class CommonConstant {

	private CommonConstant() {
	}

	/**
	 * 查询用户权限的uri
	 */
	public static final String URI_QUERY_USER_AUTHORITY = "/queryUserAuthority";
	public static final String DEFAULT_USERMGNT_SERVER_URI = "/api/user" + URI_QUERY_USER_AUTHORITY;

	// authentication & authorization
	public static final String REDIS_KEY_SSO_ADMIN_TOKEN = "AUTH:sso_admin_token";
	public static final String REDIS_KEY_SSO_ADMIN_TOKEN_RANDOM_KEY = "AUTH:sso_admin_token_random_key";

	public static final String REDIS_KEY_USER_LOGIN_RANDOM_KEY = "AUTH:sso_user_login_random_key";

	public static final String REDIS_KEY_SSO_USER = "AUTH:sso_user_";
	public static final int JWT_MAX_AGE_MINUTES = 60 * 24 * 7;
	public static final int JWT_ONE_STEP_MINUTES = 2 * 30; // token 60 分钟有效
	public static final String TOKEN_COOKIE_NAME = "jwt-token";

	// error code
	public static final String SUCCESS_CODE = "00000";
	public static final String DEFAULT_SYS_ERROR_CODE = "00099";
	public static final String DEFAULT_ARG_NOT_VALID_CODE = "00098";
	public static final String DEFAULT_SYS_ERROR_MSG = "00099:系统内部错误";

	// system code
	public static final String FRAMEWORK_SYS_CODE = "COMMON";

	// front_type
	public static final String FRONT_TYPE = "FrontType";

	// message_key_internal_error
	public static final String MESSAGE_KEY_INTERNAL_ERROR = "framework.auth.login.internal.error";
//	public static final String DEFAULT_COURTUUID = "00000000000000000000000000000000";
//	public static final String REDIS_KEY_CURRENT_COURTUUID = "AUTH:courtuuid";

	/**
	 * 成功消息
	 */
	public static final String SUCCESS_MESSAGE = "success";

	/**
	 * 分页查询每页最大数量
	 */
	public static final int MAX_PAGE_SIZE = 1000;
	// 默认分页数
	public static final int DEFALUT_PAGE_SIZE = 10;
	// 默认分页数
	public static final int MIN_PAGE_SIZE = 1;
	// 默认当前页. 
	public static final int MIN_CURRENT_PAGE = 1;

	/**
	 * 是否启用.
	 */
	public static final short ENABLE_FLAG_EN = 1;
	/**
	 * 已禁用
	 */
	public static final short ENABLE_FLAG_DIS = 0;

	/**
	 * 未删除
	 */
	public static final short DELETE_FLAG_UN_DEL = 0;

	/**
	 * 已删除.
	 */
	public static final short DELETE_FLAG_YES = 1;

	/**
	 * 批量操作的阈值
	 */
	public static final int MAX_BATCH_INSERT_VALUE = 600;

	public static final String MSG_START = "start: ";
	public static final String MSG_END = "end: ";

	/**
	 * 通用 uri 路径.
	 */
	public static final String URL_GET_DATA_BY_UUIDS = "/getDataByUuids";
	public static final String URL_GET_DATA_BY_CONDITIONS = "/getDataByConditions";
	public static final String URL_INSERT = "/insert";
	public static final String URL_UPDATE = "/update";
	public static final String URL_DELETE = "/delete";
	public static final String URL_BATCH_DELETE = "/batchDelete";
	public static final String URL_API = "/api/";

	/**
	 * 通用 uri 批量操作.
	 */
	public static final String URL_BATCH_OPERATION = "/batchOperation";
	/**
	 * 通用 uri 从Excel 导入, 导出.
	 */
	public static final String URL_IMPORT = "/import";
	public static final String URL_EXPORT = "/export";

	/**
	 * MQ Code: 扫描权限列表的广播
	 */
	public static final String MQ_CODE_FANOUT_SCAN_PERMISSION = "MQ_CODE_FANOUT_SCAN_PERMISSION";
	// public static final String BEGING_SCAN_AUTHORITY_OPERATE = "BEGING_SCAN_AUTHORITY_OPERATE";
	// public static final String SCAN_AUTHORITY_OPERATE = "SCAN_AUTHORITY_OPERATE";
	// public static final String QUEUE_AUTHORITY_OPERATE_UPLOAD = "QUEUE_AUTHORITY_OPERATE_UPLOAD";

	/////////////////////////////////
	public static final String ROLE_NAME_SYS_ADMIN = "sys_admin";

	public static final int ROLE_GRANT_CODE_ALLOW = 1; // 允许.
	public static final int ROLE_GRANT_CODE_DEFAULT = 0; // 默认权限.
	public static final int ROLE_GRANT_CODE_REJECT = -1; // 拒绝.
}
