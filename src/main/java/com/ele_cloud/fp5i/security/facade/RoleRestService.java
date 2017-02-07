package com.ele_cloud.fp5i.security.facade;

import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.role.bean.Role;
import com.ele_cloud.fp5i.security.roleResource.bean.RoleResourceKey;

import java.util.List;

/**
 * 用户角色接口
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 13:57
 */
public interface RoleRestService {


    /**
     * 添加角色
     * @param role
     * @return
     */
    public JsonResponseStatus addRole(Role role);

    /**
     * 删除角色通过主键
     * @param pkRole
     * @return
     */
    public JsonResponseStatus deleteRole(String pkRole);

    /**
     * 修改角色数据
     * @param role
     * @return
     */
    public JsonResponseStatus updateRole(Role role);

    /**
     * 查询角色通过主键
     * @param pkRole
     * @return
     */
    public Role seleteRole(String pkRole);

    /**
     * 查询角色下的资源
     * @param pkRole
     * @return
     */
    public List<Resource> seleteRoleResource(String pkRole);

    /**
     *查询所有角色
     * @return
     */
    public List<Role> queryAllRole();

    /**
     * 删除角色资源
     * @param roleId
     * @return
     */
    public JsonResponseStatus deleteRoleResource(String roleId,String resourceId);

    /**
     * 添加角色资源
     * @param roleResourceKey
     * @return
     */
    public JsonResponseStatus addRoleResource(RoleResourceKey roleResourceKey);

}
