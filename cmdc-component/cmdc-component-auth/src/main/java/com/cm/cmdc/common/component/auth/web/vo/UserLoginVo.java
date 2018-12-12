/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.auth.web.vo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * UserLoginDto
 * 
 * @author zhuxiuhong
 * @since 2018年1月4日
 */
public class UserLoginVo {

	@NotBlank
	@Length(min = 2, max = 32)
	private String userId;
	@NotBlank
	@Length(max = 32)
	private String password;
	
	@Length(max = 10)
	private String verifycode;
	
	private String userType;

	public UserLoginVo() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifycode() {
		return verifycode;
	}

	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserLoginVo [");
		if (userId != null) {
			builder.append("userId=");
			builder.append(userId);
			builder.append(", ");
		}
		if (password != null) {
			builder.append("password=");
			builder.append(password);
			builder.append(", ");
		}
		if (verifycode != null) {
			builder.append("verifycode=");
			builder.append(verifycode);
			builder.append(", ");
		}
		if (userType != null) {
			builder.append("userType=");
			builder.append(userType);
		}
		builder.append("]");
		return builder.toString();
	}

	
	
}
