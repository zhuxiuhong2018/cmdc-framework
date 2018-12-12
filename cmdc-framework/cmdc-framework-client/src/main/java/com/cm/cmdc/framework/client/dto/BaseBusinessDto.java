/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.framework.client.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.cm.cmdc.common.component.utils.JsonUtil;

/**
 * BaseBusinessDto
 * @author zhuxiuhong
 * @since 2018
 */
public class BaseBusinessDto implements Serializable {

	/**
	 * @Field long serialVersionUID
	 */
	private static final long serialVersionUID = -806096574275586422L;
	private String businessId;
	private String sourceSysId;
	private String targetSysId;
	private Map<String, Object> extAttributes = new HashMap<String, Object>();

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getSourceSysId() {
		return sourceSysId;
	}

	public void setSourceSysId(String sourceSysId) {
		this.sourceSysId = sourceSysId;
	}

	public String getTargetSysId() {
		return targetSysId;
	}

	public void setTargetSysId(String targetSysId) {
		this.targetSysId = targetSysId;
	}

	public Map<String, Object> getExtAttributes() {
		return extAttributes;
	}

	public void setExtAttributes(Map<String, Object> extAttributes) {
		this.extAttributes = extAttributes;
	}

	public void clearMetaData() {
		this.businessId = null;
		this.sourceSysId = null;
		this.targetSysId = null;
		this.extAttributes = null;
	}
	
	@Override
  public String toString(){
		return JsonUtil.toJsonString(this);
	}
}
