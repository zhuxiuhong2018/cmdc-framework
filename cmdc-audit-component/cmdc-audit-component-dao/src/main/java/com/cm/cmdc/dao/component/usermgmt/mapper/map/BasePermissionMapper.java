package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BasePermission;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BasePermissionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BasePermissionMapper {
    long countByExample(BasePermissionCriteria example);

    int deleteByExample(BasePermissionCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(BasePermission record);

    int insertSelective(BasePermission record);

    List<BasePermission> selectByExampleWithRowbounds(BasePermissionCriteria example, RowBounds rowBounds);

    List<BasePermission> selectByExample(BasePermissionCriteria example);

    BasePermission selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BasePermission record, @Param("example") BasePermissionCriteria example);

    int updateByExample(@Param("record") BasePermission record, @Param("example") BasePermissionCriteria example);

    int updateByPrimaryKeySelective(BasePermission record);

    int updateByPrimaryKey(BasePermission record);
}