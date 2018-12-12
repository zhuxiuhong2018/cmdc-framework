package com.cm.cmdc.dao.component.usermgmt.mapper.map;

import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseMenu;
import com.cm.cmdc.dao.component.usermgmt.mapper.entity.BaseMenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseMenuMapper {
    long countByExample(BaseMenuCriteria example);

    int deleteByExample(BaseMenuCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(BaseMenu record);

    int insertSelective(BaseMenu record);

    List<BaseMenu> selectByExampleWithRowbounds(BaseMenuCriteria example, RowBounds rowBounds);

    List<BaseMenu> selectByExample(BaseMenuCriteria example);

    BaseMenu selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BaseMenu record, @Param("example") BaseMenuCriteria example);

    int updateByExample(@Param("record") BaseMenu record, @Param("example") BaseMenuCriteria example);

    int updateByPrimaryKeySelective(BaseMenu record);

    int updateByPrimaryKey(BaseMenu record);
}