package com.baosight.dao;

import com.baosight.VO.OrderFormVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderFormMapper {

    OrderFormVO OneOrder(@Param("orderId") String orderId);

//    @Select("select * from orderline")
//    @Results({
//            @Result(id = true,column = "id"),
//            @Result(column = "name",property = "foodName"),
//            @Result(column = "name",property = "userName"),
//            @Result(column = "id",property = "orderId"),
//            @Result(column = "num",property = "foodNum"),
//            @Result(column = "picture",property = "foodPic"),
//            @Result(column = "price",property = "foodPrice"),
//            @Result(column = "stock",property = "foodStatues"),
//            @Result(column = "total",property = "orderTotal")
//    })
    List<OrderFormVO> AllOrder();
}
