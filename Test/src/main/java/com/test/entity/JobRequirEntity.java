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
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String beginDate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String endDate;
    private String workAddress;
    private Integer requirPerson;
    private Integer salary;
    private String linkPhone;
    private String taskStatus;
    private Integer createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String createTime;
    private String auditBy;
    private Date auditTime;
    private String auditRemark;
    private String addressCode;
    private String education;
    private String experience;
    private Integer postId;
    private Integer type;

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


    public String getBeginDate() { return this.beginDate; }


    public JobRequirEntity setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }


    public String getEndDate() { return this.endDate; }


    public JobRequirEntity setEndDate(String endDate) {
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


    public String getCreateTime() { return this.createTime; }


    public JobRequirEntity setCreateTime(String createTime) {
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


    public String getEducation() {
        return education;
    }

    public JobRequirEntity setEducation(String education) {
        this.education = education;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public JobRequirEntity setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public JobRequirEntity setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public JobRequirEntity setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "JobRequirEntity{" +
                "requirId=" + requirId +
                ", userId=" + userId +
                ", requirName='" + requirName + '\'' +
                ", requirDesc='" + requirDesc + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", workAddress='" + workAddress + '\'' +
                ", requirPerson=" + requirPerson +
                ", salary=" + salary +
                ", linkPhone='" + linkPhone + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", auditBy='" + auditBy + '\'' +
                ", auditTime=" + auditTime +
                ", auditRemark='" + auditRemark + '\'' +
                ", addressCode='" + addressCode + '\'' +
                ", education='" + education + '\'' +
                ", experience='" + experience + '\'' +
                ", postId=" + postId +
                ", type=" + type +
                '}';
    }
}
