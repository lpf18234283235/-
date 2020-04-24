package com.test.service;

import com.test.entity.MoneyDetailEntity;

import java.util.List;

public interface MoneyDetailService {
    /**
     * 查看指定用戶的錢包細節
     * @param openId 用户openId
     * @return
     */
    List<MoneyDetailEntity> getListByUserId(String openId);

    List<MoneyDetailEntity> getListByType(String openId, String moneyType);

    /**
     * 创建钱包变动记录
     * @param moneyDetailEntity
     * @param openId
     */
    void insertMoneyDetail(MoneyDetailEntity moneyDetailEntity,String openId);
}
