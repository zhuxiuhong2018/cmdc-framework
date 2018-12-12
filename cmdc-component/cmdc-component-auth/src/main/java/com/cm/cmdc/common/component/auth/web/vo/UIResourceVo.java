/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.auth.web.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * UIResourceVo
 * @author zhuxiuhong
 * @since 2018年1月15日
 */
public class UIResourceVo implements Serializable {
  /**
   * @Field long serialVersionUID
   */
  private static final long serialVersionUID = 1L;
  private String id = "";
  private String title = "";
  private String icon = "";
  /**
	 * 提示信息
	 */
	private String hint;
  private String url = "";
  private List<UIResourceVo> subUiResources = new ArrayList<UIResourceVo>();

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

	public List<UIResourceVo> getSubUiResources() {
		return subUiResources;
	}

	public void setSubUiResources(List<UIResourceVo> subUiResources) {
		this.subUiResources = subUiResources;
	}

	/*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "UIResource [id=" + id + ", title=" + title + ", subUiResources=" + subUiResources + "]";
  }
}
