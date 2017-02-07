package com.ele_cloud.fp5i.security.userResource.mapper;

import com.ele_cloud.fp5i.security.resource.bean.Resource;

import java.util.List;

/**
 * 用户资源Mapper
 * User : zhiyong.li
 * Date : 2016/12/23
 * Time : 9:39
 */
public interface UserResourceMapper {
    /**
     * 查询用户一级资源
     * @param pkUser
     * @return
     */
    List<Resource> selectUserOneLevelResource(String pkUser);


}
