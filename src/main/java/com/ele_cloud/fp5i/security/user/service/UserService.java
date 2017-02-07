package com.ele_cloud.fp5i.security.user.service;

import com.ele_cloud.fp5i.security.common.Authenticator;
import com.ele_cloud.fp5i.security.common.AuthenticatorManager;
import com.ele_cloud.fp5i.security.user.bean.User;
import com.ele_cloud.fp5i.security.user.bean.UserExample;
import com.ele_cloud.fp5i.security.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.List;

/**
 * User : zhiyong.li
 * Date : 2016/12/23
 * Time : 11:35
 */

@Service
public class UserService {
    private static final Logger logger = LogManager.getLogger(UserService.class);
    //token 失效时间
    static private final long TTLMILL=7200000l;//2hour for a valid token

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 通过pkUser查询用户数据
     * @param pkUser
     * @return
     */
  public User queryUserByPkUser(String pkUser){
    return userMapper.selectByPrimaryKey(pkUser);
    }

    /**
     * 查询所有的用户
     * @return
     */
    public List<User> selectAllUser(){
        UserExample userExample=new UserExample();
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    /**
     * 通过用户登录名和用户类型查询用户
     * @param loginName
     * @param userType
     * @return
     */
    public User getUserByLgginNameAndUserType(String loginName, String userType){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria= userExample.createCriteria();
        criteria.andLoginNameEqualTo(loginName);
        criteria.andUserTypeEqualTo(userType);
        List<User> users=userMapper.selectByExample(userExample);
        User user =null;
        if (users.size()>0){
             user=users.get(0);
        }
        return user;
    }

    /***
     *通过pkUser修改用户信息
     * @param user
     * @return
     */
    public int updateUserByPkUser(User user){
        int key = userMapper.updateByPrimaryKey(user);
        if(key>0){
            return key;
        }
        return 0;
    }

    /**
     * 删除用户通过用户主键
     * @param pkUser
     * @return
     */
    public int deleteUserByPkUser(String pkUser){
        int key = userMapper.deleteByPrimaryKey(pkUser);
        if (key>0){
            return key;
        }
        return 0;
    }

    /**
     * 插入用户
     * @param user
     * @return
     */
    public int insertUser(User user){
        int insert = userMapper.insert(user);
        if (insert>0){
            return insert;
        }
        return 0;
    }

    /***
     * 用户登录
     * @param user
     * @return
     */
    public String login(User user){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andLoginNameEqualTo(user.getLoginName());
        criteria.andLoginPasswordEqualTo(user.getLoginPassword());
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()){
            Authenticator authenticator = AuthenticatorManager.getInstance("JWT");
            String token = authenticator.buildToken(users.get(0).getPkUser(), "issuer", "subject", TTLMILL);
            return token;
        }
        return null;
    }


}
