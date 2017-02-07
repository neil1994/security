package ele_cloud.security;

import com.ele_cloud.fp5i.security.resource.bean.Resource;
import org.junit.Test;

import java.util.Date;

/**
 * User : zhiyong.li
 * Date : 2016/12/28
 * Time : 15:56
 */
public class ResourceTest {
    @Test
    public void ResourceTest(){


//        String url="http://localhost:8888/services/resource/addResource";
//        String url="http://localhost:8888/services/resource/deleteResource/3";
//        String url="http://localhost:8888/services/resource/updateResource";
//        String url="http://localhost:8888/services/resource/queryAllResource";
//        String url="http://localhost:8888/services/resource/queryResource/1";
        String url="http://localhost:8888/services/resource/queryChildResource/1";
        String ss= TestUtil.requestUtil(url,"get",getResource());
    }

    public Resource getResource(){
        Resource resource=new Resource();
        resource.setPkResource("2");
        resource.setResourceName("DDDDDD");
        resource.setResourceCode("003");
        resource.setResourceType("0");
        resource.setResourceStatus("1");
        resource.setResourceUrl("ss/aa/dd.html");
        resource.setResourceOrder("3");
        resource.setCreateTime(new Date());
        resource.setCreatetor("AAAAA");
        resource.setResourceParentId("");
        resource.setSystemId("1");
        return resource;
    }
}
