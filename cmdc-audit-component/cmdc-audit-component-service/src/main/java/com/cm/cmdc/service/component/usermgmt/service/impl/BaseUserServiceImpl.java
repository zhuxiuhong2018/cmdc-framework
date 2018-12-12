/**
 * Copyright 2017-2025 Evergrande Group.
 * 
 * @Probject Name: egc-mdm-component-service
 * @Path: com.cm.cmdc.usermgmt.component.user.service.implBaseUserServiceImpl.java
 * @Create By zhuxiuhong
 * @since 2018年01月15日 16:10:53 人员服务接口实现类
 */
package com.cm.cmdc.service.component.usermgmt.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.cm.cmdc.common.component.page.Page;
import com.cm.cmdc.common.exception.CommonException;
import com.cm.cmdc.dao.component.usermgmt.dao.BaseUserDao;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUser;
import com.cm.cmdc.service.component.usermgmt.service.IBaseUserService;

/**
 * 人员表 service 实现类.
 * 
 * @Author zhuxiuhong
 * @since 2018年01月15日
 */
@Service
@Primary
public class BaseUserServiceImpl implements IBaseUserService {

  protected final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private BaseUserDao baseUserDao;


	@Override
	public List<BaseUser> getDataByConditions(BaseUser baseUser) throws CommonException {
		return baseUserDao.getDataByConditions(baseUser);
	}

	@Override
	public List<BaseUser> getDataByUuids(List<String> uuids) throws CommonException {
		return baseUserDao.getDataByUuids(uuids);
	}
	
	


}
