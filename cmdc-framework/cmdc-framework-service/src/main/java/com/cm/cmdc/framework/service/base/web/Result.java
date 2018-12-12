package com.cm.cmdc.framework.service.base.web;

public class Result<T> {
	/**
	 * 处理状态,@see ResultStatus
	 */
	private String status;
	/**
	 * 处理结果数据
	 */
	private T data;
	/**
	 * 处理结果代码
	 */
	private String code;
	/**
	 * 处理结果描述
	 */
	private String message;
	
	private Object extend;

	
	public Result() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getExtend() {
		return extend;
	}

	public void setExtend(Object extend) {
		this.extend = extend;
	}
	
	
}
