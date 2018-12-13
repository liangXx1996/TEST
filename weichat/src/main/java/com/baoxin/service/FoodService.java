package com.baoxin.service;

import com.baoxin.VO.OrderTzVO;
import com.baoxin.pojo.Food;

import java.util.List;

public interface FoodService {

    public Food save(Food food);

    public Food insert(Food food);

    public Food update(Food food);

    Food findFoodByName(String name);

    List<Food> ListFood();

    String checkFood(String name);

//    String insertFoodName(OrderTzVO orderTzVO);
    OrderTzVO insertFoodName(OrderTzVO orderTzVO);

}
