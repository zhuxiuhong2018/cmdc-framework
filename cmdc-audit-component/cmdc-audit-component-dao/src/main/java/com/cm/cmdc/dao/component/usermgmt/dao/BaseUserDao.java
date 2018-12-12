/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.cm.cmdc.dao.component.usermgmt.dao;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.cm.cmdc.common.constant.CommonConstant;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUser;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUserCriteria;
import com.cm.cmdc.dao.component.usermgmt.mapper.map.BaseUserMapper;
import com.cm.cmdc.framework.dao.base.BaseDao;

/**
 * 人员信息表 Dao
 * 
 * @Author zhuxiuhong
 * @since 2018年11月15日
 */
@Repository
public class BaseUserDao extends BaseDao<BaseUserMapper, BaseUserMapper, BaseUser> {

	@Override
	protected void setMapperClass() {
		setMapperClass(BaseUserMapper.class);
		setExtMapperClass(BaseUserMapper.class);
	}

	@Override
	protected void setEntityClass() {
		setEntityClass(BaseUser.class);
	}


	/**
	 * 获取 dataList
	 * 
	 * @param pageCondition
	 * @param baseUser
	 * @return
	 */
	public List<BaseUser> getDataByConditions(BaseUser baseUser) {
		BaseUserCriteria example = new BaseUserCriteria();

		// 设置查询条件.
		setCriteriaConditions(example, baseUser);

		return getMapper().selectByExample(example);
	}

	/**
	 * 根据 uuid 列表 获取所有的 baseUser 列表.
	 * 
	 * @Methods Name getAllUsersByUuids
	 * @Create In 2018年11月25日 By zhuxiuhong
	 * @param uuids
	 * @return List<BaseUser>
	 */
	public List<BaseUser> getDataByUuids(List<String> uuids) {

		BaseUserCriteria example = new BaseUserCriteria();
		BaseUserCriteria.Criteria criteria = example.createCriteria();
		criteria.andDeleteFlagEqualTo(CommonConstant.DELETE_FLAG_UN_DEL);
		criteria.andUuidIn(uuids);

		return getMapper().selectByExample(example);
	}

	/**
	 * 设置查询条件.
	 * 
	 * @since 2018年11月15日 By zhuxiuhong
	 * @param example
	 * @param baseUser
	 *          void
	 */
	private void setCriteriaConditions(BaseUserCriteria example, BaseUser baseUser) {
		BaseUserCriteria.Criteria criteria = example.createCriteria();
		// 只查询未删除的记录.
		criteria.andDeleteFlagEqualTo(CommonConstant.DELETE_FLAG_UN_DEL);

		/**
		 * 设置条件.
		 */
		if (StringUtils.isNotBlank(baseUser.getUuid())) {
			criteria.andUuidEqualTo(baseUser.getUuid());
		}
		if (StringUtils.isNotBlank(baseUser.getUserName())) {
			criteria.andUserNameLike(baseUser.getUserName());
		}
		if (StringUtils.isNotBlank(baseUser.getIdenNum())) {
			criteria.andIdenNumEqualTo(baseUser.getIdenNum());
		}
	}

}
