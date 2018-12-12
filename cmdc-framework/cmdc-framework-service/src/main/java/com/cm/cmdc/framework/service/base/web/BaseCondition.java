package com.cm.cmdc.framework.service.base.web;

public class BaseCondition {
	
	private String conscope;
	/**
	 * 页码
	 */
	private Integer pageno;
	/**
	 * 每页行数
	 */
	private Integer rowsize;
	/**
	 * 排序字段
	 */
	private String sidx;
	/**
	 * 升降序
	 */
	private String sord;
	/**
	 * 
	 */
	private String searchKeyWord;

	public BaseCondition() {
	}

	public String getConscope() {
		return conscope;
	}

	public BaseCondition setConscope(String conscope) {
		this.conscope = conscope;
		return this;
	}

	public Integer getPageno() {
		if (pageno == null)
			pageno = 1;
		return pageno;
	}

	public Integer getRowsize() {
		if (rowsize == null)
			rowsize = 10;
		return rowsize;
	}

	public BaseCondition setPageno(Integer pageno) {
		this.pageno = pageno;
		return this;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public void setRowsize(Integer rowsize) {
		this.rowsize = rowsize;
	}

	public String getSearchKeyWord() {
		return searchKeyWord;
	}

	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
	}

	
	
}
