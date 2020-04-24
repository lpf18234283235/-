package com.test.controller;

import com.test.entity.DistrictEntity;
import com.test.entity.InterviewNoticeEntity;
import com.test.entity.PostEntity;
import com.test.service.InterviewNoticeService;
import com.test.service.PostService;
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
@RequestMapping("rencai/interview")
@Api(value = "面试相关接口", description = "面试相关接口")
public class InterviewNoticeController extends BaseController {
    @Autowired
    private InterviewNoticeService interviewNoticeService;

    @ApiOperation(value = "查看甲方创建的所有面试", notes = "查看甲方创建的所有面试")
    @GetMapping("listByUserIdA")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<InterviewNoticeEntity>> getListByUserIdA(String openId) {
        List<InterviewNoticeEntity> data = interviewNoticeService.listByIdA(openId);
        return new JsonResult(SUCCESS, data);
    }

    @ApiOperation(value = "查看发送给乙方的所有面试", notes = "查看发送给乙方的所有面试")
    @GetMapping("listByUserIdB")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<InterviewNoticeEntity>> getListByUserIdB(String openId) {
        List<InterviewNoticeEntity> data = interviewNoticeService.listByIdB(openId);
        return new JsonResult(SUCCESS, data);
    }

    @ApiOperation(value = "作为甲方根据面试状态查看不同面试", notes = "作为甲方根据面试状态查看不同面试")
    @GetMapping("listAByStatus")
    @ApiImplicitParams({@ApiImplicitParam("当前登录用户的openId"), @ApiImplicitParam("面试通知的不同状态，0：已发出的，1：乙方已接受的，2：乙方拒绝的，3：面试完成的，4，乙方接受未面试的")})

    public JsonResult<List<InterviewNoticeEntity>> listByStatusUserIdA(String openId, Integer interviewStatus) {
        List<InterviewNoticeEntity> data = interviewNoticeService.listByStatusUserIdA(openId, interviewStatus);
        return new JsonResult(SUCCESS, data);
    }

    @ApiOperation(value = "作为乙方根据面试状态查看不同面试", notes = "作为乙方根据面试状态查看不同面试")
    @GetMapping("listBByStatus")
    @ApiImplicitParams({@ApiImplicitParam("当前登录用户的openId"), @ApiImplicitParam("面试通知的不同状态，0：未处理的，1：已接受的，3：已完成的")})
    public JsonResult<List<InterviewNoticeEntity>> listByStatusUserIdB(String openId, Integer interviewStatus) {
        List<InterviewNoticeEntity> data = interviewNoticeService.listByStatusUserIdB(openId, interviewStatus);
        return new JsonResult(SUCCESS, data);
    }

    @ApiOperation(value = "甲方点击乙方创建面试邀请", notes = "甲方点击乙方创建面试邀请")
    @PostMapping("createInterview")
    @ApiImplicitParams({@ApiImplicitParam("通知实体对象"),@ApiImplicitParam("当前登录用户的openId")})
    public JsonResult<Void> createInterview(InterviewNoticeEntity interviewNoticeEntity, String openId) {
        interviewNoticeService.createInterview(interviewNoticeEntity, openId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "甲乙方修改面试邀请状态", notes = "甲乙方修改面试邀请状态，1：接受，2：拒绝，3：面试完成，4：乙方接受未面试")
    @PostMapping("changeStatus")
    @ApiImplicitParams({@ApiImplicitParam("通知的id"),@ApiImplicitParam("状态1：接受 2：拒绝")})
    public JsonResult<Void> createInterview(Integer id,Integer interviewStatus) {
        interviewNoticeService.changeStatus(id,interviewStatus);
        return new JsonResult(SUCCESS);
    }


}
