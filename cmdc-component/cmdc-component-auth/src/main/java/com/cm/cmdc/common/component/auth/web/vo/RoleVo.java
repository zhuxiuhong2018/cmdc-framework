/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.auth.web.vo;

import java.io.Serializable;

/**
 * RoleVo
 * 
 * @author zhuxiuhong
 * @since 2018年1月15日
 */
public class RoleVo implements Serializable {
	/**
	 * @Field long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String roleId = "";
	private String roleName = "";

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

}
