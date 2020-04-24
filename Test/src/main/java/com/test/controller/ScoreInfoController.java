package com.test.controller;

import com.test.entity.DistrictEntity;
import com.test.entity.PostEntity;
import com.test.entity.ScoreInfoEntity;
import com.test.service.PostService;
import com.test.service.ScoreInfoService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rencai/scoreInfo")
@Api(value = "积分说明相关接口", description = "积分说明相关接口")
public class ScoreInfoController extends BaseController {
    @Autowired
    private ScoreInfoService scoreInfoService;

    @ApiOperation(value = "查看所有积分说明", notes = "查看所有积分说明")
    @GetMapping("/list")
    public JsonResult<List<DistrictEntity>> getAllInfo() {
      List<ScoreInfoEntity> data=scoreInfoService.getList();
        return new JsonResult(SUCCESS, data);
    }
}
