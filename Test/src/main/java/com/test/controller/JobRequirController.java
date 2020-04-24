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
    @ApiImplicitParam("地址编码")
    @ApiOperation(value = "通过地址编码查找工作", notes = "通过地址编码查找工作")
    public JsonResult<List<JobRequirEntity>> findJob(Integer code) {
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
    public JsonResult<List<JobRequirEntity>> findListByOpenId(String openId) {
        List<JobRequirEntity> data = this.jobRequirService.getListByOpenId(openId);
        return new JsonResult(SUCCESS, data);
    }


    @PostMapping("changeInfo")
    @ApiImplicitParams({@ApiImplicitParam("用工需求实体对象"),
            @ApiImplicitParam("当前登录的用户id")})
    @ApiOperation(value = "修改用工需求接口", notes = "修改用工需求接口")
    public JsonResult<Void> updateJobRequir(JobRequirEntity jobRequirEntity, String openId) {
        jobRequirService.changeJobRequir(jobRequirEntity, openId);
        return new JsonResult(SUCCESS);
    }

    @GetMapping("getDetail")
    @ApiImplicitParam("用工需求id")
    @ApiOperation(value = "查看用工需求详情", notes = "查看用工需求详情")
    public JsonResult<JobRequirEntity> findByRequirId(Integer requirId) {
       JobRequirEntity data = jobRequirService.getByRequirId(requirId);
        return new JsonResult(SUCCESS, data);
    }

    @GetMapping("byStatus")
    @ApiImplicitParams({
            @ApiImplicitParam("当前登录用户的openId"),
            @ApiImplicitParam("用工需求的状态")
    })
    @ApiOperation(value = "查看不同状态的用工需求", notes = "查看不同状态的用工需求")
    public JsonResult<List<JobRequirEntity>> findByStatus(String openId,Integer taskStatus) {
       List<JobRequirEntity> data=jobRequirService.getListByStatus(openId,taskStatus);
        return new JsonResult(SUCCESS, data);
    }

    @PostMapping("changeStatus")
    @ApiImplicitParams({@ApiImplicitParam("需求id"),
            @ApiImplicitParam("状态，0：保存未发布，1：发布请求审核，2：审核通过，3：审核不通过"),@ApiImplicitParam("当前登录的用户openid")})
    @ApiOperation(value = "修改用工需求状态接口", notes = "修改用工需求状态接口")
    public JsonResult<Void> updateStatus(Integer requirId,String taskStatus, String openId) {
        jobRequirService.changeStatus(requirId,taskStatus,openId);
        return new JsonResult(SUCCESS);
    }
}
