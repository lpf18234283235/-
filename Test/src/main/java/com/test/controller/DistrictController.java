package com.test.controller;

import com.test.controller.BaseController;
import com.test.controller.DistrictController;
import com.test.entity.DistrictEntity;
import com.test.service.DistrictService;
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
@RequestMapping("rencai/districts")
@Api(value = "地址接口", description = "地址接口")
public class DistrictController extends BaseController {
    @Autowired
    private DistrictService districtService;

    @ApiOperation(value = "根据上级编码查看下级内容", notes = "根据上级编码查看下级内容")
    @GetMapping({"/"})
    @ApiImplicitParam("上级的编码")
    public JsonResult<List<DistrictEntity>> getByParent(String parent) {
        List<DistrictEntity> data = this.districtService.getByParent(parent);
        return new JsonResult(SUCCESS, data);
    }
}
