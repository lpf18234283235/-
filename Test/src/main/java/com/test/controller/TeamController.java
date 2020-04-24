package com.test.controller;

import com.test.controller.BaseController;
import com.test.controller.TeamController;
import com.test.entity.TeamEntity;
import com.test.service.SqlService;
import com.test.service.TeamService;
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
@RequestMapping({"rencai/team"})
@Api(value = "入驻团队的接口", description = "入驻团队的接口")
public class TeamController extends BaseController {
    @Autowired
    private TeamService teamService;
    @Autowired
    private SqlService sqlService;

    @GetMapping("/getTeam/{userId}")
    @ApiImplicitParam("团队的userId")
    @ApiOperation(value = "查看入驻团队详情接口", notes = "查看入驻团队详情接口")
    public JsonResult<TeamEntity> findTeamById(@PathVariable("userId") Integer userId) {
        TeamEntity data = this.teamService.selectById(userId);
        return new JsonResult(SUCCESS, data);
    }


    @PostMapping("addTeam")
    @ApiImplicitParams({@ApiImplicitParam("入驻团队实体对象"),
                        @ApiImplicitParam("当前登录用户的openId")})
    @ApiOperation(value = "添加入驻团队的接口", notes = "添加入驻团队的接口")
    public JsonResult<Void> addTeam(TeamEntity teamEntity, String openId) {
        System.err.println("teamEntity" + teamEntity);
        this.teamService.insertTeam(teamEntity, openId);
        return new JsonResult(SUCCESS);
    }


    @PostMapping("changeTeam")
    @ApiImplicitParams({@ApiImplicitParam("入驻团队的实体对象"),
                        @ApiImplicitParam("当前登录用户的openId")})
    @ApiOperation(value = "修改入驻团队信息的接口", notes = "修改入驻团队信息的接口")
    public JsonResult<Void> updateTeam(TeamEntity teamEntity, String openId) {
        teamService.updateTeam(teamEntity, openId);
        return new JsonResult(SUCCESS);
    }
}
