package com.ele_cloud.fp5i.security.roleResource.service;

import com.ele_cloud.fp5i.security.roleResource.bean.RoleResourceExample;
import com.ele_cloud.fp5i.security.roleResource.bean.RoleResourceKey;
import com.ele_cloud.fp5i.security.roleResource.mapper.RoleResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色资源Service
 * User : zhiyong.li
 * Date : 2016/12/26
 * Time : 16:32
 */
@Service
public class RoleResourceService {
    @Autowired
    private RoleResourceMapper roleResourceMapper;

    public void setRoleResourceMapper(RoleResourceMapper roleResourceMapper){
        this.roleResourceMapper=roleResourceMapper;
    }

    /**
     * 查询角色资源数据
     * @param roleId
     * @return
     */
    public List<RoleResourceKey> selectRoleResource(String roleId){
        RoleResourceExample roleResourceExample=new RoleResourceExample();
        RoleResourceExample.Criteria criteria=roleResourceExample.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        return roleResourceMapper.selectByExample(roleResourceExample);
    }

    /***
     * 插入角色资源
     * @param roleResourceKey
     * @return
     */
    public Boolean insertRoleResource(RoleResourceKey roleResourceKey){
        int insert = roleResourceMapper.insert(roleResourceKey);
        if (insert>0){return true;}
        return  false;
    }

    /**
     * 删除角色资源
     * @param roleResourceKey
     * @return
     */
    public Boolean deleteRoleResource(RoleResourceKey roleResourceKey){
        int deleteByPrimaryKey = roleResourceMapper.deleteByPrimaryKey(roleResourceKey);
        if (deleteByPrimaryKey>0){return true;}
        return false;
    }



}
