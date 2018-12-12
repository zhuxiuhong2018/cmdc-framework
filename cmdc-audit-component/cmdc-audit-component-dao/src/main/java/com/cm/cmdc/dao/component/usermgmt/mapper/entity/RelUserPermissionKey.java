package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class RelUserPermissionKey implements Serializable {
    private String permissionUuid;

    private String userUuid;

    private static final long serialVersionUID = 1L;

    public String getPermissionUuid() {
        return permissionUuid;
    }

    public void setPermissionUuid(String permissionUuid) {
        this.permissionUuid = permissionUuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("RelUserPermissionKey [");
			if (permissionUuid != null) {
				builder.append("permissionUuid=");
				builder.append(permissionUuid);
				builder.append(", ");
			}
			if (userUuid != null) {
				builder.append("userUuid=");
				builder.append(userUuid);
			}
			builder.append("]");
			return builder.toString();
		}
    
}