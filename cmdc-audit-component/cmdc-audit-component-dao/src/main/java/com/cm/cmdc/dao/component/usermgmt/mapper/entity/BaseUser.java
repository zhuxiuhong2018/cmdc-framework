package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseUser implements Serializable {
    private String uuid;

    private String userId;

    private String userName;

    private String password;

    private String phone;

    private String email;

    private String deptId;

    private String deptName;

    private String station;

    private Date birth;

    private String gender;

    private Short idenType;

    private String idenNum;

    private Short status;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Short getIdenType() {
        return idenType;
    }

    public void setIdenType(Short idenType) {
        this.idenType = idenType;
    }

    public String getIdenNum() {
        return idenNum;
    }

    public void setIdenNum(String idenNum) {
        this.idenNum = idenNum;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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
			builder.append("BaseUser [");
			if (uuid != null) {
				builder.append("uuid=");
				builder.append(uuid);
				builder.append(", ");
			}
			if (userId != null) {
				builder.append("userId=");
				builder.append(userId);
				builder.append(", ");
			}
			if (userName != null) {
				builder.append("userName=");
				builder.append(userName);
				builder.append(", ");
			}
			if (password != null) {
				builder.append("password=");
				builder.append(password);
				builder.append(", ");
			}
			if (phone != null) {
				builder.append("phone=");
				builder.append(phone);
				builder.append(", ");
			}
			if (email != null) {
				builder.append("email=");
				builder.append(email);
				builder.append(", ");
			}
			if (deptId != null) {
				builder.append("deptId=");
				builder.append(deptId);
				builder.append(", ");
			}
			if (deptName != null) {
				builder.append("deptName=");
				builder.append(deptName);
				builder.append(", ");
			}
			if (station != null) {
				builder.append("station=");
				builder.append(station);
				builder.append(", ");
			}
			if (birth != null) {
				builder.append("birth=");
				builder.append(birth);
				builder.append(", ");
			}
			if (gender != null) {
				builder.append("gender=");
				builder.append(gender);
				builder.append(", ");
			}
			if (idenType != null) {
				builder.append("idenType=");
				builder.append(idenType);
				builder.append(", ");
			}
			if (idenNum != null) {
				builder.append("idenNum=");
				builder.append(idenNum);
				builder.append(", ");
			}
			if (status != null) {
				builder.append("status=");
				builder.append(status);
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