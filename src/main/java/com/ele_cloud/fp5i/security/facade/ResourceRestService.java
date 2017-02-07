package com.ele_cloud.fp5i.security.facade;

import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.resource.bean.Resource;

import java.util.List;

/**
 * 资源接口
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 15:37
 */
public interface ResourceRestService {
    /**
     * 添加资源
     * @param resource
     * @return
     */
    public JsonResponseStatus addResource(Resource resource);

    /**
     * 删除资源
     * @param resourceId
     * @return
     */
    public JsonResponseStatus deleteResource(String resourceId);

    /**
     * 修改资源
     * @param resource
     * @return
     */
    public JsonResponseStatus updateResource(Resource resource);

    /**
     * 查询所有的资源
     * @return
     */
    List<Resource> queryAllResource();

    /**
     * 通过主键查询资源
     * @param resopurceId
     * @return
     */
    Resource queryResource(String resopurceId);

    /**
     * 通过父节点查询所有的子资源
     * @param resourceId
     * @return
     */
    List<Resource> queryAllChildResourceByResourceId(String resourceId);

}
