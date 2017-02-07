package com.ele_cloud.fp5i.security.userRole.service;

import com.ele_cloud.fp5i.security.userRole.bean.UserRoleExample;
import com.ele_cloud.fp5i.security.userRole.bean.UserRoleKey;
import com.ele_cloud.fp5i.security.userRole.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User : zhiyong.li
 * Date : 2016/12/26
 * Time : 15:07
 */
@Service
public class UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 设置用户角色管理Mapper
     * @param userRoleMapper
     */
    public void setUserRoleMapper(UserRoleMapper userRoleMapper){
        this.userRoleMapper=userRoleMapper;
    }

    /**
     * 通过用户pk查询用户下的角色数据
     * @param pkUser
     * @return
     */
    public List<UserRoleKey> selectUserRoleByPkUser(String pkUser){
        UserRoleExample userRoleExample=new UserRoleExample();
        UserRoleExample.Criteria criteria=userRoleExample.createCriteria();
        criteria.andUserIdEqualTo(pkUser);
        List<UserRoleKey> roleKeys = userRoleMapper.selectByExample(userRoleExample);
        return roleKeys;
    }

    /**
     * 新增用户角色
     * @param  userRoleKey
     * @return
     */
    public Boolean insertUserRole(UserRoleKey userRoleKey){
        int insert = userRoleMapper.insert(userRoleKey);
        if (insert>0){
            return true;
        }
        return false;
    }

    /**
     * 刪除用戶的角色
     * @param userId
     * @param roleId
     * @return
     */
    public Boolean deleteUserRole(String userId,String roleId){
        UserRoleKey userRoleKey=new UserRoleKey();
        userRoleKey.setRoleId(roleId);
        userRoleKey.setUserId(userId);
        int i = userRoleMapper.deleteByPrimaryKey(userRoleKey);
        if (i>0){
            return  true;
        }
        return false;
    }

}
