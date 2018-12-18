/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OrderLineServiceImpl
 * Author:   hasee
 * Date:     2018/11/22 8:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.service.serviceImpl;

import com.baoxin.VO.OrderFormVO;
import com.baoxin.VO.OrderTzVO;
import com.baoxin.common.Conts;
import com.baoxin.dao.FoodMapper;
import com.baoxin.dao.OrderFormMapper;
import com.baoxin.dao.OrderLineMapper;
import com.baoxin.dao.OrderTzVOMapper;
import com.baoxin.pojo.Food;
import com.baoxin.pojo.OrderLine;
import com.baoxin.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/22
 * @since 1.0.0
 */
@Service
public class OrderLineServiceImpl implements OrderLineService {

    @Autowired
    OrderLineMapper orderLineMapper;

    @Autowired
    OrderFormMapper orderFormMapper;

    @Autowired
    OrderTzVOMapper orderTzVOMapper;
    @Autowired
    FoodMapper foodMapper;

    @Override
    public OrderLine save(OrderLine orderLine) {
        int i = orderLineMapper.checkOrderLine(orderLine.getOrderId());
        if(i !=0){
            return null;
        }
        String uuid = String.valueOf(UUID.randomUUID());
        orderLine.setOrderid(uuid);
        orderLine.setStatus(Conts.ORDERLINE_PULL);
        orderLineMapper.insert(orderLine);
        return orderLine;
    }

    @Override
    public void delete(String orderId) {
        int i = orderLineMapper.checkOrderLine(orderId);
        if(i != 0) {
            orderLineMapper.deleteByPrimaryKey(Integer.parseInt(orderId));
        }
    }

    @Override
    public List<OrderLine> listAllOrder() {
        return orderLineMapper.listAllOrder();
    }

    @Override
    public OrderLine OneOrder(String orderId) {
        int i = orderLineMapper.checkOrderLine(orderId);
        if(i ==0){
            return null;
        }
        return orderLineMapper.OneOrder(orderId);
    }

    @Override
    public OrderFormVO OneOrder1(String orderId) {
        int i = orderLineMapper.checkOrderLine(orderId);
        if(i ==0){
            return null;
        }
        return orderFormMapper.OneOrder(orderId);
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        int i = orderLineMapper.checkOrderLine(orderLine.getOrderId());
        if(i ==0){
            return null;
        }
        orderLine.setStatus(Conts.ORDERLINE_PUSH);
        orderLineMapper.updateByPrimaryKeySelective(orderLine);
        return orderLine;
    }

    @Override
    public int CheckOrderline(String orderId) {
        return orderLineMapper.checkOrderLine(orderId);
    }

    @Override
    public List<OrderFormVO> AllOrder() {
        return orderFormMapper.AllOrder();
    }

    @Override
    public List<OrderTzVO> OrderTongZhi() {
        return orderTzVOMapper.OrderTongZhi();
    }

    @Override
    public int OrderTZDelete(String foodName) {
        return orderTzVOMapper.OrderTZDelete(foodName);
    }

//    @Override
//    public OrderTzVO insertOrderTotal(OrderTzVO orderTzVO) {
//        orderTzVOMapper.insertOrderTotal(orderTzVO);
//        return  orderTzVO;
//    }

    @Override
    public int insertOrderTotal(int orderTotal,int foodId,int status) {
      /*  int i = foodMapper.checkFoodStatus(orderTzVO.getFoodId());

        for(int a;a<)*/
        int i = orderTzVOMapper.insertOrderTotal(orderTotal, foodId,status);
        return i;
    }
}

