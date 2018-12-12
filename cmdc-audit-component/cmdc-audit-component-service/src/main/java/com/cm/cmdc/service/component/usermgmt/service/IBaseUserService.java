/**
 * Copyright 2017-2025 Evergrande Group.
 * 
 * @Probject Name: egc-mdm-component-service
 * @Path: com.cm.cmdc.usermgmt.component.user.service.implIBaseUserService.java
 * @Create By zhuxiuhong
 * @since 2018年01月15日 16:10:53 人员服务接口
 */
package com.cm.cmdc.service.component.usermgmt.service;


import java.util.List;

import com.cm.cmdc.common.component.page.Page;
import com.cm.cmdc.common.exception.CommonException;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUser;

/**
 * 人员 表 Service 接口.
 * 
 * @Author zhuxiuhong
 * @since 2018年01月15日
 */
public interface IBaseUserService {

  /**
   * 根据条件查询人员列表.
   * 
   * @since 2018年1月15日 By zhuxiuhong
   * @param baseUser
   * @return Page<BaseUser>
   */
  List<BaseUser> getDataByConditions(BaseUser baseUser)
  		throws CommonException;
  
  List<BaseUser> getDataByUuids(List<String> uuids) throws CommonException;



  /**
   * 合并插入.
   * 
   * @Methods Name mergeInsert
   * @Create In 2018年3月25日 By zhuxiuhong
   * @param baseUser
   * @throws CommonException void
   */
//  int mergeInsert(List<BaseUser> baseUser) throws CommonException;


}
