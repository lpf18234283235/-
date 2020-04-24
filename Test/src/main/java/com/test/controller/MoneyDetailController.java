package com.test.controller;

import com.test.entity.MoneyDetailEntity;
import com.test.entity.ScoreDetailEntity;
import com.test.service.MoneyDetailService;
import com.test.service.ScoreDetailService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rencai/moneyDetail")
@Api(value = "钱包细节相关接口", description = "钱包细节相关接口")
public class MoneyDetailController extends BaseController {
    @Autowired
    private MoneyDetailService moneyDetailService;

    @ApiOperation(value ="查看登录用户钱包变动详情接口", notes = "查看登录用户钱包变动详情接口")
    @GetMapping("getDetail")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<MoneyDetailEntity>> getList(String openId) {
       List<MoneyDetailEntity> date=moneyDetailService.getListByUserId(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value ="查看登录用户钱包变动状态详情接口", notes = "查看登录用户钱包变动状态详情接口")
    @GetMapping("getDetailByType")
    @ApiImplicitParams({
            @ApiImplicitParam("当前登录用户的openId"),
            @ApiImplicitParam("当前登录用户的openId")
    })
    public JsonResult<List<MoneyDetailEntity>> getListByType(String openId,String moneyType) {
        List<MoneyDetailEntity> date=moneyDetailService.getListByType(openId,moneyType);
        return new JsonResult(SUCCESS, date);
    }
}
