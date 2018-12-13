package com.baoxin.dao;

import com.baoxin.VO.OrderTzVO;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderTzVOMapper {

    List<OrderTzVO> OrderTongZhi();

    int OrderTZDelete(String foodName);

    int insertFoodName(OrderTzVO orderTzVO);

    int insertShoppCarNum(int shoppCartNum);

    int insertOrderTotal(int orderTotal);
}
