/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.auth.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于返回用户所拥有的角色,服务资源,应用程序资源和菜单按钮资源
 * 
 * @author zhuxiuhong
 * @since 2017年12月29日
 */
public class User implements Serializable {
  /**
   * @Field long serialVersionUID
   */
  private static final long serialVersionUID = 1L;
  /**
   * 用户 uuid
   */
  private String uuid;
  /**
   * 状态: 1: 启用, 0: 停用.
   */
  private String status;
  /**
   * 用户ID
   */
  private String userId;
  /**
   * 用户名称
   */
  private String userName;
  /**
   * 部门
   */
  private String department;
  /**
   * 手机号
   */
  private String phone;
  
  /**
   * 用户的角色
   */
  private List<Role> roles;
  /**
   * 他拥有的 serverIds列表.
   */
  private List<String> serviceIds = new ArrayList<String>();
  /**
   * 他拥有的 uiResources 权限列表.
   */
  private List<UIResource> uiResources = new ArrayList<UIResource>();
  
  /**
   * 
   */
  private String token;
  

  public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public List<String> getServiceIds() {
    return serviceIds;
  }

  public void setServiceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
  }

  /**
   * @Return the List<UIResource> uiResources
   */
  public List<UIResource> getUiResources() {
    return uiResources;
  }

  /**
   * @Param List<UIResource> uiResources to set
   */
  public void setUiResources(List<UIResource> uiResources) {
    this.uiResources = uiResources;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "User [status=" + status + ", userId=" + userId + ", userName=" + userName
        + ", department=" + department + ", uuid=" + uuid + ", phone=" + phone 
        +  ", roles=" + roles + ", serviceIds=" + serviceIds + ", uiResources="
        + uiResources + "]";
  }
}
