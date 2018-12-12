/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.client.component.usermgmt.condition_dto;

import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

import com.cm.cmdc.framework.client.dto.AbsPageConditionDto;

/**
 * @Author zhuxiuhong
 * @Since 2018年12月9日 下午9:32:20
 * 
 *        人员表查询条件. update或删除的条件.
 */
public class BaseUserConditionDto extends AbsPageConditionDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(min= 32, max = 32)
	private String userId;

	private String userName;

	private String password;

	private String phone;

	private String email;

	private String deptId;

	private String department;

	private String station;

	private Date birth;

	private String gender;

	private String focusOn;

	@Min(55)
	private Short idenType;

	private String idenNum;

	private Short status;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public String getFocusOn() {
		return focusOn;
	}

	public void setFocusOn(String focusOn) {
		this.focusOn = focusOn;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseUserConditionDto [");
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
		if (department != null) {
			builder.append("department=");
			builder.append(department);
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
		if (focusOn != null) {
			builder.append("focusOn=");
			builder.append(focusOn);
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
		}
		builder.append("]");
		return builder.toString();
	}

}
