package com.baosight.service;

import com.baosight.pojo.Food;

import java.util.List;

public interface FoodService {

    public Food save(Food food);

    public Food insert(Food food);

    public Food update(Food food);

    Food findFoodByName(String name);

    List<Food> ListFood();

    String checkFood(String name);

}
