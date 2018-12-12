/**
 * Copyright 2017-2025 Evergrande Group.
 * 
 * @Probject Name: egc-mdm-component-service
 * @Path: com.cm.cmdc.usermgmt.component.user.category.apiBaseUserApi.java
 * @Create By zhuxiuhong
 * @since 2018年01月15日 16:10:53 人员API
 */
package com.cm.cmdc.service.component.usermgmt.web;

import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cm.cmdc.client.component.usermgmt.UserMgmtUri;
import com.cm.cmdc.client.component.usermgmt.condition_vo.BaseUserConditionVo;
import com.cm.cmdc.common.component.auth.web.vo.UserLoginVo;
import com.cm.cmdc.common.component.auth.web.vo.UserVo;
import com.cm.cmdc.common.component.utils.BeanUtil;
import com.cm.cmdc.common.constant.CommonConstant;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUser;
import com.cm.cmdc.framework.client.dto.UuidListDto;
import com.cm.cmdc.framework.service.base.api.BaseApiController;
import com.cm.cmdc.service.common.AuditExctption;
import com.cm.cmdc.service.component.usermgmt.UserMgmtErrorMsg;
import com.cm.cmdc.service.component.usermgmt.service.IBaseUserService;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 人员API
 * 
 * @Author zhuxiuhong
 * @since 2018年01月15日
 */
@Api(value = "人员相关api")
@RestController
@RequestMapping(value = UserMgmtUri.CMDC_USER)
public class BaseUserController extends BaseApiController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IBaseUserService baseUserService;

	/**
	 * 根据条件查询人员信息
	 * 
	 * 
	 * @since 2018年1月15日 By zhuxiuhong
	 * @param requestDto
	 * @return
	 * @throws JsonProcessingException
	 *           ResponseDto
	 */

	@ApiOperation("根据条件查询人员列表")
	@RequestMapping(value = CommonConstant.URL_GET_DATA_BY_CONDITIONS, method = RequestMethod.POST)
	public List<BaseUser> getDataByConditions(@Valid @RequestBody BaseUserConditionVo conditionDto) {

		logger.info(CommonConstant.MSG_START + CommonConstant.URL_GET_DATA_BY_CONDITIONS);

		BaseUser baseUser = new BaseUser();
		// 设置查询条件.
		setConditionData(baseUser, conditionDto);
		logger.info("baseUser = [{}]", baseUser);

		List<BaseUser> list = baseUserService.getDataByConditions(baseUser);
		return list;
	}

	@ApiOperation("根据条件查询人员列表")
	@RequestMapping(value = CommonConstant.URL_GET_DATA_BY_UUIDS, method = RequestMethod.POST)
	public List<BaseUser> getUsersByUuids(@Valid @RequestBody UuidListDto uuidListDto) {

		logger.info(CommonConstant.MSG_START + CommonConstant.URL_GET_DATA_BY_CONDITIONS);

		List<BaseUser> list = null;
		if (uuidListDto == null || uuidListDto.getUuidList() == null || uuidListDto.getUuidList().isEmpty()) {
			list = new LinkedList<>();
		} else {
			list = baseUserService.getDataByUuids(uuidListDto.getUuidList());
		}

		return list;
	}

	@ApiOperation("用户登录")
	@ApiParam(name = "token")
	@RequestMapping(value = CommonConstant.URI_QUERY_USER_AUTHORITY, method = RequestMethod.POST)
	public UserVo getUsersByUuids(@Valid @RequestBody UserLoginVo userLoginVo) {

		logger.info(CommonConstant.MSG_START + CommonConstant.URL_GET_DATA_BY_CONDITIONS);
		BaseUser baseUser = new BaseUser();
		
		baseUser.setUserId(userLoginVo.getUserId());
		StringBuilder build = new StringBuilder();
		
//		logger.info("Md5: {}",  DigestUtils.appendMd5DigestAsHex("AAAAAA".getBytes(), build));
		
		UserVo userVo = null;
		List<BaseUser> list = baseUserService.getDataByConditions(baseUser);
		if(list == null || list.isEmpty()) {
			throw new AuditExctption(UserMgmtErrorMsg.MSG_BASEUSER_USERID_INVALID);
		}
		//baseUser.setPassword(list.get(0).getPassword());
		
//		if(md5)
//		DigestUtils.md5Hex(IOUtils.toByteArray(fileInputStream));
		DigestUtils.md5Digest("AAAA".getBytes());
		

		return userVo;
	}

	/**
	 * 设置查询条件.
	 * 
	 * @since 2018年1月15日 By zhuxiuhong
	 * @param baseUser
	 * @param conditionDto
	 *          void
	 */
	private void setConditionData(BaseUser baseUser, BaseUserConditionVo conditionDto) {
		if (conditionDto != null) {
			// 设置查询条件.
			BeanUtil.copyProperties(baseUser, conditionDto);
		}
	}

}
