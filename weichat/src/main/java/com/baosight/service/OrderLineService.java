package com.baosight.service;

import com.baosight.VO.OrderFormVO;
import com.baosight.VO.OrderTzVO;
import com.baosight.pojo.OrderLine;

import java.util.List;

public interface OrderLineService {
    //保存订单
    public OrderLine save(OrderLine orderLine);
    //删除订单
    public void delete(String orderId);
    //修改订单
    OrderLine update(OrderLine orderLine);
    //查找用户所用订单
    List<OrderLine> listAllOrder();
    //根据订单查看商品
    OrderLine OneOrder(String orderId);
    //检查订单
    int CheckOrderline(String orderId);

    OrderFormVO OneOrder1(String orderId);

    List<OrderFormVO> AllOrder();

    List<OrderTzVO> OrderTongZhi();

    int OrderTZDelete(String foodName);

    OrderLine insertOrderTotal(OrderLine orderLine);
}
