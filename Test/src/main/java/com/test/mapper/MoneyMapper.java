package com.test.mapper;

import com.test.entity.MoneyEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyMapper {
    /**
     * 查看用户钱包总额
     * @param userId
     * @return
     */
    Integer moneyValueByUserId(Integer userId);

    /**
     * 修改钱包总额
     * @param userId
     * @param moneyValue
     * @return
     */
    Integer changeMoneyValue(Integer userId,Integer moneyValue);

    /**
     * 新用户登录创建用户钱包
     * @param moneyEntity
     * @return
     */
    Integer addMoney(MoneyEntity moneyEntity);
}
