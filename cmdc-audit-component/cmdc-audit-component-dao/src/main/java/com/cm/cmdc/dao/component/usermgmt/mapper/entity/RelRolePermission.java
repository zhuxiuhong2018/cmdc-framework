package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class RelRolePermission extends RelRolePermissionKey implements Serializable {
    private Integer grantCode;

    private static final long serialVersionUID = 1L;

    public Integer getGrantCode() {
        return grantCode;
    }

    public void setGrantCode(Integer grantCode) {
        this.grantCode = grantCode;
    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("RelRolePermission [");
			if (grantCode != null) {
				builder.append("grantCode=");
				builder.append(grantCode);
			}
			builder.append("]");
			return builder.toString();
		}
    
}