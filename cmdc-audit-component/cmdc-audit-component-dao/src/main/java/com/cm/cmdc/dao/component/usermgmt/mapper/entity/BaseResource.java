package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseResource implements Serializable {
    private String uuid;

    private Short resourceType;

    private String resourceName;

    private String serviceId;

    private Short isVisible;

    private Short sortId;

    private String parentUuid;

    private Short deleteFlag;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Short getResourceType() {
        return resourceType;
    }

    public void setResourceType(Short resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Short getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Short isVisible) {
        this.isVisible = isVisible;
    }

    public Short getSortId() {
        return sortId;
    }

    public void setSortId(Short sortId) {
        this.sortId = sortId;
    }

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("BaseResource [");
			if (uuid != null) {
				builder.append("uuid=");
				builder.append(uuid);
				builder.append(", ");
			}
			if (resourceType != null) {
				builder.append("resourceType=");
				builder.append(resourceType);
				builder.append(", ");
			}
			if (resourceName != null) {
				builder.append("resourceName=");
				builder.append(resourceName);
				builder.append(", ");
			}
			if (serviceId != null) {
				builder.append("serviceId=");
				builder.append(serviceId);
				builder.append(", ");
			}
			if (isVisible != null) {
				builder.append("isVisible=");
				builder.append(isVisible);
				builder.append(", ");
			}
			if (sortId != null) {
				builder.append("sortId=");
				builder.append(sortId);
				builder.append(", ");
			}
			if (parentUuid != null) {
				builder.append("parentUuid=");
				builder.append(parentUuid);
				builder.append(", ");
			}
			if (deleteFlag != null) {
				builder.append("deleteFlag=");
				builder.append(deleteFlag);
				builder.append(", ");
			}
			if (createTime != null) {
				builder.append("createTime=");
				builder.append(createTime);
				builder.append(", ");
			}
			if (updateTime != null) {
				builder.append("updateTime=");
				builder.append(updateTime);
				builder.append(", ");
			}
			if (createUser != null) {
				builder.append("createUser=");
				builder.append(createUser);
				builder.append(", ");
			}
			if (updateUser != null) {
				builder.append("updateUser=");
				builder.append(updateUser);
			}
			builder.append("]");
			return builder.toString();
		}
    
}