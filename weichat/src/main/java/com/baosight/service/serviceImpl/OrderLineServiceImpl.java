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
package com.baosight.service.serviceImpl;

import com.baosight.VO.OrderFormVO;
import com.baosight.VO.OrderTzVO;
import com.baosight.common.Conts;
import com.baosight.dao.OrderFormMapper;
import com.baosight.dao.OrderLineMapper;
import com.baosight.dao.OrderTzVOMapper;
import com.baosight.pojo.OrderLine;
import com.baosight.service.OrderLineService;
import com.baoxin.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public OrderLine insertOrderTotal(OrderLine orderLine) {
        orderLineMapper.insertOrderTotal(orderLine);
        return orderLine;
    }
}

