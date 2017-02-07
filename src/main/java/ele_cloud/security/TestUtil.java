package ele_cloud.security;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 * 请求工具类
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 17:26
 */
public class TestUtil {

    public static String requestUtil(String url, String requestType, Object model){

        System.out.println("请求路径为： " + url);
        MediaType mediaType=MediaType.APPLICATION_JSON_TYPE;
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
        Response response=null;
        switch (requestType){
            case "delete":response = target.request().delete();
                break;
            case "post": response = target.request().post(Entity.entity(model, mediaType));
                break;
            case "put":response = target.request().put(Entity.entity(model, mediaType));
                break;
            case "get":response = target.request().get();
                break;
            default: break;
        }
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed with HTTP error code : " + response.getStatus());
        }
        String tt=response.readEntity(String.class);
        System.out.println("Successfully got result: " + tt);


        return tt;
    }
}
