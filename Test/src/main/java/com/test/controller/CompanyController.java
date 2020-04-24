package com.test.controller;

import com.test.controller.BaseController;
import com.test.controller.CompanyController;
import com.test.entity.CompanyEntity;
import com.test.service.CompanyService;
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
@RequestMapping({"rencai/company"})
@Api(value = "入驻公司接口", description = "入驻公司接口")
public class CompanyController
		extends BaseController
{
	@Autowired
	private CompanyService companyService;
	@Autowired
	private SqlService sqlService;

	@GetMapping({"/getCompany/{userId}"})
	@ApiImplicitParam("入驻公司id")
			@ApiOperation(value = "查看入驻公司详情接口", notes ="查看入驻公司详情接口")
			public JsonResult<CompanyEntity> findCompanyById(@PathVariable("userId") Integer userId) {
		CompanyEntity data = this.companyService.selectById(userId);
		return new JsonResult(SUCCESS, data);
	}



	@PostMapping("addCompany")
	@ApiImplicitParams({@ApiImplicitParam("公司实体对象"),
						@ApiImplicitParam("当前登录用户的openId")})
	@ApiOperation(value = "添加入驻公司接口", notes = "添加入驻公司接口")
	public JsonResult<Void> addCompany(CompanyEntity companyEntity, String openId) {
		this.companyService.insert(companyEntity, openId);
		return new JsonResult(SUCCESS);
	}




	@PostMapping("changeCompany")
	@ApiImplicitParams({@ApiImplicitParam("公司实体对象"),
						@ApiImplicitParam("当前登录用户的openId")})
	@ApiOperation(value ="修改入驻公司信息", notes ="修改入驻公司信息")
	public JsonResult<Void> updateCompany(CompanyEntity companyEntity, String openId) {
		companyService.update(companyEntity, openId);
		return new JsonResult(SUCCESS);
	}
}
