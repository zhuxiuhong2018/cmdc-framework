/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.auth.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * UI resource
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class UIResource implements Serializable {
	private static final long serialVersionUID = 1L;
	private String uuid;
	private String title;
	/**
	 * 提示信息
	 */
	private String hint;
	private String icon;
	private String url;
	private List<UIResource> subUiResources = new ArrayList<UIResource>();

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<UIResource> getSubUiResources() {
		return subUiResources;
	}

	public void setSubUiResources(List<UIResource> subUiResources) {
		this.subUiResources = subUiResources;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UIResource [id=" + uuid + ", title=" + title + ", subUiResources=" + subUiResources + "]";
	}
}
