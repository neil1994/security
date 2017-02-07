package com.ele_cloud.fp5i.security.userRole.mapper;

import com.ele_cloud.fp5i.security.userRole.bean.UserRoleExample;
import com.ele_cloud.fp5i.security.userRole.bean.UserRoleKey;
import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);

    List<UserRoleKey> selectByExample(UserRoleExample example);
}