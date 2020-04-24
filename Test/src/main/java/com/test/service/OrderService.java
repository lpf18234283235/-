package com.test.service;

import com.test.entity.OrderEntity;
import java.util.List;

public interface OrderService {
    void insertOrder(OrderEntity orderEntity,String openId);

    List<OrderEntity> allOrder(String openId);

    List<OrderEntity> exCompanyOrder(String openId);

    List<OrderEntity> ListByInvoiceTag(String openId,String invoiceTag);

    /**
     * 修改发票状态
     * @param openId 当前登录用户id
     * @param orderId 订单id
     * @return
     */
    void changeTag(String openId,Integer orderId);

    /**
     * 未支付保证金的订单
     * @param openId 当前登录用户的openId
     * @return
     */
    List<OrderEntity> unPayMargin(String openId);

    /**
     * 已支付保证金的订单
     * @param openId 当前登录用户的openId
     * @return
     */
    List<OrderEntity> PayMargin(String openId);


    /**
     * 不同状态的不同订单
     * @param openId 登录的用户
     * @param orderStatus 状态
     * @return
     */
    List<OrderEntity> ListByStatusA(String openId,Integer orderStatus);

    /**
     * 不同状态的不同订单
     * @param openId 登录的用户
     * @param orderStatus 状态
     * @return
     */
    List<OrderEntity> ListByStatusB(String openId,Integer orderStatus);

    /**
     * 甲方查看评价与否的订单
     * @param openId 登录用户
     * @return
     */
    List<OrderEntity> listByEvaluateA(String openId);
    /**
     * 乙方查看评价与否的订单
     * @param openId 登录用户
     * @return
     */
    List<OrderEntity> listByEvaluateB(String openId);

    /**
     * 修改状态为协商状态
     * @param flexibleMoney 灵活金额
     * @param orderId 订单id
     */
    void changeStatus5(Integer flexibleMoney,Integer orderId,String openId);

    /**
     * 修改状态为完工状态
     * @param orderId 订单id
     */
    void changeStatus4(Integer orderId,String openId);

    /**
     * 乙方修改订单状态为已接单
     * @param orderId 订单id
     * @return
     */
    Integer changeStatus1(Integer orderId,String openId);
    /**
     * 乙方修改订单状态为拒绝接单
     * @param orderId 订单id
     * @return
     */
    Integer changeStatus2(Integer orderId,String openId);
    /**
     * 乙方修改订单状态为接单完工状态
     * @param orderId 订单id
     * @return
     */
    Integer changeStatus3(Integer orderId,String openId);
    /**
     * 乙方确认甲方发起的灵活支付状态
     * @param orderId 订单id
     * @return
     */
    Integer changeStatus7(Integer orderId,String openId);


    void changeAEvaluate(Integer star, Integer orderId);

    void changeBEvaluate(Integer star, Integer orderId);

    /**
     * 查看已支付给乙方薪酬且已完工的订单
     * @param openId
     * @return
     */
    List<OrderEntity> PayToB(String openId);

    /**
     * 查看已支付保证金的总额
     * @param openId
     * @return
     */
    Integer getSumMargin(String openId);
}
