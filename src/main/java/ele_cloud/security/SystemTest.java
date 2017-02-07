package ele_cloud.security;

import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.resource.bean.System;
import org.junit.Test;

import java.util.Date;

/**
 * User : zhiyong.li
 * Date : 2016/12/28
 * Time : 16:17
 */
public class SystemTest {

    private System system;

    @Test
    public void ResourceTest(){


//        String url="http://localhost:8888/services/system/addSystem";
//        String url="http://localhost:8888/services/system/deleteSystem/2";
//        String url="http://localhost:8888/services/system/updateSystem";
//        String url="http://localhost:8888/services/system/selectAllSystem";
        String url="http://localhost:8888/services/system/selecySystem/2";
        String ss= TestUtil.requestUtil(url,"get",getSystem());
    }

    public System getSystem(){
        System system=new System();
        system.setPkSystem("2");
        system.setSystemName("企业22222");
        system.setSystemCode("0022222");
        system.setSystemStatus("1");
        system.setCreateTime(new Date());
        system.setCreatetor("DDDDDssdsdsds");
        return system;
    }
}
