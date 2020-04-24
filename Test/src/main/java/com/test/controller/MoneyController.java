package com.test.controller;

import com.test.entity.ScoreDetailEntity;
import com.test.service.MoneyService;
import com.test.service.ScoreDetailService;
import com.test.service.ScoreService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rencai/money")
@Api(value = "总钱包相关接口", description = "总钱包相关接口")
public class MoneyController extends BaseController {
   @Autowired
   private MoneyService moneyService;

    @ApiOperation(value ="钱包总额查询接口", notes = "钱包总额查询接口")
    @GetMapping("getAll")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<Integer> getAll(String openId) {
        Integer date = moneyService.getMoneyByOpenId(openId);
        return new JsonResult(SUCCESS, date);
    }


}
