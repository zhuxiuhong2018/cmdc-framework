/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.framework.client.dto;

/**
 * @Author zhuxiuhong
 * @since 2018
 */
public class UuidDto extends BaseBusinessDto{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String uuid;

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
   
}
