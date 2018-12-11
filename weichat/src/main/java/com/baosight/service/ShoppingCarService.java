package com.baosight.service;

import com.baosight.VO.ShoppingCarVO;
import com.baosight.pojo.ShoppingCar;

import java.util.List;

public interface ShoppingCarService {

    public ShoppingCar save(ShoppingCar shoppingCar);

    public void delete(Integer num);

    public ShoppingCar update(ShoppingCar shoppingCar);

    List<ShoppingCarVO> shopCarSelete();

    ShoppingCar insertShoppCarNum(ShoppingCar shoppingCar);
}

