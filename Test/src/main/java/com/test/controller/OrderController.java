package com.test.controller;

import com.test.controller.BaseController;
import com.test.controller.OrderController;
import com.test.entity.OrderEntity;
import com.test.service.OrderService;
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
@RequestMapping("rencai/order")
@Api(value = "订单接口", description = "订单接口")
public class OrderController  extends BaseController {
    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "查看当前登录公司创建的所有订单", notes = "查看当前登录公司创建的所有订单")
    @GetMapping("companyDetail")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<Void> getCompanyList(String openId) {
        List<OrderEntity> date = this.orderService.companyOrder(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "查看非公司的所有订单", notes ="查看非公司的所有订单")
    @GetMapping("exCompanyDetail")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<Void> getExCompanyList(String openId) {
        List<OrderEntity> date = this.orderService.exCompanyOrder(openId);
        return new JsonResult(SUCCESS, date);
    }
}
