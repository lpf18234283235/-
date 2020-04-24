package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MoneyEntity extends  BaseEntity{
    private Integer userId;
    private Integer money;
    private Integer updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    public Integer getUserId() {
        return userId;
    }

    public MoneyEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getMoney() {
        return money;
    }

    public MoneyEntity setMoney(Integer money) {
        this.money = money;
        return this;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public MoneyEntity setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public MoneyEntity setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    @Override
    public String toString() {
        return "MoneyEntity{" +
                "userId=" + userId +
                ", money=" + money +
                ", updateBy=" + updateBy +
                ", updateDate=" + updateDate +
                '}';
    }
}
