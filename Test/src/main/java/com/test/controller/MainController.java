package com.test.controller;

import com.test.controller.BaseController;

import com.test.entity.MainEntity;
import com.test.service.MainService;
import com.test.service.SqlService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rencai/main")
@Api(value = "用户主表接口", description = "用户主表接口")
public class MainController extends BaseController {
    @Autowired
    private MainService mainService;
    @Autowired
    private SqlService sqlService;

    @GetMapping("login")
    @ApiImplicitParams(
            {@ApiImplicitParam("username"),
                    @ApiImplicitParam("phone"),
                    @ApiImplicitParam("openId")})
    @ApiOperation(value = "用户登录接口", notes = "用户登录接口")
    public JsonResult login(String username, String phone, String openId) {
        MainEntity mainEntity = new MainEntity();
        System.err.println(username);
        System.err.println(phone);
        System.err.println(openId);
        mainEntity.setUserName(username);
        mainEntity.setPhone(phone);
        mainEntity.setOpenId(openId);
        System.err.println(mainEntity);
        mainService.login(mainEntity);
        return new JsonResult(SUCCESS);
    }

    @GetMapping("reg")
    @ApiImplicitParam("用户注册接口")
    @ApiOperation(value = "当前登录用户的openId", notes = "当前登录用户的openId")
    public JsonResult<Void> reg(String openId) {
       String data=mainService.findStatusByOpenId(openId);
        return new JsonResult(SUCCESS,data);
    }


    @GetMapping("getInfo")
    @ApiImplicitParam("当前登录用户的openId")
    @ApiOperation(value = "获取当前登录用户的详细信息", notes = "获取当前登录用户的详细信息")
    public JsonResult<Void> getInfo(String openId) {
        JsonResult<Void> jsonResult = this.mainService.getUserByOpenId(openId);
        return jsonResult;
    }
}
