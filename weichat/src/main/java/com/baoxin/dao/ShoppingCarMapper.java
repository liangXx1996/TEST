package com.baoxin.dao;

import com.baoxin.pojo.ShoppingCar;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCarMapper {
    int deleteByPrimaryKey(Integer num);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    ShoppingCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar shoppingCar);

    int insertShoppCarNum(ShoppingCar record);
}