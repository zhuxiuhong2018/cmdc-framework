package com.cm.cmdc.framework.service.base.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class IdentityUtils {

    public final static String identity_key = "current_employee";
    public final static String identity_perm_key = "current_employee_perms";

    public static void put(HttpServletRequest request, EmployeeVo employee) {
        request.getSession().setAttribute(identity_key, employee);
    }

    public static EmployeeVo get(HttpServletRequest request) {
        return (EmployeeVo) request.getSession().getAttribute(identity_key);
    }

    public static void clear(HttpServletRequest request) {
        request.getSession().removeAttribute(identity_key);
        // request.getSession().invalidate();
    }

    public static void putPerms(HttpServletRequest request, Map<String, String> perms) {
        request.getSession().setAttribute(identity_perm_key, perms);
    }

    @SuppressWarnings("unchecked")
    public static Map<String, String> getPerms(HttpServletRequest request) {
        return (Map<String, String>) request.getSession().getAttribute(identity_perm_key);
    }

    public static void clearPerms(HttpServletRequest request) {
        request.getSession().removeAttribute(identity_perm_key);
        // request.getSession().invalidate();
    }
}
