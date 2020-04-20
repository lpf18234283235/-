package com.test.controller;

import com.test.controller.BaseController;
import com.test.controller.ScoreController;
import com.test.entity.ScoreDetailEntity;
import com.test.service.ScoreDetailService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rencai/score")
@Api(value = "积分相关接口", description = "积分相关接口")
public class ScoreController  extends BaseController {
    @Autowired
    private ScoreDetailService scoreVOService;

    @ApiOperation(value ="积分详情接口", notes = "积分详情接口")
    @GetMapping("getDetail")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<Void> getList(String openId) {
        List<ScoreDetailEntity> date = this.scoreVOService.findById(openId);
        return new JsonResult(SUCCESS, date);
    }
}
