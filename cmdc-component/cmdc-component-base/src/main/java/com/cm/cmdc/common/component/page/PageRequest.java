/*
 * Copyright 2017-2025 IBM.
 */
package com.cm.cmdc.common.component.page;

/**
 * 分页查询请求
 * 
 * @author zhuxiuhong
 * @since 2018
 * @param <T>
 */
public class PageRequest<T> {

  /**
   * 过滤参数
   */
  private T filters;

  /**
   * 页号码,页码从1开始
   */
  private int currentPage = 1;

  /**
   * 分页大小
   */
  private int pageSize = 20;

  public PageRequest() {

    this(0, 0, null);
  }

  public PageRequest(int currentPage, int pageSize) {

    this(currentPage, pageSize, null);
  }

  public PageRequest(int currentPage, int pageSize, T filters) {

    this.currentPage = currentPage;
    this.pageSize = pageSize;
    this.filters = filters;
  }

  public T getFilters() {

    return filters;
  }

  public void setFilters(T filters) {

    this.filters = filters;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getPageSize() {

    return pageSize;
  }

  public void setPageSize(int pageSize) {

    this.pageSize = pageSize;
  }

  public void setPageNumberAndSize(int start, int limit) {

    this.pageSize = limit;
    this.currentPage = start / limit;
  }

}

