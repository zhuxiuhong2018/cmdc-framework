/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.auth.web;

import com.cm.cmdc.common.component.auth.dto.User;

/**
 * Security Context
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class SecurityContext {

  private static ThreadLocal<User> userThreadLocal = new ThreadLocal<>();
  private static ThreadLocal<String> tokenLocal = new ThreadLocal<>();
  private static ThreadLocal<String> frontTypeLocal = new ThreadLocal<>();

  private SecurityContext() {

  }

  public static String getUserId() {
    return getUserPrincipal() != null ? getUserPrincipal().getUserId() : null;
  }

  public static String getUserName() {
    return getUserPrincipal() != null ? getUserPrincipal().getUserName() : null;
  }

  public static User getUserPrincipal() {
    return userThreadLocal.get();
  }

  public static void setUserPrincipal(User user) {
    userThreadLocal.set(user);
  }

  public static String getToken() {
    return tokenLocal.get();
  }

  public static void setToken(String token) {
    tokenLocal.set(token);
  }

  public static String getFrontType() {
    return frontTypeLocal.get();
  }

  public static void setFrontType(String frontType) {
    frontTypeLocal.set(frontType);
  }

}
