package com.ele_cloud.fp5i.security.resource.bean;

import java.util.Date;

public class Resource {
    private String pkResource;

    private String resourceName;

    private String resourceCode;

    private String resourceType;

    private String resourceStatus;

    private String resourceUrl;

    private String resourceParentId;

    private String resourceOrder;

    private Date createTime;

    private String createtor;

    private String systemId;



    public String getPkResource() {
        return pkResource;
    }

    public void setPkResource(String pkResource) {
        this.pkResource = pkResource == null ? null : pkResource.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode == null ? null : resourceCode.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus == null ? null : resourceStatus.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public String getResourceParentId() {
        return resourceParentId;
    }

    public void setResourceParentId(String resourceParentId) {
        this.resourceParentId = resourceParentId == null ? null : resourceParentId.trim();
    }

    public String getResourceOrder() {
        return resourceOrder;
    }

    public void setResourceOrder(String resourceOrder) {
        this.resourceOrder = resourceOrder == null ? null : resourceOrder.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatetor() {
        return createtor;
    }

    public void setCreatetor(String createtor) {
        this.createtor = createtor == null ? null : createtor.trim();
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }
}