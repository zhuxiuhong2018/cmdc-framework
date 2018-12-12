/*
 * Copyright 2017-2025 IBM.
 */
package com.cm.cmdc.common.component.page;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页查询结果
 * 
 * @author zhuxiuhong
 * @since 2018
 * @param <T>
 */
public class Page<T> {

  protected List<T> result;

  protected int pageSize;

  protected int currentPage;

  protected int totalCount;

//  private Page() {
//  }

  @SuppressWarnings("rawtypes")
  public Page(PageRequest p, int totalCount) {
    this(p.getCurrentPage(), p.getPageSize(), totalCount);
  }

  @SuppressWarnings("rawtypes")
  public Page(PageRequest p, int totalCount, List<T> result) {
    this(p.getCurrentPage(), p.getPageSize(), result);
  }

  public Page(int currentPage, int pageSize, int totalCount) {
    this(currentPage, pageSize, new ArrayList<>(0));
  }

  public Page(int currentPage, int pageSize, List<T> result) {
    if (pageSize <= 0) {
      throw new IllegalArgumentException("[pageSize] must great than zero");
    }
    
    if(currentPage <= 0) {
    	currentPage = 1;
    }
    
    this.pageSize = pageSize;
    this.currentPage = currentPage;
    if (result == null) {
      throw new IllegalArgumentException("'result' must be not null");
    }
    this.totalCount = result.size();
    this.result = result;
  }

  /**
   * 当前页包含的数据
   *
   * @return 当前页数据源
   */
  public List<T> getResult() {
    return result;
  }



  /**
   * 每一页显示的条目数
   *
   * @return 每一页显示的条目数
   */
  public int getPageSize() {
    return pageSize;
  }

  /**
   * 当前页的页码
   *
   * @return 当前页的页码
   */
  public int getCurrentPage() {
    return currentPage;
  }

  /**
   * 总的数据条目数量，0表示没有数据
   *
   * @return 总数量
   */
  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

}

