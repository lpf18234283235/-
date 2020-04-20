package com.test.controller;

import com.test.controller.BaseController;
import com.test.controller.FreemanController;
import com.test.entity.FreemanEntity;
import com.test.service.FreemanService;
import com.test.service.SqlService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"rencai/freeman"})
@Api(value = "入驻自由人接口", description = "入驻自由人接口")
public class FreemanController
        extends BaseController {
    @Autowired
    private FreemanService freemanService;
    @Autowired
    private SqlService sqlService;

    @PostMapping("addFreeman")
    @ApiImplicitParams({@ApiImplicitParam("自由人实体对象"), @ApiImplicitParam("当前登录用户的openId")})
    @ApiOperation(value = "添加入驻自由人接口", notes = "添加入驻自由人接口")
    public JsonResult<Void> addFreeman(FreemanEntity freemanEntity, String openId) {
        this.freemanService.insert(freemanEntity, openId);
        return new JsonResult(SUCCESS);
    }


    @GetMapping("/getFreeman/{userId}")
    @ApiImplicitParam("入驻自由人的userId")
    @ApiOperation(value = "根据id查看入驻自由人详情", notes = "根据id查看入驻自由人详情")
    public JsonResult<Void> findFreemanById(@PathVariable("userId") Integer userId) {
        FreemanEntity data = this.freemanService.selectById(userId);
        return new JsonResult(SUCCESS, data);
    }


    @PostMapping("/changeFreeman")
    @ApiImplicitParam("自由人实体对象")
    @ApiOperation(value = "修改自由人的个人信息", notes = "修改自由人的个人信息")
    public JsonResult<Void> updateFreemanById(FreemanEntity freemanEntity,String openId) {
        freemanService.update(freemanEntity,openId);
        return new JsonResult(SUCCESS);
    }
}
