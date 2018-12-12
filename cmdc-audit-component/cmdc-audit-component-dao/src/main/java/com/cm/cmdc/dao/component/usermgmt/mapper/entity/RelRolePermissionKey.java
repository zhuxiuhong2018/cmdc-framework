package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class RelRolePermissionKey implements Serializable {
    private String permissionUuid;

    private String roleUuid;

    private static final long serialVersionUID = 1L;

    public String getPermissionUuid() {
        return permissionUuid;
    }

    public void setPermissionUuid(String permissionUuid) {
        this.permissionUuid = permissionUuid;
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
			builder.append("RelRolePermissionKey [");
			if (permissionUuid != null) {
				builder.append("permissionUuid=");
				builder.append(permissionUuid);
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