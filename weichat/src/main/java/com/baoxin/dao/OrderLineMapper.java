package com.baoxin.dao;

import com.baoxin.pojo.OrderLine;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderLine record);

    int insertSelective(OrderLine record);

    OrderLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderLine orderLine);

    int updateByPrimaryKey(OrderLine orderLine);

    List<OrderLine> listAllOrder();

    int checkOrderLine(@Param("orderId") String orderId);

    OrderLine OneOrder(@Param("orderId")String orderId);

    int insertOrderTotal(OrderLine record);

}