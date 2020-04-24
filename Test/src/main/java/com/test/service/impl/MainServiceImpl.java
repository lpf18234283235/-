package com.test.service.impl;

import com.test.entity.*;

import com.test.exception.StatusNotAllowException;
import com.test.exception.UserNotFoundException;
import com.test.mapper.MainMapper;
import com.test.service.*;
import com.test.util.JsonResult;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
public class MainServiceImpl
        implements MainService {
    private String remark = "新用户登录赠送积分";
    @Autowired
    MainMapper mainMapper;
    @Autowired
    FreemanService freemanService;
    @Autowired
    CompanyService companyService;
    @Autowired
    TeamService teamService;
    @Autowired
    ScoreDetailService scoreDetailService;
    @Autowired
    ScoreInfoService scoreInfoService;
    @Autowired
    MoneyService moneyService;

    public JSONObject sqlExec(String sqlName, String[] parameter) {
        return null;
    }

    @Transactional
    public void login(MainEntity mainEntity) {
        mainEntity.setUserStatus("0");
        String openId = mainEntity.getOpenId();
        System.err.println(openId);
        System.err.println(1111111);
        MainEntity mainEntity1 = this.mainMapper.getMainByOpenId(openId);
        System.err.println(222222);
        if (mainEntity1 == null) {
            this.mainMapper.insertMain(mainEntity);
            Integer i=1;
            Integer score=scoreInfoService.getScoreById(i);
            System.err.println(score);
            Integer userId=mainMapper.getIdByOpenId(openId);
            ScoreDetailEntity scoreDetailEntity=new ScoreDetailEntity();
            scoreDetailEntity.setScoreType("+").setChangeValue(score)
                    .setRemark(remark);
            System.err.println(scoreDetailEntity);
            scoreDetailService.createScoreDetail(scoreDetailEntity,openId);
            MoneyEntity moneyEntity=new MoneyEntity();
            moneyEntity.setMoney(0);
            moneyService.insertMoney(openId,moneyEntity);
        }

    }


    public Integer findIdByOpenId(String openId) {
        Integer userId = this.mainMapper.getIdByOpenId(openId);
        if (userId == null) {
            throw new UserNotFoundException("用户未找到");
        }
        return userId;
    }


    public void replaceById(MainEntity mainEntity) {
        this.mainMapper.replaceMain(mainEntity);
    }


    public String findUsernameByOpenId(String openId) {
        return this.mainMapper.getUsernameByOpenId(openId);
    }


    public String findStatusByOpenId(String openId) {
        return mainMapper.getStatusByOpenId(openId);
    }


    public String getStatusByOpenId(String openId) {
        return this.mainMapper.getStatusByOpenId(openId);
    }


    public JsonResult<Void> getUserByOpenId(String openId) {
        String type = this.mainMapper.getTypeByOpenId(openId);
        Integer userId = this.mainMapper.getIdByOpenId(openId);
        if (type.equals("1")) {
            CompanyEntity companyEntity = this.companyService.selectById(userId);
            return new JsonResult(0, companyEntity);
        }
        if (type.equals("2")) {
            TeamEntity teamEntity = this.teamService.selectById(userId);
            return new JsonResult(Integer.valueOf(0), teamEntity);
        }
        FreemanEntity freemanEntity = this.freemanService.selectById(userId);
        return new JsonResult(Integer.valueOf(0), freemanEntity);
    }


    public MainEntity findMainByOpenId(String openId) {
        MainEntity mainEntity = this.mainMapper.getMainByOpenId(openId);
        if (mainEntity == null) {
            throw new UserNotFoundException("");
        }
        return mainEntity;
    }


    public void changeStatusByMainId(Integer mainId) {
        this.mainMapper.updateStataus(mainId);
    }

    @Override
    public MainEntity findMainByMainId(Integer mainId) {
        return mainMapper.getMainByMainId(mainId);
    }
}
