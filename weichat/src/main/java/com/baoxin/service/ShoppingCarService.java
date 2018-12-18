package com.baoxin.service;

import com.baoxin.VO.OrderTzVO;
import com.baoxin.VO.ShoppingCarVO;
import com.baoxin.pojo.ShoppingCar;

import java.util.Date;
import java.util.List;

public interface ShoppingCarService {

    public ShoppingCar save(ShoppingCar shoppingCar);

    public void delete(Integer num);

    public ShoppingCar update(ShoppingCar shoppingCar);

    List<ShoppingCarVO> shopCarSelete();

    void insertShoppCarNum(int shoppCartNum,int foodId,int status);

    int insertFood(int foodId, int num, int status, Date creatTime);

    int deleteAll(int status);

    int updateShopCarStatus();
}

