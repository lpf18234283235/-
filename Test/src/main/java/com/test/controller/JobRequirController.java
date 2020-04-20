package com.test.controller;


import com.test.entity.JobRequirEntity;
import com.test.service.JobRequirService;
import com.test.service.SqlService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rencai/job")
@Api(value = "用工需求接口", description = "用工需求接口")
public class JobRequirController extends BaseController {
    @Autowired
    private JobRequirService jobRequirService;
    @Autowired
    private SqlService sqlService;

    @GetMapping("findJobByCode")
    @ApiImplicitParam("job编码")
    @ApiOperation(value = "通过工作名称查找工作", notes = "通过工作名称查找工作")
    public JsonResult findJob(Integer code) {
        List<JobRequirEntity> date = this.jobRequirService.getJobByAddress(code);
        return new JsonResult(SUCCESS, date);
    }


    @PostMapping("addJobRequir")
    @ApiImplicitParams({@ApiImplicitParam("用工需求实体对象"),
            @ApiImplicitParam("当前登录用户的openId")})
    @ApiOperation(value = "创建用工需求接口", notes = "创建用工需求接口")
    public JsonResult<Void> addJobRequir(JobRequirEntity jobRequirEntity, String openId) {
        this.jobRequirService.insertJobRequir(jobRequirEntity, openId);
        return new JsonResult(SUCCESS);
    }


    @GetMapping("findListByopenId")
    @ApiImplicitParam("当前登录用户的openId")
    @ApiOperation(value = "查看当前登录用户创建的所有用工需求接口", notes = "查看当前登录用户创建的所有用工需求接口")
    public JsonResult<Void> findListByOpenId(String openId) {
        List<JobRequirEntity> data = this.jobRequirService.getListByOpenId(openId);
        return new JsonResult(SUCCESS, data);
    }


    @PostMapping("changeInfo")
    @ApiImplicitParams({@ApiImplicitParam("用工需求实体对象"),
            @ApiImplicitParam("当前登录的用户id")})
    @ApiOperation(value = "修改用工需求接口", notes = "修改用工需求接口")
    public JsonResult<Void> findListByOpenId(JobRequirEntity jobRequirEntity, String openId) {
        jobRequirService.changeJobRequir(jobRequirEntity, openId);
        return new JsonResult(SUCCESS);
    }
}
