package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class InterviewNoticeEntity {
    private  Integer id;
    //甲方id
    private Integer userIdA;
    //甲方名称
    private String userAName;
    //甲方电话
    private String phone;
    //乙方id
   private Integer userIdB;
    //乙方名称
    private String userBName;
    //岗位id
    private String postName;
    //面试时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date interviewTime;
    //面试地点
    private String interviewAddress;
    //面试说明
    private String interviewInfo;
    //面试状态
    private Integer interviewStatus;




    @Override
    public String toString() {
        return "InterviewNoticeEntity{" +
                "id=" + id +
                ", userIdA=" + userIdA +
                ", userAName='" + userAName + '\'' +
                ", phone='" + phone + '\'' +
                ", userIdB=" + userIdB +
                ", userBName='" + userBName + '\'' +
                ", postName='" + postName + '\'' +
                ", interviewTime=" + interviewTime +
                ", interviewAddress='" + interviewAddress + '\'' +
                ", interviewInfo='" + interviewInfo + '\'' +
                ", interviewStatus=" + interviewStatus +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public InterviewNoticeEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserIdA() {
        return userIdA;
    }

    public InterviewNoticeEntity setUserIdA(Integer userIdA) {
        this.userIdA = userIdA;
        return this;
    }

    public String getUserAName() {
        return userAName;
    }

    public InterviewNoticeEntity setUserAName(String userAName) {
        this.userAName = userAName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public InterviewNoticeEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Integer getUserIdB() {
        return userIdB;
    }

    public InterviewNoticeEntity setUserIdB(Integer userIdB) {
        this.userIdB = userIdB;
        return this;
    }

    public String getUserBName() {
        return userBName;
    }

    public InterviewNoticeEntity setUserBName(String userBName) {
        this.userBName = userBName;
        return this;
    }

    public String getPostName() {
        return postName;
    }

    public InterviewNoticeEntity setPostName(String postName) {
        this.postName = postName;
        return this;
    }

    public Date getInterviewTime() {
        return interviewTime;
    }

    public InterviewNoticeEntity setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
        return this;
    }

    public String getInterviewAddress() {
        return interviewAddress;
    }

    public InterviewNoticeEntity setInterviewAddress(String interviewAddress) {
        this.interviewAddress = interviewAddress;
        return this;
    }

    public String getInterviewInfo() {
        return interviewInfo;
    }

    public InterviewNoticeEntity setInterviewInfo(String interviewInfo) {
        this.interviewInfo = interviewInfo;
        return this;
    }

    public Integer getInterviewStatus() {
        return interviewStatus;
    }

    public InterviewNoticeEntity setInterviewStatus(Integer interviewStatus) {
        this.interviewStatus = interviewStatus;
        return this;
    }
}
