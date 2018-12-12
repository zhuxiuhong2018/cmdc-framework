package com.cm.cmdc.framework.service.base.vo;

public class ArgErrorVo {
	private String field;
	private String message;
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		if(field == null) {
			field = "";
		}
		this.field = field.trim();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		if(message == null) {
			message = "";
		}
		this.message = message.trim().replace("\"", "\\\"");
	}
	
	
	
	public ArgErrorVo() {
		super();
	}
	
	public ArgErrorVo(String field, String message) {
		super();
		setField(field);
		setMessage(message);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		if (field != null) {
			builder.append("\"field\":\"");
			builder.append(field);
			builder.append("\", ");
		}
		if (message != null) {
			builder.append("\"message\":\"");
			builder.append(message);
			builder.append("\" ");
		}
		builder.append("}");
		return builder.toString();
	}

	
}
