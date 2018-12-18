package com.baoxin.dao;

import com.baoxin.pojo.ShoppingCar;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ShoppingCarMapper {
    int deleteByPrimaryKey(Integer num);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    ShoppingCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar shoppingCar);

    int insertShoppCarNum(ShoppingCar record);

    int insertFood(@Param("foodId") int foodId,@Param("num") int num,@Param("status") int status,@Param("creatTime") Date creatTime);

    int deleteAll(int status);

    int updateShopCarStatus();
}