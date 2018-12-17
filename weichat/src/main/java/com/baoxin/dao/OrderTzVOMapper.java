package com.baoxin.dao;

import com.baoxin.VO.OrderTzVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderTzVOMapper {

    List<OrderTzVO> OrderTongZhi();

    int OrderTZDelete(String foodName);

    int insertFoodName(OrderTzVO orderTzVO);

    int insertShoppCarNum(@Param("shoppCartNum") int shoppCartNum,@Param("foodId") int foodId);

    int insertOrderTotal(@Param("orderTotal") int orderTotal,@Param("foodId")int foodId);
}
