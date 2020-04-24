package com.test.controller;

import com.test.entity.DistrictEntity;
import com.test.entity.ScoreInfoEntity;
import com.test.entity.ScoreRuleEntity;
import com.test.service.ScoreInfoService;
import com.test.service.ScoreRuleService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rencai/scoreRule")
@Api(value = "积分规则相关接口", description = "积分规则相关接口")
public class ScoreRuleController extends BaseController {
    @Autowired
    private ScoreRuleService scoreRuleService;

    @ApiOperation(value = "查看所有积分规则", notes = "查看所有积分规则")
    @GetMapping("/list")
    public JsonResult<List<DistrictEntity>> getAllRule() {
      List<ScoreRuleEntity> data=scoreRuleService.allList();
        return new JsonResult(SUCCESS, data);
    }
}
