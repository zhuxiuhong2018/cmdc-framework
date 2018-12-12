package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelRolePermission;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelRolePermissionCriteria;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelRolePermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelRolePermissionMapper {
    long countByExample(RelRolePermissionCriteria example);

    int deleteByExample(RelRolePermissionCriteria example);

    int deleteByPrimaryKey(RelRolePermissionKey key);

    int insert(RelRolePermission record);

    int insertSelective(RelRolePermission record);

    List<RelRolePermission> selectByExampleWithRowbounds(RelRolePermissionCriteria example, RowBounds rowBounds);

    List<RelRolePermission> selectByExample(RelRolePermissionCriteria example);

    RelRolePermission selectByPrimaryKey(RelRolePermissionKey key);

    int updateByExampleSelective(@Param("record") RelRolePermission record, @Param("example") RelRolePermissionCriteria example);

    int updateByExample(@Param("record") RelRolePermission record, @Param("example") RelRolePermissionCriteria example);

    int updateByPrimaryKeySelective(RelRolePermission record);

    int updateByPrimaryKey(RelRolePermission record);
}