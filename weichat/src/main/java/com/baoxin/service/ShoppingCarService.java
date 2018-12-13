package com.baoxin.service;

import com.baoxin.VO.OrderTzVO;
import com.baoxin.VO.ShoppingCarVO;
import com.baoxin.pojo.ShoppingCar;

import java.util.List;

public interface ShoppingCarService {

    public ShoppingCar save(ShoppingCar shoppingCar);

    public void delete(Integer num);

    public ShoppingCar update(ShoppingCar shoppingCar);

    List<ShoppingCarVO> shopCarSelete();

    OrderTzVO insertShoppCarNum(OrderTzVO orderTzVO);
}

