package com.ele_cloud.fp5i.security.resource.bean;

import java.util.Date;

public class System {
    private String pkSystem;

    private String systemName;

    private String systemCode;

    private String systemStatus;

    private Date createTime;

    private String createtor;

    public String getPkSystem() {
        return pkSystem;
    }

    public void setPkSystem(String pkSystem) {
        this.pkSystem = pkSystem == null ? null : pkSystem.trim();
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    public String getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(String systemStatus) {
        this.systemStatus = systemStatus == null ? null : systemStatus.trim();
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
}