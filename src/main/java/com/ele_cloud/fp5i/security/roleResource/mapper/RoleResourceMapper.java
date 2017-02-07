package com.ele_cloud.fp5i.security.roleResource.mapper;

import com.ele_cloud.fp5i.security.roleResource.bean.RoleResourceExample;
import com.ele_cloud.fp5i.security.roleResource.bean.RoleResourceKey;
import java.util.List;

public interface RoleResourceMapper {
    int deleteByPrimaryKey(RoleResourceKey key);

    int insert(RoleResourceKey record);

    int insertSelective(RoleResourceKey record);

    List<RoleResourceKey> selectByExample(RoleResourceExample example);
}