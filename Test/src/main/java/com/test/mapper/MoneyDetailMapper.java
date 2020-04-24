package com.test.mapper;

import com.test.entity.MoneyDetailEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoneyDetailMapper {
    /**
     * 查看指定用户的钱包变动记录
     * @param userId 用户id
     * @return
     */
    List<MoneyDetailEntity> getListByUserId(Integer userId);

    /**查看不同类型的钱包变动记录
     * @param userId
     * @param moneyType 变动类型
     * @return
     */
    List<MoneyDetailEntity> listByType(Integer userId,String moneyType);

    /**
     * 创建钱包变动记录
     * @param moneyDetailEntity
     * @return
     */
    Integer add(MoneyDetailEntity moneyDetailEntity);



}
