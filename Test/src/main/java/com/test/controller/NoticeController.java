package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.test.entity.NoticeEntity;
import com.test.service.NoticeService;
import com.test.service.SqlService;
import com.test.util.JsonResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("rencai/Notice")
@Api(value = "", description = "获取用户通知")
public class NoticeController extends BaseController {
    @Autowired
    private NoticeService noticeService;


    @ApiOperation(value = "获取用户通知", notes = "获取所有通知")
    @PostMapping("/byUserId/{userId}")
    @ApiImplicitParam(value = "用户openid")
    public JsonResult<Void> getList(@PathVariable("userId") String openId) {
        List<NoticeEntity> data = noticeService.getById(openId);
        return new JsonResult(SUCCESS, data);
    }

    @ApiOperation(value = "修改通知状态与阅读时间", notes = "修改通知状态与阅读时间")
    @PostMapping("/byNoticeId/{noticeId}")
    @ApiImplicitParam(value = "通知编码")
    public JsonResult<Void> changeStatusById(@PathVariable("noticeId") Integer noticeId) {
        noticeService.updataById(noticeId);
        return new JsonResult<>(SUCCESS);
    }

    @ApiOperation(value = ", notes = ")
    @PostMapping("add")
    @ApiImplicitParams({@ApiImplicitParam("), @ApiImplicitParam(")})
    public JsonResult<Void> addNotice(NoticeEntity noticeEntity, String openId) {
        this.noticeService.insert(noticeEntity, openId);
        return new JsonResult(Integer.valueOf(0));
    }
}
