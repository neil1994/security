package com.ele_cloud.fp5i.security.restimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.facade.SystemRestService;
import com.ele_cloud.fp5i.security.resource.bean.System;
import com.ele_cloud.fp5i.security.resource.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 系统接口实现Bean
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 16:29
 */
@Service
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Path("system")
  public class SystemRestServiceImpl implements SystemRestService {
    @Autowired
    private SystemService systemService;

  public void setSystemService(SystemService systemService){
    this.systemService=systemService;
  }
  /***
     * 添加系统数据
     * @param system
     * @return
     */
    @Path("addSystem")
    @POST
    @Override
    public JsonResponseStatus addSystem(System system) {
        Boolean insertSystem = systemService.insertSystem(system);
        return insertSystem?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"addSystem"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"addSystem");
    }

    /***
     * 根据主键删除系统数据
     * @param systemId
     * @return
     */
    @Path("deleteSystem/{systemId}")
    @DELETE
    @Override
    public JsonResponseStatus delteteSystem(@PathParam("systemId") String systemId) {
        Boolean deleteSystem = systemService.deleteSystem(systemId);
        return deleteSystem?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"deleteSystem"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"deleteSystem");
    }

    /**
     * 根据主键跟新系统数据
     * @param system
     * @return
     */
    @Path("updateSystem")
    @PUT
    @Override
    public JsonResponseStatus updateSystem(System system) {
        Boolean updateSystem = systemService.updateSystem(system);
        return updateSystem?new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"updateSystem"):new JsonResponseStatus(JsonResponseStatus.Status.FAILURE,"updateSystem");
    }

    /**
     * 查询所有的系统数据
     * @return
     */
    @Path("selectAllSystem")
    @GET
    @Override
    public List<System> selectAllSystem() {
        return systemService.seleteAllSystem();
    }

    /**
     * 根据主键查询系统信息
     * @param systemId
     * @return
     */
    @Path("selecySystem/{systemId}")
    @GET
    @Override
    public System selecySystem(@PathParam("systemId") String systemId) {
        return systemService.seleteSystem(systemId);
    }

}
