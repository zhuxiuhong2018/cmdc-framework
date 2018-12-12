package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseRole;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseRoleMapper {
    long countByExample(BaseRoleCriteria example);

    int deleteByExample(BaseRoleCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(BaseRole record);

    int insertSelective(BaseRole record);

    List<BaseRole> selectByExampleWithRowbounds(BaseRoleCriteria example, RowBounds rowBounds);

    List<BaseRole> selectByExample(BaseRoleCriteria example);

    BaseRole selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BaseRole record, @Param("example") BaseRoleCriteria example);

    int updateByExample(@Param("record") BaseRole record, @Param("example") BaseRoleCriteria example);

    int updateByPrimaryKeySelective(BaseRole record);

    int updateByPrimaryKey(BaseRole record);
}