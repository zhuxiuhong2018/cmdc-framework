package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserPermission;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserPermissionCriteria;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserPermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelUserPermissionMapper {
    long countByExample(RelUserPermissionCriteria example);

    int deleteByExample(RelUserPermissionCriteria example);

    int deleteByPrimaryKey(RelUserPermissionKey key);

    int insert(RelUserPermission record);

    int insertSelective(RelUserPermission record);

    List<RelUserPermission> selectByExampleWithRowbounds(RelUserPermissionCriteria example, RowBounds rowBounds);

    List<RelUserPermission> selectByExample(RelUserPermissionCriteria example);

    RelUserPermission selectByPrimaryKey(RelUserPermissionKey key);

    int updateByExampleSelective(@Param("record") RelUserPermission record, @Param("example") RelUserPermissionCriteria example);

    int updateByExample(@Param("record") RelUserPermission record, @Param("example") RelUserPermissionCriteria example);

    int updateByPrimaryKeySelective(RelUserPermission record);

    int updateByPrimaryKey(RelUserPermission record);
}