package com.test.service;

import com.test.entity.OrderEntity;
import java.util.List;

public interface OrderService {
    void insertOrder(OrderEntity orderEntity);

    List<OrderEntity> companyOrder(String openId);

    List<OrderEntity> exCompanyOrder(String openId);
}
