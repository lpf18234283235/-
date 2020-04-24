package com.test.service.impl;

import com.test.entity.MoneyDetailEntity;
import com.test.entity.ScoreDetailEntity;
import com.test.entity.ScoreMinValueEntity;
import com.test.entity.ScoreRuleEntity;
import com.test.exception.ScoreOutOfException;
import com.test.mapper.ScoreMapper;
import com.test.service.*;
import com.test.service.impl.ScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ScoreServiceImpl
        implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private MainService mainService;
    @Autowired
    private ScoreDetailService scoreDetailService;
    @Autowired
    private MoneyDetailService moneyDetailService;
    @Autowired
    private MoneyService moneyService;
    @Autowired
    private ScoreRuleService scoreRuleService;
    @Autowired
    private ScoreMinValueService scoreMinValueService;

    public void updateScoreValue(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        Integer score = this.scoreDetailService.countScore(openId);
        this.scoreMapper.changeValue(score, userId);
    }

    @Override
    public void scoreAdd(String openId, Integer scoreValue) {

    }

    @Transactional
    public void scoreReduce(String openId, Integer scoreValue) {
        Integer minScore=scoreMinValueService.getMinValue();
        Integer userId = mainService.findIdByOpenId(openId);
        Integer scoreOld = getScore(openId);
        if(minScore>scoreValue||scoreOld<scoreValue){
            throw new ScoreOutOfException("兑换积分超出您的积分总额或不足兑换门槛");
        }
        System.err.println("scoreOld" + scoreOld);
        Integer scoreNew = scoreOld - scoreValue;
        System.err.println("scoreNew" + scoreNew);
        scoreMapper.changeValue(scoreNew, userId);
        ScoreDetailEntity scoreDetailEntity = new ScoreDetailEntity();
        scoreDetailEntity.setRemark("积分兑换")
                .setScoreType("-")
                .setChangeValue(scoreValue);

        scoreDetailService.createScoreDetail(scoreDetailEntity, openId);
        System.err.println("scoreDetailEntity" + scoreDetailEntity);
        System.err.println("openId" + openId);
        List<ScoreRuleEntity> list = scoreRuleService.allList();
        Integer moneyValue = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            System.err.println(list.size());
            Integer score = list.get(i).getScoreValue();
            while (scoreValue >= score) {
                int s = scoreValue / score;
                System.err.println("s:" + s);
                if (s > 0) {
                    moneyValue += s * list.get(i).getMoney();
                    System.err.println("moneyValue" + moneyValue);
                    scoreValue -= score * s;
                    System.err.println("scoreValue" + scoreValue);
                }
          /*  Integer score=list.get(i).getScoreValue();
            System.err.println(score);
            if(scoreValue>score){
                int s=scoreValue/score;
                if(s>0) {
                    moneyValue += s * list.get(i).getMoney();
                    System.err.println(moneyValue);
                    scoreValue -= score;
                    System.err.println(scoreValue);
                }
            }*/
            }
        }
            System.err.println("scoreDetailEntity" + scoreDetailEntity);
            System.err.println("openId" + openId);
            MoneyDetailEntity moneyDetailEntity = new MoneyDetailEntity();
            moneyDetailEntity.setChangeValue(moneyValue).setMoneyType("+").setType(2).setRemark("积分兑换");
            System.err.println(moneyDetailEntity);
            moneyDetailService.insertMoneyDetail(moneyDetailEntity, openId);
            Integer money = moneyService.getMoneyByOpenId(openId);
            System.err.println("money" + money);
            Integer moneyNew = money + moneyValue;
            System.err.println("moneyNew" + moneyNew);
            moneyService.changeValue(openId, moneyNew);
        }

    @Override
    public Integer getScore(String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        return scoreMapper.getScoreValue(userId);
    }
}

