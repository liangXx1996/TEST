package com.baosight.dao;

import com.baosight.VO.OrderTzVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderTzVOMapper {

    List<OrderTzVO> OrderTongZhi();

    int OrderTZDelete(String foodName);
}
