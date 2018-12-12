/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.framework.client.vo;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;

/**
 * @Author zhuxiuhong
 * @since 2018
 */
public class UuidListVo implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private List<String> uuidList;
  
	public List<String> getUuidList() {
		return uuidList;
	}
	
	public void setUuidList(List<String> uuidList) {
		this.uuidList = uuidList;
	}
  
}
