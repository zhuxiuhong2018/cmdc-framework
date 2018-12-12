package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseRole implements Serializable {
    private String uuid;

    private String roleName;

    private String memo;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
			builder.append("BaseRole [");
			if (uuid != null) {
				builder.append("uuid=");
				builder.append(uuid);
				builder.append(", ");
			}
			if (roleName != null) {
				builder.append("roleName=");
				builder.append(roleName);
				builder.append(", ");
			}
			if (memo != null) {
				builder.append("memo=");
				builder.append(memo);
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