/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.service.common;

import com.cm.cmdc.common.exception.CommonException;

/**
 * @Author zhuxiuhong
 * @Since 2018年12月9日 下午9:58:35
 * 
 *        UserMgmt 的错误异常
 */
public class AuditExctption extends CommonException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param code
	 */
	public AuditExctption(String code) {
		super(code);
	}

}
