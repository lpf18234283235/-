package com.test.service.impl;

import com.test.entity.CompanyEntity;
import com.test.entity.FreemanEntity;
import com.test.entity.MainEntity;
import com.test.entity.TeamEntity;

import com.test.exception.StatusNotAllowException;
import com.test.exception.UserNotFoundException;
import com.test.mapper.MainMapper;
import com.test.service.CompanyService;
import com.test.service.FreemanService;
import com.test.service.MainService;
import com.test.service.TeamService;
import com.test.util.JsonResult;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MainServiceImpl
        implements MainService {
    @Autowired
    MainMapper mainMapper;
    @Autowired
    FreemanService freemanService;
    @Autowired
    CompanyService companyService;
    @Autowired
    TeamService teamService;

    public JSONObject sqlExec(String sqlName, String[] parameter) {
        return null;
    }


    public void login(MainEntity mainEntity) {
        mainEntity.setUserStatus("0");
        String openId = mainEntity.getOpenId();
        MainEntity mainEntity1 = this.mainMapper.getMainByOpenId(openId);
        if (mainEntity1 == null) {
            this.mainMapper.insertMain(mainEntity);
        }
    }


    public Integer findIdByOpenId(String openId) {
        Integer userId = this.mainMapper.getIdByOpenId(openId);
        if (userId == null) {
            throw new UserNotFoundException("");
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
            return new JsonResult(Integer.valueOf(0), companyEntity);
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
}
