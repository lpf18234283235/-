package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.BaseEntity;
import com.test.entity.MainEntity;
import java.util.Date;
































public class MainEntity
        extends BaseEntity
{
    private static final long serialVersionUID = 1L;
    private Integer mainId;
    private String userName;
    private String phone;
    private String openId;
    private String userImage;
    private String userType;
    private String userAddress;
    private String userStatus;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date inTime;
    private String auditBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date auditTime;
    private String auditRemark;

    public static long getSerialVersionUID() { return 1L; }



    public Integer getMainId() { return this.mainId; }


    public MainEntity setMainId(Integer mainId) {
        this.mainId = mainId;
        return this;
    }


    public String getUserName() { return this.userName; }


    public MainEntity setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    public String getPhone() { return this.phone; }


    public MainEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }


    public String getOpenId() { return this.openId; }


    public MainEntity setOpenId(String openId) {
        this.openId = openId;
        return this;
    }


    public String getUserImage() { return this.userImage; }


    public MainEntity setUserImage(String userImage) {
        this.userImage = userImage;
        return this;
    }

    public String getUserAddress() { return this.userAddress; }


    public MainEntity setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }


    public String getUserType() { return this.userType; }


    public MainEntity setUserType(String userType) {
        this.userType = userType;
        return this;
    }


    public String getUserStatus() { return this.userStatus; }


    public MainEntity setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }


    public Date getInTime() { return this.inTime; }


    public MainEntity setInTime(Date inTime) {
        this.inTime = inTime;
        return this;
    }


    public String getAuditBy() { return this.auditBy; }


    public MainEntity setAuditBy(String auditBy) {
        this.auditBy = auditBy;
        return this;
    }


    public Date getAuditTime() { return this.auditTime; }


    public MainEntity setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
        return this;
    }


    public String getAuditRemark() { return this.auditRemark; }


    public MainEntity setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
        return this;
    }




    public String toString() { return "MainEntity{mainId=" + this.mainId + ", userName='" + this.userName + '\'' + ", phone='" + this.phone + '\'' + ", openId='" + this.openId + '\'' + ", userImage='" + this.userImage + '\'' + ", userType='" + this.userType + '\'' + ", userAddress='" + this.userAddress + '\'' + ", userStatus='" + this.userStatus + '\'' + ", inTime=" + this.inTime + ", auditBy='" + this.auditBy + '\'' + ", auditTime=" + this.auditTime + ", auditRemark='" + this.auditRemark + '\'' + '}'; }
}
