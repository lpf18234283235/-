package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.test.service.SqlService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("rencai")
@Api(value="测试用",description = "测试模块")
public class TestController extends BaseController{
	/**
	 *通用执行SQL接口
	 * @param sqlname sqlname 为调用的SQL脚本的名称
	 * @return
	 */
	@Autowired
	private SqlService sqlService;

	@GetMapping("SqlExec")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "sql名称"),
		@ApiImplicitParam(value = "参数")
	})
	@ApiOperation(value = "执行删除修改操作",notes = "执行删除修改操作")
	public JSONObject sqlExec(String sqlname, String parameter) {
		String[] para;
		if(parameter==null) {
			para=null;
		}else {
			para =parameter.split(",");
		}
		JSONObject data = this.sqlService.sqlExec(sqlname, para);
		return data;
	}



	@ApiOperation(value="获取用户列表",notes = "获取所有数据")
	@GetMapping("/SqlSelect")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "sql名称"),
		@ApiImplicitParam(value="参数"),
		@ApiImplicitParam(value="分页数,可不传"),
	})
	public JSONObject sqlSelect(String sqlname,String parameter,String limit) {
		String[] para_str;
		String[] para_int;
		int size_str=0;
		int size_int=0;
		if(parameter==null) {
			para_str=null;
		}else {
			if(parameter.equals("")) {
				para_str =null;
			}else {
				para_str =parameter.split(",");
				size_str=para_str.length;
			}
		}
		if(limit==null) {
			para_int=null;
		}else {
			if(limit.equals("")) {
				para_int =null;
			}else {
				para_int =limit.split(",");
				size_int=para_int.length;
			}
		}
		Object[] para=null;
		if(size_str+size_int>0) {
			para = new Object[size_str+size_int];
		}
		int i=0;
		if(para_str!=null) {
			for(int j=0;j<para_str.length;j++,i++) {
				para[i]=para_str[j];
			}
		}
		if(para_int!=null) {
			for(int j=0;j<para_int.length;j++,i++) {
				para[i]=Integer.valueOf(para_int[j]);
			}
		}
		JSONObject data = this.sqlService.sqlSelect(sqlname, para);

		return data;
	}
}
