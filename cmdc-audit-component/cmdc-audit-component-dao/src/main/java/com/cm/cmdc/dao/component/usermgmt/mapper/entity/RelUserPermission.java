package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.io.Serializable;

public class RelUserPermission extends RelUserPermissionKey implements Serializable {
    private Integer grantCode;

    private static final long serialVersionUID = 1L;

    public Integer getGrantCode() {
        return grantCode;
    }

    public void setGrantCode(Integer grantCode) {
        this.grantCode = grantCode;
    }
}