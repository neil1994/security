package com.ele_cloud.fp5i.security.facade;

import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.role.bean.Role;
import com.ele_cloud.fp5i.security.user.bean.User;
import com.ele_cloud.fp5i.security.userRole.bean.UserRoleKey;

import java.util.List;

/**
 * 用户对外接口
 */
public interface UserRestService {
	/**
	 * 通过用户pkUser获得用户数据
	 * @param pkUser
	 * @return
     */
	 public User getUserByPkUser(String pkUser) ;

	/**
	 * 通过用户登录名和用户类型查询用户
	 * @param loginName
	 * @param userType
	 * @return
     */
	 public User getUserByLgginNameAndUserType(String loginName,String userType);

	/**
	 * 查询所有的用户
	 * @return
     */
	public List<User> selectAllUser();

	/***
	 *通过pkUser修改用户信息
	 * @param user
	 * @return
     */
	 public JsonResponseStatus updateUserByPkUser(User user);

	/**
	 * 删除用户通过用户主键
	 * @param pkUser
	 * @return
     */
	 public JsonResponseStatus deleteUserByPkUser(String pkUser);

	/**
	 * 插入用户
	 * @param user
	 * @return
     */
	public JsonResponseStatus insertUser(User user);

	/***
	 * 用户登录
	 * @param user
	 * @return
     */
	public JsonResponseStatus login(User user);
	/**
	 * 获取用户角色
	 * @param pkUser
	 * @return
     */
	public List<Role> getUserRoleByPkUser(String pkUser);

	/**
	 *删除用户角色
	 * @param pkUser
	 * @return
     */
	public JsonResponseStatus deleteUserRoleByPkUser(String pkUser,String pkRole);

	/**
	 * 添加用户角色
	 * @param userRoleKey
	 * @return
     */
	public JsonResponseStatus insertUserRoleByPkUser(UserRoleKey userRoleKey);

	/**
	 * 获取用户的一级资源
	 * @param pkuser
	 * @return
     */
	public List<Resource> getResourceByPkUser(String pkuser);


}
