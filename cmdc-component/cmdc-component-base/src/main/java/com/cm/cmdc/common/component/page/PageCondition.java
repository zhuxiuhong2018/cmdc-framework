/**
 * Copyright 2017-2025 CMCC.
 */
package com.cm.cmdc.common.component.page;

import com.cm.cmdc.common.constant.CommonConstant;

/**
 * @author zhuxiuhong
 * @since 2018
 */
public class PageCondition {

	/**
	 * 页大小
	 */
	protected int pageSize ;
	/**
	 * 当前页
	 */
	protected int currentPage;
	
	public PageCondition() {
		pageSize = CommonConstant.DEFALUT_PAGE_SIZE;
		currentPage = CommonConstant.MIN_CURRENT_PAGE;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize < CommonConstant.MIN_PAGE_SIZE) {
			pageSize = CommonConstant.DEFALUT_PAGE_SIZE;
		}
		if(pageSize  > CommonConstant.MAX_PAGE_SIZE) {
			pageSize  = CommonConstant.MAX_PAGE_SIZE ;
		}
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		if (currentPage < CommonConstant.MIN_CURRENT_PAGE) {
			currentPage = CommonConstant.MIN_CURRENT_PAGE;
		}
		this.currentPage = currentPage;
	}

}
