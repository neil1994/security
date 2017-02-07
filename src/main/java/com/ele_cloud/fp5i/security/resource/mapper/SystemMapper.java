package com.ele_cloud.fp5i.security.resource.mapper;

import com.ele_cloud.fp5i.security.resource.bean.System;
import com.ele_cloud.fp5i.security.resource.bean.SystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemMapper {
    int deleteByPrimaryKey(String pkSystem);

    int insert(System record);

    int insertSelective(System record);

    List<System> selectByExample(SystemExample example);

    System selectByPrimaryKey(String pkSystem);

    int updateByExampleSelective(@Param("record") System record, @Param("example") SystemExample example);

    int updateByExample(@Param("record") System record, @Param("example") SystemExample example);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);
}