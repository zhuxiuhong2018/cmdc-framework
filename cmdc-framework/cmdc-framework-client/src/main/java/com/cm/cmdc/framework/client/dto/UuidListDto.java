/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.framework.client.dto;

import java.util.List;

/**
 * @Author zhuxiuhong
 * @since 2018
 */
public class UuidListDto extends BaseBusinessDto{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> uuidList;
  
	public List<String> getUuidList() {
		return uuidList;
	}
	
	public void setUuidList(List<String> uuidList) {
		this.uuidList = uuidList;
	}
  
}
