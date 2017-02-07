package com.ele_cloud.fp5i.security.resource.service;

import com.ele_cloud.fp5i.security.resource.bean.Resource;
import com.ele_cloud.fp5i.security.resource.bean.ResourceExample;
import com.ele_cloud.fp5i.security.resource.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 资源service
 * User : zhiyong.li
 * Date : 2016/12/26
 * Time : 17:05
 */
@Service
public class ResourceService {
@Autowired
private ResourceMapper resourceMapper;

    public void setResourceMapper(ResourceMapper resourceMapper){this.resourceMapper=resourceMapper;}

    /**
     * 查询资源数据
     * @param pkResource
     * @return
     */
    public Resource selectResource(String pkResource){
        Resource resource = resourceMapper.selectByPrimaryKey(pkResource);
        return resource;
    }

    /**
     * 查询所有的资源数据
     * @return
     */
    public List<Resource> selectAllResource(){
        ResourceExample resourceExample=new ResourceExample();
       return resourceMapper.selectByExample(resourceExample);
    }

    /**
     * 删除资源
     * @param pkResource
     * @return
     */
    public Boolean deleteResource(String pkResource){
        int key = resourceMapper.deleteByPrimaryKey(pkResource);
        if (key>0){
            return  true;
        }
        return  false;
    }

    /**
     * 添加资源
     * @param resource
     * @return
     */
    public Boolean insertResource(Resource resource){
        int insert = resourceMapper.insert(resource);
        if (insert>0){return  true;}
        return false;
    }

    /**
     * 修改资源
     * @param resource
     * @return
     */
    public Boolean updateResource(Resource resource){
        int key = resourceMapper.updateByPrimaryKey(resource);
        if (key>0){return true;}
        return false;
    }

    /**
     * 查询父节点下的子资源数据
     * @param resourceId
     * @return
     */
    public List<Resource> queryAllChildResourceByResourceId(String resourceId){
        ResourceExample resourceExample =new ResourceExample();
        ResourceExample.Criteria criteria=resourceExample.createCriteria();
        criteria.andResourceParentIdEqualTo(resourceId);
        resourceExample.setOrderByClause("resource_order desc");
        return resourceMapper.selectByExample(resourceExample);
    }
}
