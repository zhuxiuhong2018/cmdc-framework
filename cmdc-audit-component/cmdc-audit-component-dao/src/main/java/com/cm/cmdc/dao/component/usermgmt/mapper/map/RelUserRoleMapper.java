package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserRoleCriteria;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelUserRoleMapper {
    long countByExample(RelUserRoleCriteria example);

    int deleteByExample(RelUserRoleCriteria example);

    int deleteByPrimaryKey(RelUserRoleKey key);

    int insert(RelUserRoleKey record);

    int insertSelective(RelUserRoleKey record);

    List<RelUserRoleKey> selectByExampleWithRowbounds(RelUserRoleCriteria example, RowBounds rowBounds);

    List<RelUserRoleKey> selectByExample(RelUserRoleCriteria example);

    int updateByExampleSelective(@Param("record") RelUserRoleKey record, @Param("example") RelUserRoleCriteria example);

    int updateByExample(@Param("record") RelUserRoleKey record, @Param("example") RelUserRoleCriteria example);
}