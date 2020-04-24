package com.test.service;

import com.test.entity.MoneyEntity;

public interface MoneyService {
    /**
     * 查看登录用户的钱包总额
     * @param openId
     * @return
     */
    Integer getMoneyByOpenId(String openId);

    /**
     * 修改钱包总额
     * @param openId
     * @param moneyValue
     */
    void changeValue(String openId,Integer moneyValue);

    /**
     * 新用户登录创建钱包管理
     * @param openId
     * @param moneyEntity
     */
    void insertMoney(String openId, MoneyEntity moneyEntity);
}
