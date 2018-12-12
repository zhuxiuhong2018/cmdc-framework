package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class RelUserRoleKey implements Serializable {
    private String userUuid;

    private String roleUuid;

    private static final long serialVersionUID = 1L;

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid;
    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("RelUserRoleKey [");
			if (userUuid != null) {
				builder.append("userUuid=");
				builder.append(userUuid);
				builder.append(", ");
			}
			if (roleUuid != null) {
				builder.append("roleUuid=");
				builder.append(roleUuid);
			}
			builder.append("]");
			return builder.toString();
		}
    
}