package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.ScoreDetailEntity;

import java.io.Serializable;
import java.util.Date;

public class ScoreDetailEntity implements Serializable {
    private Integer scoreId;
    private Integer userId;
    private String scoreType;

    public Integer getScoreId() {
        return this.scoreId;
    }

    private Integer changeValue;
    private Integer updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    private String remark;

    public ScoreDetailEntity setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
        return this;
    }


    public Integer getUserId() {
        return this.userId;
    }


    public ScoreDetailEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }


    public String getScoreType() {
        return this.scoreType;
    }


    public ScoreDetailEntity setScoreType(String scoreType) {
        this.scoreType = scoreType;
        return this;
    }


    public Integer getChangeValue() {
        return this.changeValue;
    }


    public ScoreDetailEntity setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
        return this;
    }


    public Integer getUpdateBy() {
        return this.updateBy;
    }


    public ScoreDetailEntity setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
        return this;
    }


    public Date getUpdateDate() {
        return this.updateDate;
    }


    public ScoreDetailEntity setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }


    public String getRemark() {
        return this.remark;
    }


    public ScoreDetailEntity setRemark(String remark) {
        this.remark = remark;
        return this;
    }


    public String toString() {
        return "ScoreDetailEntity{scoreId=" + this.scoreId + ", userId=" + this.userId + ", scoreType=" + this.scoreType + ", changeValue=" + this.changeValue + ", updateBy=" + this.updateBy + ", updateDate=" + this.updateDate + ", remark='" + this.remark + '\'' + '}';
    }
}
