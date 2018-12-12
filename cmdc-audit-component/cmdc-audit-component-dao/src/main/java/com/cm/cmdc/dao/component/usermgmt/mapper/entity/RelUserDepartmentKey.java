package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class RelUserDepartmentKey implements Serializable {
    private String deptUuid;

    private String userUuid;

    private static final long serialVersionUID = 1L;

    public String getDeptUuid() {
        return deptUuid;
    }

    public void setDeptUuid(String deptUuid) {
        this.deptUuid = deptUuid;
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
			builder.append("RelUserDepartmentKey [");
			if (deptUuid != null) {
				builder.append("deptUuid=");
				builder.append(deptUuid);
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