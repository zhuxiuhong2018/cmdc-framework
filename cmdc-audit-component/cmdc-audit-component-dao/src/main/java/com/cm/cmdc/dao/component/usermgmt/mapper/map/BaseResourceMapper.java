package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseResource;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseResourceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseResourceMapper {
    long countByExample(BaseResourceCriteria example);

    int deleteByExample(BaseResourceCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(BaseResource record);

    int insertSelective(BaseResource record);

    List<BaseResource> selectByExampleWithRowbounds(BaseResourceCriteria example, RowBounds rowBounds);

    List<BaseResource> selectByExample(BaseResourceCriteria example);

    BaseResource selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BaseResource record, @Param("example") BaseResourceCriteria example);

    int updateByExample(@Param("record") BaseResource record, @Param("example") BaseResourceCriteria example);

    int updateByPrimaryKeySelective(BaseResource record);

    int updateByPrimaryKey(BaseResource record);
}