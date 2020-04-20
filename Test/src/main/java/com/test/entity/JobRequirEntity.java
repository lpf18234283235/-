package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.BaseEntity;
import com.test.entity.JobRequirEntity;
import java.util.Date;














public class JobRequirEntity
        extends BaseEntity
{
    private Integer requirId;
    private Integer userId;
    private String requirName;
    private String requirDesc;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date beginDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endDate;
    private String workAddress;
    private Integer requirPerson;
    private Integer salary;
    private String linkPhone;
    private String taskStatus;
    private Integer createBy;
    private Date createTime;
    private String auditBy;
    private Date auditTime;
    private String auditRemark;
    private String addressCode;

    public String getAddressCode() { return this.addressCode; }


    public JobRequirEntity setAddressCode(String addressCode) {
        this.addressCode = addressCode;
        return this;
    }





    public Integer getRequirId() { return this.requirId; }


    public JobRequirEntity setRequirId(Integer requirId) {
        this.requirId = requirId;
        return this;
    }


    public Integer getUserId() { return this.userId; }


    public JobRequirEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }


    public String getRequirName() { return this.requirName; }


    public JobRequirEntity setRequirName(String requirName) {
        this.requirName = requirName;
        return this;
    }


    public String getRequirDesc() { return this.requirDesc; }


    public JobRequirEntity setRequirDesc(String requirDesc) {
        this.requirDesc = requirDesc;
        return this;
    }


    public Date getBeginDate() { return this.beginDate; }


    public JobRequirEntity setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }


    public Date getEndDate() { return this.endDate; }


    public JobRequirEntity setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }


    public String getWorkAddress() { return this.workAddress; }


    public JobRequirEntity setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
        return this;
    }


    public Integer getRequirPerson() { return this.requirPerson; }


    public JobRequirEntity setRequirPerson(Integer requirPerson) {
        this.requirPerson = requirPerson;
        return this;
    }


    public Integer getSalary() { return this.salary; }


    public JobRequirEntity setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }


    public String getLinkPhone() { return this.linkPhone; }


    public JobRequirEntity setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
        return this;
    }


    public String getTaskStatus() { return this.taskStatus; }


    public JobRequirEntity setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }


    public Integer getCreateBy() { return this.createBy; }


    public JobRequirEntity setCreateBy(Integer createBy) {
        this.createBy = createBy;
        return this;
    }


    public Date getCreateTime() { return this.createTime; }


    public JobRequirEntity setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }


    public String getAuditBy() { return this.auditBy; }


    public JobRequirEntity setAuditBy(String auditBy) {
        this.auditBy = auditBy;
        return this;
    }


    public Date getAuditTime() { return this.auditTime; }


    public JobRequirEntity setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
        return this;
    }


    public String getAuditRemark() { return this.auditRemark; }


    public JobRequirEntity setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
        return this;
    }




    public String toString() { return "JobRequirEntity{requirId=" + this.requirId + ", userId=" + this.userId + ", requirName='" + this.requirName + '\'' + ", requirDesc='" + this.requirDesc + '\'' + ", beginDate=" + this.beginDate + ", endDate=" + this.endDate + ", workAddress='" + this.workAddress + '\'' + ", requirPerson=" + this.requirPerson + ", salary=" + this.salary + ", linkPhone='" + this.linkPhone + '\'' + ", taskStatus='" + this.taskStatus + '\'' + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", auditBy='" + this.auditBy + '\'' + ", auditTime=" + this.auditTime + ", auditRemark='" + this.auditRemark + '\'' + ", addressCode='" + this.addressCode + '\'' + '}'; }
}
