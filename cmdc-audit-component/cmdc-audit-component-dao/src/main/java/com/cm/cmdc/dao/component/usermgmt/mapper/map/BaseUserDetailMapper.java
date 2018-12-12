package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUserDetail;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseUserDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseUserDetailMapper {
    long countByExample(BaseUserDetailCriteria example);

    int deleteByExample(BaseUserDetailCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(BaseUserDetail record);

    int insertSelective(BaseUserDetail record);

    List<BaseUserDetail> selectByExampleWithRowbounds(BaseUserDetailCriteria example, RowBounds rowBounds);

    List<BaseUserDetail> selectByExample(BaseUserDetailCriteria example);

    BaseUserDetail selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BaseUserDetail record, @Param("example") BaseUserDetailCriteria example);

    int updateByExample(@Param("record") BaseUserDetail record, @Param("example") BaseUserDetailCriteria example);

    int updateByPrimaryKeySelective(BaseUserDetail record);

    int updateByPrimaryKey(BaseUserDetail record);
}