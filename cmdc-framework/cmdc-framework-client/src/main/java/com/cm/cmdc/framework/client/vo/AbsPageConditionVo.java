/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.framework.client.vo;

import com.cm.cmdc.common.component.page.PageCondition;

/**
 * @Author zhuxiuhong
 * @since 2018
 */
abstract public class AbsPageConditionVo extends UuidVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PageCondition page;
	
	public PageCondition getPage() {
		return page;
	}
	
	public void setPage(PageCondition page) {
		this.page = page;
	}

}
