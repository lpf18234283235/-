package com.test.controller;

import com.test.controller.BaseController;
import com.test.controller.OrderController;
import com.test.entity.OrderEntity;
import com.test.service.OrderService;
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
@RequestMapping("rencai/order")
@Api(value = "订单相关接口", description = "订单相关接口")
public class OrderController  extends BaseController {
    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "查看当前登录用户创建的所有订单", notes = "查看当前登录用户创建的所有订单")
    @GetMapping("jiaList")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<OrderEntity>> getOrderList(String openId) {
        List<OrderEntity> date = this.orderService.allOrder(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "查看当前用户接的所有订单", notes ="查看当前用户接的所有订单")
    @GetMapping("yiList")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<OrderEntity>> getList(String openId) {
        List<OrderEntity> date = this.orderService.exCompanyOrder(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "根据开票状态查看订单", notes ="根据开票状态查看订单")
    @GetMapping("ListByInvoiceTag")
    @ApiImplicitParams({
            @ApiImplicitParam("当前登录用户的openId"),
            @ApiImplicitParam("开票状态,0:未开，1：已开")
    })
    public JsonResult<List<OrderEntity>> getListByInvoiceTag(String openId,String invoiceTag) {
        List<OrderEntity> date =orderService.ListByInvoiceTag(openId,invoiceTag);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "创建订单接口", notes ="创建订单接口")
    @GetMapping("createOrder")
    @ApiImplicitParams({
            @ApiImplicitParam("订单实体对象"),
            @ApiImplicitParam("当前登录用户的openId")
    })
    public JsonResult<Void> createOrder(OrderEntity orderEntity,String openId) {
      orderService.insertOrder(orderEntity,openId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "修改订单为发票申请状态", notes ="修改订单为发票申请状态")
    @PostMapping("changeTag")
    @ApiImplicitParams({
            @ApiImplicitParam("当前登录用户的openId"),
            @ApiImplicitParam("订单id")
    })
    public JsonResult<Void> changeTag(String openId,Integer orderId) {
         orderService.changeTag(openId,orderId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "查看未支付保证金的订单", notes ="查看未支付保证金的订单")
    @GetMapping("ListByMarginStatus0")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<OrderEntity>> getListByMarginStatus0(String openId) {
        List<OrderEntity> date =orderService.unPayMargin(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "查看已支付保证金的订单", notes ="查看已支付保证金的订单")
    @GetMapping("ListByMarginStatus1")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<OrderEntity>> getListByMarginStatus1(String openId) {
        List<OrderEntity> date =orderService.PayMargin(openId);
        return new JsonResult(SUCCESS, date);
    }
    @ApiOperation(value = "查看已支付保证金的订单且已完工已支付给乙方的订单", notes ="查看已支付保证金的订单且已完工已支付给乙方的订单")
    @GetMapping("ListPayStatus1")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<OrderEntity>> getListByPayStatus(String openId) {
        List<OrderEntity> date =orderService.PayToB(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "甲方查看不同订单状态的订单", notes ="甲方查看不同订单状态的订单")
    @GetMapping("ListAByOrderStatus")
    @ApiImplicitParams({
            @ApiImplicitParam("当前登录用户的openId"),
            @ApiImplicitParam("不同的订单状态，0：甲方派单（待确认），1：乙方接单（工作中），3：乙方提交订单（已提交），" +
                    "4：甲乙双方确认完成（已完成）")
    })
    public JsonResult<List<OrderEntity>> getListByOrderStatusA(String openId,Integer orderStatus) {
        List<OrderEntity> date =orderService.ListByStatusA(openId,orderStatus);
        return new JsonResult(SUCCESS, date);
    }
    @ApiOperation(value = "乙方查看不同订单状态的订单", notes ="乙方查看不同订单状态的订单")
    @GetMapping("ListBByOrderStatus")
    @ApiImplicitParams({
            @ApiImplicitParam("当前登录用户的openId"),
            @ApiImplicitParam("不同的订单状态，0：甲方派单（待确认），1：乙方接单（工作中），5：双方协商状态（协商中），" +
                    "4：甲乙双方确认完成（已完成）")
    })
    public JsonResult<List<OrderEntity>> getListByOrderStatusB(String openId,Integer orderStatus) {
        List<OrderEntity> date =orderService.ListByStatusB(openId,orderStatus);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "甲方查看已评价订单", notes ="甲方查看已评价订单")
    @GetMapping("ListByEvaluateA")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<OrderEntity>> getListByA(String openId) {
        List<OrderEntity> date =orderService.listByEvaluateA(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "乙方查看已评价订单", notes ="乙方查看已评价订单")
    @GetMapping("ListByEvaluateB")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<List<OrderEntity>> getListByB(String openId) {
        List<OrderEntity> date =orderService.listByEvaluateB(openId);
        return new JsonResult(SUCCESS, date);
    }

    @ApiOperation(value = "甲方修改订单状态为协商", notes ="甲方修改订单状态为协商，修改灵活金额")
    @PostMapping("changeStatus5")
    @ApiImplicitParams({
            @ApiImplicitParam("灵活金额"),
            @ApiImplicitParam("订单id")
    })
    public JsonResult<Void> changeStatus5(Integer flexibleMoney,Integer orderId,String openId) {
       orderService.changeStatus5(flexibleMoney,orderId,openId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "甲方确认修改订单状态为完工", notes ="甲方确认修改订单状态为完工")
    @PostMapping("changeStatus4")
    @ApiImplicitParam("订单id")
    public JsonResult<Void> changeStatus4(Integer orderId,String openId) {
        orderService.changeStatus4(orderId,openId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "乙方施工完成后修改订单状态为乙方完工", notes ="乙方施工完成后修改订单状态为乙方完工")
    @PostMapping("changeStatus3")
    @ApiImplicitParam("订单id")
    public JsonResult<Void> changeStatus3(Integer orderId,String openId) {
        orderService.changeStatus3(orderId,openId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "乙方在待确认栏中拒绝接单", notes ="乙方在待确认栏中拒绝接单")
    @PostMapping("changeStatus2")
    @ApiImplicitParam("订单id")
    public JsonResult<Void> changeStatus2(Integer orderId,String openId) {
        orderService.changeStatus2(orderId,openId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "乙方在待确认栏中接单", notes ="乙方在待确认栏中接单")
    @PostMapping("changeStatus1")
    @ApiImplicitParam("订单id")
    public JsonResult<Void> changeStatus1(Integer orderId,String openId) {
        orderService.changeStatus1(orderId,openId);
        return new JsonResult(SUCCESS);
    }
    @ApiOperation(value = "乙方在协商栏中确认部分付款状态", notes ="乙方在协商栏中确认部分付款状态")
    @PostMapping("changeStatus7")
    @ApiImplicitParam("订单id")
    public JsonResult<Void> changeStatus7(Integer orderId,String openId) {
        orderService.changeStatus7(orderId,openId);
        return new JsonResult(SUCCESS);
    }
    @ApiOperation(value = "甲方评价乙方", notes ="甲方评价乙方")
    @PostMapping("evaluateA")
    @ApiImplicitParams({
            @ApiImplicitParam("星级"),
            @ApiImplicitParam("订单id")
    })
    public JsonResult<Void> aEvaluate(Integer star,Integer orderId) {
        orderService.changeAEvaluate(star,orderId);
        return new JsonResult(SUCCESS);
    }

    @ApiOperation(value = "乙方评论甲方", notes ="乙方评论甲方")
    @PostMapping("evaluateB")
    @ApiImplicitParams({
            @ApiImplicitParam("星级"),
            @ApiImplicitParam("订单id")
    })
    public JsonResult<Void> bEvaluate(Integer star,Integer orderId) {
        orderService.changeBEvaluate(star,orderId);
        return new JsonResult(SUCCESS);
    }


    @ApiOperation(value = "甲方查看已支付劳动保证金的总额", notes ="甲方查看已支付劳动保证金的总额")
    @GetMapping("sumMargin")
    @ApiImplicitParam("当前登录用户的openId")
    public JsonResult<Integer> getSumMargin(String openId) {
        Integer date =orderService.getSumMargin(openId);
        return new JsonResult(SUCCESS, date);
    }
}
