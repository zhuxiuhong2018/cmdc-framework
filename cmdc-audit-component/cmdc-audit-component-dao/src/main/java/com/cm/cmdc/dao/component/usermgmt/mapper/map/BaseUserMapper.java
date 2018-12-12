package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUser;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseUserMapper {
    long countByExample(BaseUserCriteria example);

    int deleteByExample(BaseUserCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    List<BaseUser> selectByExampleWithRowbounds(BaseUserCriteria example, RowBounds rowBounds);

    List<BaseUser> selectByExample(BaseUserCriteria example);

    BaseUser selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BaseUser record, @Param("example") BaseUserCriteria example);

    int updateByExample(@Param("record") BaseUser record, @Param("example") BaseUserCriteria example);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
}