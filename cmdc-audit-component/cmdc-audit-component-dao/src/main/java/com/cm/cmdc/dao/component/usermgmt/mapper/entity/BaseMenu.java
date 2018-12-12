package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseMenu implements Serializable {
    private String uuid;

    private String title;

    private String serviceId;

    private String icon;

    private String parentUuid;

    private Short isVisible;

    private Short sortId;

    private Short deleteFlag;

    private String memo;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
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

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
			builder.append("BaseMenu [");
			if (uuid != null) {
				builder.append("uuid=");
				builder.append(uuid);
				builder.append(", ");
			}
			if (title != null) {
				builder.append("title=");
				builder.append(title);
				builder.append(", ");
			}
			if (serviceId != null) {
				builder.append("serviceId=");
				builder.append(serviceId);
				builder.append(", ");
			}
			if (icon != null) {
				builder.append("icon=");
				builder.append(icon);
				builder.append(", ");
			}
			if (parentUuid != null) {
				builder.append("parentUuid=");
				builder.append(parentUuid);
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
			if (deleteFlag != null) {
				builder.append("deleteFlag=");
				builder.append(deleteFlag);
				builder.append(", ");
			}
			if (memo != null) {
				builder.append("memo=");
				builder.append(memo);
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