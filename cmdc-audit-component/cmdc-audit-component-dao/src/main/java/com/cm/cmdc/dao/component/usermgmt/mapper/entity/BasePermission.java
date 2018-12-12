package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class BasePermission implements Serializable {
    private String uuid;

    private String projectName;

    private String fullUrl;

    private String memo;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("BasePermission [");
			if (uuid != null) {
				builder.append("uuid=");
				builder.append(uuid);
				builder.append(", ");
			}
			if (projectName != null) {
				builder.append("projectName=");
				builder.append(projectName);
				builder.append(", ");
			}
			if (fullUrl != null) {
				builder.append("fullUrl=");
				builder.append(fullUrl);
				builder.append(", ");
			}
			if (memo != null) {
				builder.append("memo=");
				builder.append(memo);
			}
			builder.append("]");
			return builder.toString();
		}
    
    
}