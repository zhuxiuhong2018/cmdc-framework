/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.framework.client.vo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Author zhuxiuhong
 * @since 2018
 */
abstract public class AbsCommonVo implements Serializable{
	 private static final long serialVersionUID = -1L;

	  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	  private Date createTime;

	  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	  private Date updateTime;

	  private String createUser;

	  private String updateUser;

	  /**
	   * @Return the Date createTime
	   */
	  public Date getCreateTime() {
	    return createTime;
	  }

	  /**
	   * @Param Date createTime to set
	   */
	  public void setCreateTime(Date createTime) {
	    this.createTime = createTime;
	  }

	  /**
	   * @Return the Date updateTime
	   */
	  public Date getUpdateTime() {
	    return updateTime;
	  }

	  /**
	   * @Param Date updateTime to set
	   */
	  public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	  }

	  /**
	   * @Return the String createUser
	   */
	  public String getCreateUser() {
	    return createUser;
	  }

	  /**
	   * @Param String createUser to set
	   */
	  public void setCreateUser(String createUser) {
	    this.createUser = createUser;
	  }

	  /**
	   * @Return the String updateUser
	   */
	  public String getUpdateUser() {
	    return updateUser;
	  }

	  /**
	   * @Param String updateUser to set
	   */
	  public void setUpdateUser(String updateUser) {
	    this.updateUser = updateUser;
	  }

	  @Override
	  public String toString() {
	    return new ToStringBuilder(this).appendSuper(super.toString()).append("createTime", createTime)
	        .append("updateTime", updateTime).append("createUser", createUser)
	        .append("updateUser", updateUser).toString();
	  }

}
