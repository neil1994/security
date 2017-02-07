package com.ele_cloud.fp5i.security.restimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.facade.RoleRestService;
import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.resource.service.ResourceService;
import com.ele_cloud.fp5i.security.role.bean.Role;
import com.ele_cloud.fp5i.security.role.service.RoleService;
import com.ele_cloud.fp5i.security.roleResource.bean.RoleResourceKey;
import com.ele_cloud.fp5i.security.roleResource.service.RoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 14:41
 */
@Service
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Path("role")
public class RoleRestServiceImpl implements RoleRestService {

    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleResourceService roleResourceService;
    @Autowired
    private ResourceService resourceService;

    public void setRoleService(RoleService roleService){
        this.roleService=roleService;
    }


    /**
     * 添加角色数据
     * @param role
     * @return
     */
    @Path("addRole")
    @POST
    @Override
    public JsonResponseStatus addRole(Role role) {
        Boolean insertRole = roleService.insertRole(role);
        return insertRole?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"addRole"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"addRole") ;
    }

    /**
     * 删除角色数据
     * @param pkRole
     * @return
     */
    @Path("deleteRole/{pkRole}")
    @DELETE
    @Override
    public JsonResponseStatus deleteRole(@PathParam("pkRole") String pkRole) {
        Boolean deleteRoleByRoleId = roleService.deleteRoleByRoleId(pkRole);
        return deleteRoleByRoleId?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"deleteRole"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"deleteRole") ;
    }

    /**
     * 修改角色数据
     * @param role
     * @return
     */
    @Path("updateRole")
    @PUT
    @Override
    public JsonResponseStatus updateRole(Role role) {
        Boolean updateRole = roleService.updateRole(role);
        return updateRole?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"updateRole"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"updateRole") ;
    }

    /**
     * 获得角色数据
     * @param pkRole
     * @return
     */
    @Path("getRole/{pkRole}")
    @GET
    @Override
    public Role seleteRole(@PathParam("pkRole") String pkRole) {
        Role role = roleService.selectRoleByRoleId(pkRole);
        return role;
    }

    /**
     * 查询所有角色
     * @return
     */
    @Path("queryAllRole")
    @GET
    @Override
    public List<Role> queryAllRole() {
        return roleService.selectAllRole();
    }

    /**
     * 查询角色下的资源
     * @param pkRole
     * @return
     */
    @Path("seleteRoleResource/{pkRole}")
    @GET
    @Override
    public List<Resource> seleteRoleResource(@PathParam("pkRole") String pkRole) {
        List<Resource> resources=new ArrayList<Resource>();
        List<RoleResourceKey> roleResourceKeys= roleResourceService.selectRoleResource(pkRole);
        if (!roleResourceKeys.isEmpty()){
            for (RoleResourceKey roleResourceKey :roleResourceKeys){
                Resource resource = resourceService.selectResource(roleResourceKey.getResourceId());
                resources.add(resource);
            }
        }
        return resources;
    }

    /**
     * 删除角色资源数据
     * @param resourceId
     * @param roleId
     * @return
     */
    @Path("deleteRoleResource/{roleId}/{resourceId}")
    @DELETE
    @Override
    public JsonResponseStatus deleteRoleResource(@PathParam("roleId") String roleId,@PathParam("resourceId") String resourceId) {
        RoleResourceKey roleResourceKey=new RoleResourceKey(roleId,resourceId);
        Boolean deleteRoleResource = roleResourceService.deleteRoleResource( roleResourceKey);
        return deleteRoleResource?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"deleteRoleResource"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"deleteRoleResource");
    }

    /**
     * 添加角色资源
     * @param roleResourceKey
     * @return
     */
    @Path("addRoleResource")
    @POST
    @Override
    public JsonResponseStatus addRoleResource(RoleResourceKey roleResourceKey) {
        Boolean insertRoleResource = roleResourceService.insertRoleResource(roleResourceKey);
        return insertRoleResource?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"addRoleResource"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"addRoleResource");
    }
}
