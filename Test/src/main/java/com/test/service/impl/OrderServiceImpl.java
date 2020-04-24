package  com.test.service.impl;

import com.test.entity.*;
import com.test.exception.ApplyException;
import com.test.mapper.OrderMapper;
import com.test.service.*;
import com.test.service.impl.OrderServiceImpl;

import java.util.Date;
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
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private FreemanService freemanService;
    public void insertOrder(OrderEntity orderEntity,String openId) {
        MainEntity mainEntity=mainService.findMainByOpenId(openId);
        String type=mainEntity.getUserType();
        Integer userIdA=mainEntity.getMainId();
        orderEntity.setUserIdA(userIdA);
        if("1".equals(type)){
            CompanyEntity companyEntity=companyService.selectById(userIdA);
            String userNameA=companyEntity.getTeamName();
            orderEntity.setaUsername(userNameA);
        }else if("2".equals(type)){
            TeamEntity teamEntity=teamService.selectById(userIdA);
            String userNameA=teamEntity.getTeamName();
            orderEntity.setaUsername(userNameA);
        }else if("3".equals(type)){
            FreemanEntity freemanEntity=freemanService.selectById(userIdA);
            String userNameA=freemanEntity.getName();
            orderEntity.setaUsername(userNameA);
        }
          orderEntity.setOrderStatus("0").setCreateBy(userIdA).setaCreateTime(new Date())
                  .setMarginStatus(0).setaEvaluate(0).setbEvaluate(0).setaEvaluateStar(0)
                  .setbEvaluateStar(0);



    }

    public List<OrderEntity> allOrder(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        return this.orderMapper.companyGetListByUserId(userId);
    }


    public List<OrderEntity> exCompanyOrder(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        return this.orderMapper.FOTGetListByUserId(userId);
    }


    public List<OrderEntity> ListByInvoiceTag(String openId, String invoiceTag) {
        Integer userId=mainService.findIdByOpenId(openId);
        return orderMapper.getListByInvoiceTag(userId,invoiceTag);
    }

    @Override
    public void changeTag(String openId, Integer orderId) {
        Integer userIdA=mainService.findIdByOpenId(openId);
       Integer row= orderMapper.updateTag(orderId,userIdA);
       if(row!=1){
           throw new ApplyException("申请开票失败");
       }
    }

    @Override
    public List<OrderEntity> unPayMargin(String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        return orderMapper.getByMarginStatus0(userId);
    }

    @Override
    public List<OrderEntity> PayMargin(String openId) {
        Integer userIdA=mainService.findIdByOpenId(openId);
        return orderMapper.getByMarginStatus1(userIdA);
    }

    @Override
    public List<OrderEntity> ListByStatusA(String openId, Integer orderStatus) {
       Integer userId=mainService.findIdByOpenId(openId);
       return orderMapper.getListByOrderStatusA(userId,orderStatus);
    }

    @Override
    public List<OrderEntity> ListByStatusB(String openId, Integer orderStatus) {
        Integer userId=mainService.findIdByOpenId(openId);
        return orderMapper.getListByOrderStatusB(userId,orderStatus);
    }

    @Override
    public List<OrderEntity> listByEvaluateA(String openId) {
      Integer userId=mainService.findIdByOpenId(openId);
      return orderMapper.ListByEvaluateA(userId);
    }

    @Override
    public List<OrderEntity> listByEvaluateB(String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        return orderMapper.ListByEvaluateB(userId);
    }

    @Override
    public void changeStatus5(Integer flexibleMoney, Integer orderId,String openId) {
        Integer userIdA=mainService.findIdByOpenId(openId);
        orderMapper.updateOrderStatus5(flexibleMoney,orderId,userIdA);
    }

    @Override
    public void changeStatus4(Integer orderId,String openId) {
        Integer userIdA=mainService.findIdByOpenId(openId);
        orderMapper.updateOrderStatus4(orderId,userIdA);
    }

    @Override
    public Integer changeStatus1(Integer orderId,String openId) {
        Integer userIdB=mainService.findIdByOpenId(openId);
        return orderMapper.updateOrderStatus1(orderId,userIdB);
    }

    @Override
    public Integer changeStatus2(Integer orderId,String openId) {
        Integer userIdB=mainService.findIdByOpenId(openId);
        return orderMapper.updateOrderStatus2(orderId,userIdB);
    }

    @Override
    public Integer changeStatus3(Integer orderId,String openId) {
        Integer userIdB=mainService.findIdByOpenId(openId);
        return orderMapper.updateOrderStatus3(orderId,userIdB);
    }

    @Override
    public Integer changeStatus7(Integer orderId,String openId) {
        Integer userIdB=mainService.findIdByOpenId(openId);
        return orderMapper.updateOrderStatus7(orderId,userIdB);
    }

    @Override
    public void changeAEvaluate(Integer star, Integer orderId) {
        orderMapper.changeAEvaluate(star,orderId);
    }

    @Override
    public void changeBEvaluate(Integer star, Integer orderId) {
        orderMapper.changeBEvaluate(star,orderId);
    }

    @Override
    public List<OrderEntity> PayToB(String openId) {
        Integer userIdA=mainService.findIdByOpenId(openId);
        return orderMapper.listByPayToB(userIdA);
    }

    /**
     * 查询已支付保证金总额
     * @param openId
     * @return
     */
    @Override
    public Integer getSumMargin(String openId) {
        Integer userIdA=mainService.findIdByOpenId(openId);
        return orderMapper.getSumMargin(userIdA);
    }
}
