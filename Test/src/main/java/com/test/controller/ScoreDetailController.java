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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rencai/scoreDetail")
@Api(value = "积分细节相关接口", description = "积分细节相关接口")
public class ScoreDetailController extends BaseController {
   @Autowired
   private ScoreDetailService scoreDetailService;

    @ApiOperation(value ="创建积分细节接口", notes = "创建积分细节接口")
    @PostMapping("addScoreDetail")
    @ApiImplicitParams({
            @ApiImplicitParam("积分变动细节实体对象"),
            @ApiImplicitParam("当前登录用户的openId")
    })
    public JsonResult<Void> getList(ScoreDetailEntity scoreDetailEntity,String openId) {
         scoreDetailService.createScoreDetail(scoreDetailEntity,openId);
        return new JsonResult(SUCCESS);
    }
}
