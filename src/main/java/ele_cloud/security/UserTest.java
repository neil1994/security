package ele_cloud.security;

import com.alibaba.dubbo.common.json.JSONObject;
import com.ele_cloud.fp5i.security.user.bean.User;
import com.ele_cloud.fp5i.security.userRole.bean.UserRoleKey;
import com.google.common.collect.Maps;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import javax.ws.rs.client.Entity;

import org.apache.curator.retry.RetryUntilElapsed;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.junit.Test;

import java.util.Date;
import java.util.Map;

/**
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 17:24
 */

public class UserTest {
    @Test
    public  void testAddUser(){
        //String url="http://localhost:8888/services/user/getUser/1";
//        String url="http://localhost:8888/services/user/queryUser/admin/admin";
//        String url="http://localhost:8888/services/user/selectAllUser";
//        String url="http://localhost:8888/services/user/update";
//        String url="http://localhost:8888/services/user/update";
//        String url="http://localhost:8888/services/user/deleteUser/2";
//        String url="http://localhost:8888/services/user/insert";
        String url="http://localhost:8088/services/user/login";
//        String url="http://localhost:8888/services/user/deleteUserRole/1/2";
//        String url="http://localhost:8888/services/user/insertUserRole";
//        String url="http://localhost:8888/services/user/getOneResource/1";
         String ss= TestUtil.requestUtil(url,"post",getUser());
        System.out.println(ss);
    }

    public User getUser(){
        User user=new User();
        user.setLoginName("admin");
        user.setLoginPassword(Base64.encode("admin".getBytes()));

        /*user.setPkUser("123456");
         user.setLastloginTime(new Date());
        user.setRegisterIp("192.168.96.8");
        user.setStatus("1");
        user.setRegisterTime(new Date());
        user.setTelephone("17710548664");
        user.setUserType("admin");
        user.setPkUser("2");*/
        return user;
    }
    public UserRoleKey getUserRoleKey(){
        UserRoleKey userRoleKey=new UserRoleKey();
        userRoleKey.setUserId("1");
        userRoleKey.setRoleId("2");
        return userRoleKey;
    }
}
