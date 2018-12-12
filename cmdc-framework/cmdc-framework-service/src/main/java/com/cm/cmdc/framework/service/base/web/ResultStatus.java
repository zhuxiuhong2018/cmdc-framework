package com.cm.cmdc.framework.service.base.web;

public enum ResultStatus {
	
	/**
	 * 返回成功
	 */
	OK("200", "OK","成功"),
	
	/**
	 * 业务抛出异常
	 */
	BUSINESS_ERROR("1000", "Business Error","业务类异常"),
	
	/**
	 * 参数数据校验异常
	 */
	VALIDATION_ERROR("1100","Validation Error","参数数据验证异常"),
	
	/**
	 * 认证异常
	 */
	AUTHENTICATION_ERROR("1200","Authentication Error","身份认证异常"),
	
	/**
	 * 请求错误
	 */
	REQUEST_ERROR("1300", "Request Error","客户端发送的请求异常"),
	/**
	 * 参数数量异常
	 */
	REQUEST_PARAM_ERROR("1400", "Request Param Error","客户端发送的请求参数异常"),
	/**
	 * 参数类型转换异常
	 */
	REQUEST_PARAM_TRANSFER_ERROR("1500", "Request Param Transfer Error","客户端发送的请求数据在服务器转换异常"),
	
	/**
	 * 系统抛出异常
	 */
	SYSTEM_ERROR("2000", "System Error","系统抛出的其他未知异常");
	
	private final String value;
	
	private final String message;
	
	private final String reasonPhrase;

	private ResultStatus(String value, String reasonPhrase, String message) {
		this.value = value;
		this.message = message;
		this.reasonPhrase = reasonPhrase;
	}

	public String value() {
		return this.value;
	}
	
	public String message() {
		return this.message;
	}
	
	public String getReasonPhrase() {
		return reasonPhrase;
	}
	
	public static ResultStatus valueOf(int statusCode) {
		for (ResultStatus status : ResultStatus.values()) {
			if (status.value .equals( statusCode )) {
				return status;
			}
		}
		throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
	}
}
