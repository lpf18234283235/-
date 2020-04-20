package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.entity.BaseEntity;
import com.test.entity.ScoreEntity;
import java.util.Date;

public class ScoreEntity extends BaseEntity {
    private Integer userId;
    private Integer scoreValue;
    private String updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    public Integer getUserId() { return this.userId; }


    public ScoreEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }


    public Integer getScoreValue() { return this.scoreValue; }


    public ScoreEntity setScoreValue(Integer scoreValue) {
        this.scoreValue = scoreValue;
        return this;
    }


    public String getUpdateBy() { return this.updateBy; }


    public ScoreEntity setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }


    public Date getUpdateDate() { return this.updateDate; }


    public ScoreEntity setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }



    public String toString() { return "ScoreEntity{userId=" + this.userId + ", scoreValue=" + this.scoreValue + ", updateBy='" + this.updateBy + '\'' + ", updateDate=" + this.updateDate + '}'; }
}
