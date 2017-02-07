package ele_cloud.security;

import com.ele_cloud.fp5i.security.role.bean.Role;
import com.ele_cloud.fp5i.security.roleResource.bean.RoleResourceKey;
import org.junit.Test;

import java.util.Date;

/**
 * User : zhiyong.li
 * Date : 2016/12/28
 * Time : 15:21
 */
public class RoleTest {
   @Test
   public void testRole(){
//       String url="http://localhost:8888/services/role/addRole";
//       String url="http://localhost:8888/services/role/deleteRole/3";
//       String url="http://localhost:8888/services/role/updateRole";
//       String url="http://localhost:8888/services/role/getRole/1";
//       String url="http://localhost:8888/services/role/queryAllRole";
//       String url="http://localhost:8888/services/role/seleteRoleResource/1";
//       String url="http://localhost:8888/services/role/addRoleResource";
       String url="http://localhost:8888/services/role/deleteRoleResource/2/1";
       String ss= TestUtil.requestUtil(url,"delete",null);
   }

    public Role getRole(){
        Role role=new Role();
        role.setPkRole("3");
        role.setRoleName("阿杜");
        role.setRoleCode("003");
        role.setAlias("AD");
        role.setStatus("1");
        role.setCreateTime(new Date());
        return  role;
    }

    public RoleResourceKey getRoleResourceKey(){
        RoleResourceKey roleResourceKey=new RoleResourceKey();
        roleResourceKey.setRoleId("2");
        roleResourceKey.setResourceId("1");
        return roleResourceKey;
    }


}
