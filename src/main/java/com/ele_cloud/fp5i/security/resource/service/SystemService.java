package com.ele_cloud.fp5i.security.resource.service;


import com.ele_cloud.fp5i.security.resource.bean.System;
import com.ele_cloud.fp5i.security.resource.bean.SystemExample;
import com.ele_cloud.fp5i.security.resource.mapper.SystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统service
 * User : zhiyong.li
 * Date : 2016/12/27
 * Time : 16:32
 */
@Service
public class SystemService {
    @Autowired
    private SystemMapper systemMapper;

    /**
     * 添加系统数据
     * @return
     */
    public Boolean insertSystem(System system){
        int insert = systemMapper.insert(system);
        return insert>0?true:false;
    }

    /***
     * 删除系统数据
     * @param systemId
     * @return
     */
    public Boolean deleteSystem(String systemId){
        int deleteByPrimaryKey = systemMapper.deleteByPrimaryKey(systemId);
        return deleteByPrimaryKey>0?true:false;
    }

    /**
     * 跟新系统数据
     * @param system
     * @return
     */
    public Boolean updateSystem(System system){
        int updateByPrimaryKey = systemMapper.updateByPrimaryKey(system);
        return  updateByPrimaryKey>0?true:false;
    }

    /**
     * 查询所有的系统数据
     * @return
     */
    public List<System> seleteAllSystem(){
        SystemExample systemExample = new SystemExample();
        List<System> systems = systemMapper.selectByExample(systemExample);
        return systems;
    }

    /**
     * 根据主键查询系统数据
     * @param systemId
     * @return
     */
    public  System seleteSystem(String systemId){
        System system = systemMapper.selectByPrimaryKey(systemId);
        return system;
    }
}
