package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseDepartment;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseDepartmentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseDepartmentMapper {
    long countByExample(BaseDepartmentCriteria example);

    int deleteByExample(BaseDepartmentCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(BaseDepartment record);

    int insertSelective(BaseDepartment record);

    List<BaseDepartment> selectByExampleWithRowbounds(BaseDepartmentCriteria example, RowBounds rowBounds);

    List<BaseDepartment> selectByExample(BaseDepartmentCriteria example);

    BaseDepartment selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BaseDepartment record, @Param("example") BaseDepartmentCriteria example);

    int updateByExample(@Param("record") BaseDepartment record, @Param("example") BaseDepartmentCriteria example);

    int updateByPrimaryKeySelective(BaseDepartment record);

    int updateByPrimaryKey(BaseDepartment record);
}