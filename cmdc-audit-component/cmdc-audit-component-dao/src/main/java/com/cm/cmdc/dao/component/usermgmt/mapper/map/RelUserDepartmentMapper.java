package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserDepartment;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserDepartmentCriteria;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.RelUserDepartmentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelUserDepartmentMapper {
    long countByExample(RelUserDepartmentCriteria example);

    int deleteByExample(RelUserDepartmentCriteria example);

    int deleteByPrimaryKey(RelUserDepartmentKey key);

    int insert(RelUserDepartment record);

    int insertSelective(RelUserDepartment record);

    List<RelUserDepartment> selectByExampleWithRowbounds(RelUserDepartmentCriteria example, RowBounds rowBounds);

    List<RelUserDepartment> selectByExample(RelUserDepartmentCriteria example);

    RelUserDepartment selectByPrimaryKey(RelUserDepartmentKey key);

    int updateByExampleSelective(@Param("record") RelUserDepartment record, @Param("example") RelUserDepartmentCriteria example);

    int updateByExample(@Param("record") RelUserDepartment record, @Param("example") RelUserDepartmentCriteria example);

    int updateByPrimaryKeySelective(RelUserDepartment record);

    int updateByPrimaryKey(RelUserDepartment record);
}