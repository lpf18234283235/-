package com.test.entity;



import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MoneyDetailEntity extends BaseEntity{
    private Integer moneyId;
    private Integer userId;
    private String moneyType;
    private Integer changeValue;

    public Integer getType() {
        return type;
    }

    public MoneyDetailEntity setType(Integer type) {
        this.type = type;
        return this;
    }


    private Integer type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    private Integer updateBy;
    private String remark;

    public Integer getMoneyId() {
        return moneyId;
    }

    public MoneyDetailEntity setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public MoneyDetailEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public MoneyDetailEntity setMoneyType(String moneyType) {
        this.moneyType = moneyType;
        return this;
    }

    public Integer getChangeValue() {
        return changeValue;
    }

    public MoneyDetailEntity setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
        return this;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public MoneyDetailEntity setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public MoneyDetailEntity setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public MoneyDetailEntity setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    @Override
    public String toString() {
        return "MoneyDetailEntity{" +
                "moneyId=" + moneyId +
                ", userId=" + userId +
                ", moneyType='" + moneyType + '\'' +
                ", changeValue=" + changeValue +
                ", type=" + type +
                ", updateDate=" + updateDate +
                ", updateBy=" + updateBy +
                ", remark='" + remark + '\'' +
                '}';
    }
}
