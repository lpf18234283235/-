package com.test.service.impl;

import com.test.entity.MoneyEntity;
import com.test.exception.UpdateException;
import com.test.mapper.MoneyMapper;
import com.test.service.MainService;
import com.test.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;
    @Autowired
    private MainService mainService;
    @Override
    public Integer getMoneyByOpenId(String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        return moneyMapper.moneyValueByUserId(userId);
    }

    @Override
    public void changeValue(String openId, Integer moneyValue) {
        Integer userId=mainService.findIdByOpenId(openId);
        Integer row=moneyMapper.changeMoneyValue(userId,moneyValue);
        if(row<1){
            throw new UpdateException("修改失败，请稍后重试");
        }
    }

    @Override
    public void insertMoney(String openId, MoneyEntity moneyEntity) {
        Integer userId=mainService.findIdByOpenId(openId);
        moneyEntity.setUserId(userId).setUpdateBy(userId).setUpdateDate(new Date());
        moneyMapper.addMoney(moneyEntity);
    }
}
