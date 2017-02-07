package com.ele_cloud.fp5i.security.restimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ele_cloud.fp5i.security.common.CorsFilterUtil;
import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.facade.UserRestService;
import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.resource.service.ResourceService;
import com.ele_cloud.fp5i.security.role.bean.Role;
import com.ele_cloud.fp5i.security.role.service.RoleService;
import com.ele_cloud.fp5i.security.roleResource.service.RoleResourceService;
import com.ele_cloud.fp5i.security.user.bean.User;
import com.ele_cloud.fp5i.security.user.service.UserService;
import com.ele_cloud.fp5i.security.userResource.service.UserResourceService;
import com.ele_cloud.fp5i.security.userRole.bean.UserRoleKey;
import com.ele_cloud.fp5i.security.userRole.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Service  // dubbo annotation ,scan to inject,must have!!
public class UserRestServiceImpl implements UserRestService {


	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserRoleService userRoleService;
	@Autowired
	private RoleResourceService roleResourceService;
	@Autowired
	private ResourceService resourceService;
	@Autowired
	private UserResourceService userResourceService;


	//for bean injection
	 public void setUserService(UserService userService) {
	        this.userService = userService;
    }

	/**
	 * 获取用户数据
	 * @param pkUser
	 * @return
     */
	@GET
	@Path("getUser/{pkUser}")
	@Override
	public User getUserByPkUser(@PathParam("pkUser")  String pkUser) {
		CorsFilterUtil.setHttpHeader();
		return	userService.queryUserByPkUser(pkUser);
	}


	/**
	 * 根据用户名和用户类型查询用户数据
	 * @param loginName
	 * @param userType
     * @return
     */
	@GET
	@Path("queryUser/{loginName}/{userType}")
	@Override
	public User getUserByLgginNameAndUserType(@PathParam("loginName")String loginName,@PathParam("userType") String userType) {
		CorsFilterUtil.setHttpHeader();
		User user = userService.getUserByLgginNameAndUserType(loginName, userType);
		return user;
	}

	/**
	 * 查询所有的用户
	 * @return
     */
	@Path("selectAllUser")
	@GET
	@Override
	public List<User> selectAllUser() {
		CorsFilterUtil.setHttpHeader();
		return userService.selectAllUser();
	}

	/**
	 * 跟新用户数据
	 * @param user
	 * @return
     */
	@PUT
	@Path("update")
	@Override
	public JsonResponseStatus updateUserByPkUser(User user) {
		CorsFilterUtil.setHttpHeader();
		int userByPkUser = userService.updateUserByPkUser(user);
		if (userByPkUser>0){
			return new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"updateUser");
		}
		return new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"updateUser");
	}

	/***
	 * 根据用户主键删除用户数据
	 * @param pkUser
	 * @return
     */
	@DELETE
	@Path("deleteUser/{pkUser}")
	@Override
	public JsonResponseStatus deleteUserByPkUser(@PathParam("pkUser")String pkUser) {
		CorsFilterUtil.setHttpHeader();
		int deleteUserByPkUser = userService.deleteUserByPkUser(pkUser);
		if (deleteUserByPkUser>0){
			return new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"deleteUser",pkUser);
		}
		return  new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"deleteUser",pkUser);
	}

	/**
	 * 插入用户数据
	 * @param user
	 * @return
     */
	@POST
	@Path("insert")
	@Override
	public JsonResponseStatus insertUser(User user) {
		CorsFilterUtil.setHttpHeader();
		int insertUser = userService.insertUser(user);
		if (insertUser>0){
			return new  JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"insertUser",user.getPkUser());
		}
		return new  JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"insertUser",user.getPkUser());
	}
	@POST
	@Path("login")
	@Override
	public JsonResponseStatus login(User user) {
		CorsFilterUtil.setHttpHeader();
		String token=userService.login(user);
		JsonResponseStatus status = new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"login");
		if(token==null){
			return status;
		}
		status.setStatus(JsonResponseStatus.Status.SUCCESS);
		status.setToken(token);

		return status;
	}

	/**
	 * 通过pkUser获得用户下的角色
	 * @param pkUser
	 * @return
     */
	@Path("getUserRole/{pkUser}")
	@GET
	public List<Role> getUserRoleByPkUser(@PathParam("pkUser") String pkUser) {
		CorsFilterUtil.setHttpHeader();
		List<UserRoleKey> userRoleKeys = userRoleService.selectUserRoleByPkUser(pkUser);
		if (userRoleKeys.isEmpty()){return null;}
		List<Role> roles=new ArrayList<Role>();
		for (UserRoleKey userRoleKey:userRoleKeys){
			Role role = roleService.selectRoleByRoleId(userRoleKey.getRoleId());
			roles.add(role);
		}
		return roles;
	}

	/**
	 * 通过pkUser和pkRole删除用户的角色
	 * @param pkUser
	 * @param pkRole
     * @return
     */
	@Path("deleteUserRole/{pkUser}/{pkRole}")
	@DELETE
	public JsonResponseStatus deleteUserRoleByPkUser(@PathParam("pkUser") String pkUser,@PathParam("pkRole")String pkRole) {
		CorsFilterUtil.setHttpHeader();
		Boolean bool=false;
		bool = userRoleService.deleteUserRole(pkUser, pkRole);
		return bool ? new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS, "deleteUserRole") : new JsonResponseStatus(JsonResponseStatus.Status.FAILURE, "deleteUserRole");
	}

	/**
	 * 新增用户的角色
	 * @param userRoleKey
     * @return
     */
	@Path("insertUserRole")
	@POST
	public JsonResponseStatus insertUserRoleByPkUser(UserRoleKey userRoleKey) {
		CorsFilterUtil.setHttpHeader();
		Boolean bool=false;
		bool=userRoleService.insertUserRole(userRoleKey);
		return bool?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"insertUserRole"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"insertUserRole");
	}

	/**
	 *获得一级资源
	 * @param pkUser
	 * @return
     */
	@Path("getOneResource/{pkUser}")
	@GET
	public List<Resource> getResourceByPkUser(@PathParam("pkUser") String pkUser) {
		CorsFilterUtil.setHttpHeader();
		return userResourceService.selectUserOneLevelResource(pkUser);
	}

}
