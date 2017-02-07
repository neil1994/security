package com.ele_cloud.fp5i.security.roleResource.bean;

public class RoleResourceKey {
    private String roleId;

    private String resourceId;

    public RoleResourceKey() {
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public RoleResourceKey(String roleId, String resourceId) {
        this.roleId = roleId;
        this.resourceId = resourceId;
    }
}