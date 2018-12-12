package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class RelUserDepartment extends RelUserDepartmentKey implements Serializable {
    private Short userType;

    private static final long serialVersionUID = 1L;

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("RelUserDepartment [");
			if (userType != null) {
				builder.append("userType=");
				builder.append(userType);
			}
			builder.append("]");
			return builder.toString();
		}
    
}