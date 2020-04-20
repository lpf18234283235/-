package com.test.controller;

import com.test.entity.DistrictEntity;
import com.test.entity.PostEntity;
import com.test.service.DistrictService;
import com.test.service.PostService;
import com.test.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rencai/post")
@Api(value = "岗位职位接口", description = "岗位职位接口")
public class PostController extends BaseController {
    @Autowired
    private PostService postService;

    @ApiOperation(value = "查看所有岗位", notes = "查看所有岗位")
    @GetMapping({"/list"})
    public JsonResult<List<DistrictEntity>> getByParent() {
        List<PostEntity> data=postService.getList();
        return new JsonResult(SUCCESS, data);
    }
}
