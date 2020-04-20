package  com.test.service.impl;

import com.test.entity.OrderEntity;
import com.test.mapper.OrderMapper;
import com.test.service.MainService;
import com.test.service.OrderService;
import com.test.service.impl.OrderServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderServiceImpl
        implements OrderService
{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private MainService mainService;

    public void insertOrder(OrderEntity orderEntity) {}

    public List<OrderEntity> companyOrder(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        return this.orderMapper.companyGetListByUserId(userId);
    }


    public List<OrderEntity> exCompanyOrder(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        return this.orderMapper.FOTGetListByUserId(userId);
    }
}
