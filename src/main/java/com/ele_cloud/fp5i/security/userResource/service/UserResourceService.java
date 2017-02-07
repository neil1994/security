package com.ele_cloud.fp5i.security.userResource.service;

import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.userResource.mapper.UserResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 0:45
 */
@Service
public class UserResourceService {
    @Autowired
    private UserResourceMapper userResourceMapper;

    /**
     * 查询用户一级资源
     * @param pkUser
     * @return
     */
    public List<Resource> selectUserOneLevelResource(String pkUser){
        return userResourceMapper.selectUserOneLevelResource(pkUser);
    }


}
