package com.ele_cloud.fp5i.security.facade;

import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.resource.bean.System;

import java.util.List;

/**
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 15:53
 */
public interface SystemRestService {
    /**
     * 添加系统数据
     * @param system
     * @return
     */
    public JsonResponseStatus addSystem(System system);

    /***
     * 通过主键删除系统数据
     * @param systemId
     * @return
     */
    JsonResponseStatus delteteSystem(String systemId);

    /**
     * 跟新系统数据
     * @param system
     * @return
     */
    JsonResponseStatus updateSystem(System system);

    /***
     * 查询所有的系统数据
     * @return
     */
    List<System> selectAllSystem();

    /**
     * 通过主键查询系统数据
     * @param systemId
     * @return
     */
    System selecySystem(String systemId);

}
