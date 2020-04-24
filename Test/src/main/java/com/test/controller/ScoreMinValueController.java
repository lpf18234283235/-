package com.test.controller;

import com.test.entity.ScoreDetailEntity;
import com.test.entity.ScoreMinValueEntity;
import com.test.service.ScoreDetailService;
import com.test.service.ScoreMinValueService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rencai/scoreMinValue")
@Api(value = "积分兑换门槛接口", description = "积分兑换门槛接口")
public class ScoreMinValueController extends BaseController {
   @Autowired
   private ScoreMinValueService scoreMinValueService;

    @ApiOperation(value ="查看积分兑换门槛及金额", notes = "查看积分兑换门槛及金额")
    @GetMapping("minValue")
    public JsonResult<Integer> getMinValue() {
        Integer data=scoreMinValueService.getMinValue();
        return new JsonResult(SUCCESS,data);
    }
}
