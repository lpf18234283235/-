package com.test.mapper;

import com.test.entity.OrderEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    Integer addOrder(OrderEntity orderEntity);

    List<OrderEntity> companyGetListByUserId(Integer userId);

    List<OrderEntity> FOTGetListByUserId(Integer userId);

    /**
     * 根据发票状态查找订单
     * @param invoiceTag 发票状态
     * @return
     */
    List<OrderEntity> getListByInvoiceTag(Integer userId,String invoiceTag);


    /**
     * 修改发票状态
     * @param orderId 订单id
     * @return 是否成功
     */
    Integer updateTag(Integer orderId,Integer userIdA);


    /**
     * 查看创建订单后未支付保证金的订单
     * @param userIdA 用户id
     * @return
     */
    List<OrderEntity> getByMarginStatus0(Integer userIdA);
    /**
     * 查看创建订单后已支付保证金的订单
     * @param userIdB 用户id
     * @return
     */
    List<OrderEntity> getByMarginStatus1(Integer userIdB);

    /**
     * 查看不同订单状态的订单
     * @param userIdA 甲方id
     * @param orderStatus 订单状态
     * @return
     */
    List<OrderEntity> getListByOrderStatusA(Integer userIdA,Integer orderStatus);

    /**
     * 甲方根据评价状态查看订单
     * @return
     */
    List<OrderEntity> ListByEvaluateA(Integer userIdA);

    /**
     * 乙方根据评论状态查看订单
     * @param userIdB 乙方id
     * @return
     */
    List<OrderEntity> ListByEvaluateB(Integer userIdB);
    /**
     *修改订单状态和灵活支付金额
     *
     * @param money
     * @param orderId  订单id
     * @return
     */
    Integer updateOrderStatus5( Integer flexibleMoney, Integer orderId,Integer userIdA);

    /**
     * 甲方修改订单状态为已完工
     *
     * @param id
     * @param orderId 订单id
     * @return
     */
    Integer updateOrderStatus4( Integer orderId,Integer userIdA);
    /**
     * 乙方修改订单状态为已接单
     *
     * @param id
     * @param orderId 订单id
     * @return
     */
    Integer updateOrderStatus1( Integer orderId,Integer userIdB);
    /**
     * 乙方修改订单状态为拒绝接单
     *
     * @param id
     * @param orderId 订单id
     * @return
     */
    Integer updateOrderStatus2( Integer orderId,Integer userIdB);
    /**
     * 乙方修改订单状态为接单完工状态
     *
     * @param id
     * @param orderId 订单id
     * @return
     */
    Integer updateOrderStatus3( Integer orderId,Integer userIdB);
    /**
     * 乙方确认甲方发起的灵活支付状态
     *
     * @param id
     * @param orderId 订单id
     * @return
     */
    Integer updateOrderStatus7(Integer orderId,Integer userIdB);

    /**
     * 查看不同订单状态的订单
     * @param userIdB 乙方id
     * @param orderStatus 订单状态
     * @return
     */
    List<OrderEntity> getListByOrderStatusB(Integer userIdB,Integer orderStatus);

    /**
     * 甲方评论乙方
     * @param star
     * @param orderId
     */
    void changeAEvaluate(Integer star, Integer orderId);

    /**
     * 乙方评论甲方
     * @param star
     * @param orderId
     */
    void changeBEvaluate(Integer star, Integer orderId);

    /**
     * 查看已完成且已支付给乙方的订单
     * @param userIdA
     * @return
     */
    List<OrderEntity> listByPayToB(Integer userIdA);

    /**
     * 查询已支付保证金的总额
     * @param userIdA
     * @return
     */
    Integer getSumMargin(Integer userIdA);
}
