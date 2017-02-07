package com.ele_cloud.fp5i.security.role.service;

import com.ele_cloud.fp5i.security.role.bean.Role;
import com.ele_cloud.fp5i.security.role.bean.RoleExample;
import com.ele_cloud.fp5i.security.role.mapper.RoleMapper;
import org.apache.curator.retry.RetryUntilElapsed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * 角色service
 * User : zhiyong.li
 * Date : 2016/12/26
 * Time : 15:26
 */
@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public void setRoleMapper(RoleMapper roleMapper){
        this.roleMapper=roleMapper;
    }

    /***
     * 通过pkRole获取角色数据
     * @param pkRole
     * @return
     */
    public Role selectRoleByRoleId(String pkRole){
        Role role = roleMapper.selectByPrimaryKey(pkRole);
        return role;
    }

    /**
     * 查询所有的角色
     * @return
     */
    public List<Role> selectAllRole(){
        RoleExample roleExample=new RoleExample();
        List<Role> roles = roleMapper.selectByExample(roleExample);
        return roles;
    }

    /***
     * 删除角色
     * @param pkRole
     * @return
     */
    public Boolean deleteRoleByRoleId(String pkRole){
        int key = roleMapper.deleteByPrimaryKey(pkRole);
        if (key>0) return true;
        return false;
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    public Boolean insertRole(Role role){
        int insert = roleMapper.insert(role);
        if (insert>0) return true;
        return false;
    }

    /**
     * 修改角色
     * @param role
     * @return
     */
    public Boolean updateRole(Role role){
        int updateByPrimaryKey = roleMapper.updateByPrimaryKey(role);
        if (updateByPrimaryKey>0) return true;
        return false;
    }

}
