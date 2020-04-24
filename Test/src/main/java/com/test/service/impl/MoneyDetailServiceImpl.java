package com.test.service.impl;

import com.test.entity.MoneyDetailEntity;
import com.test.mapper.MoneyDetailMapper;
import com.test.service.MainService;
import com.test.service.MoneyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class MoneyDetailServiceImpl implements MoneyDetailService {
    @Autowired
    private MoneyDetailMapper moneyDetailMapper;
    @Autowired
    private MainService mainService;
    @Override
    public List<MoneyDetailEntity> getListByUserId(String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        return moneyDetailMapper.getListByUserId(userId);
    }

    @Override
    public List<MoneyDetailEntity> getListByType(String openId, String moneyType) {
        Integer userId=mainService.findIdByOpenId(openId);
        return moneyDetailMapper.listByType(userId,moneyType);
    }

    @Override
    public void insertMoneyDetail(MoneyDetailEntity moneyDetailEntity, String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        moneyDetailEntity.setUserId(userId);
        moneyDetailEntity.setUpdateBy(userId);
        moneyDetailEntity.setUpdateDate(new Date());
        System.err.println(moneyDetailEntity);
        moneyDetailMapper.add(moneyDetailEntity);
    }
}
