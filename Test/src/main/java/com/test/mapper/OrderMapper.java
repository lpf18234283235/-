package com.test.mapper;

import com.test.entity.OrderEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    Integer addOrder(OrderEntity orderEntity);

    List<OrderEntity> companyGetListByUserId(Integer userId);

    List<OrderEntity> FOTGetListByUserId(Integer userId);
}
