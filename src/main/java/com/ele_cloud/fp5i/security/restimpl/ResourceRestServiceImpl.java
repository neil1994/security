package com.ele_cloud.fp5i.security.restimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.facade.ResourceRestService;
import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.resource.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 资源接口实现Bean
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 16:01
 */

@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Path("resource")
@Service
public class ResourceRestServiceImpl implements ResourceRestService {
    @Autowired
    private ResourceService resourceService;

    public void setResourceService(ResourceService resourceService){
        this.resourceService=resourceService;
    }

    /**
     * 添加资源数据
     * @param resource
     * @return
     */
    @Path("addResource")
    @POST
    @Override
    public JsonResponseStatus addResource(Resource resource) {
        Boolean insertResource = resourceService.insertResource(resource);
        return insertResource?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"addResource"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"addResource");
    }

    /***
     * 删除资源数据
     * @param resourceId
     * @return
     */
    @Path("deleteResource/{resourceId}")
    @DELETE
    @Override
    public JsonResponseStatus deleteResource(@PathParam("resourceId") String resourceId) {
        Boolean deleteResource = resourceService.deleteResource(resourceId);
        return deleteResource?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"deleteResource"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"deleteResource");
    }

    /***
     * 跟新资源数据
     * @param resource
     * @return
     */
    @Path("updateResource")
    @PUT
    @Override
    public JsonResponseStatus updateResource(Resource resource) {
        Boolean updateResource = resourceService.updateResource(resource);
        return updateResource?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"updateResource"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"updateResource");
    }

    /**
     * 查询所有的资源
     * @return
     */
    @Path("queryAllResource")
    @GET
    @Override
    public List<Resource> queryAllResource() {
        return resourceService.selectAllResource();
    }

    /***
     * 通过主键查询资源数据
     * @param resopurceId
     * @return
     */
    @Path("queryResource/{resopurceId}")
    @GET
    @Override
    public Resource queryResource(@PathParam("resopurceId") String resopurceId) {
        return resourceService.selectResource(resopurceId);
    }

    /**
     * 查询父节点下的子资源数据
     * @param resourceId
     * @return
     */
    @Path("queryChildResource/{resourceId}")
    @GET
    @Override
    public List<Resource> queryAllChildResourceByResourceId(@PathParam("resourceId") String resourceId) {
        List<Resource> resources = resourceService.queryAllChildResourceByResourceId(resourceId);
        return resources;
    }

}
