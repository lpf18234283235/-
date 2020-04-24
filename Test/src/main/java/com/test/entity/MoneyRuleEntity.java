package com.test.entity;

import lombok.Data;

@Data
public class MoneyRuleEntity {
    private Integer id;
    //费率
    private double charge;
    //提现最小金额
    private Integer minValue;
    //提现类型
    private String type;
    //提现说明
    private String info;
}
