/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FoodServiceImpl
 * Author:   hasee
 * Date:     2018/11/21 17:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.service.serviceImpl;

import com.baoxin.VO.OrderTzVO;
import com.baoxin.common.Conts;
import com.baoxin.dao.FoodMapper;
import com.baoxin.dao.OrderTzVOMapper;
import com.baoxin.pojo.Food;
import com.baoxin.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/21
 * @since 1.0.0
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodMapper foodMapper;
    @Autowired
    OrderTzVOMapper orderTzVOMapper;

    private String imgAddres;

    @Override
    public Food save(Food food) {
        String name = foodMapper.checkFoodName(food.getName());
        if (name != null){
            return null;
        }
        food.setStock(Conts.FOOD_PUSH);
        food.setPicture(this.getClass().getClassLoader().getResource("img/")+food.getPicture().replace("file:/","").trim());
        System.out.println();
        foodMapper.insertSelective(food);
        return food;
    }

    @Override
    public Food insert(Food food) {
        foodMapper.insertFoodName(food);
        return food;
    }

    @Override
    public Food update(Food food) {
        String name = foodMapper.checkFoodName(food.getName());
        if (name == null){
            return null;
        }
        food.setStock(Conts.FOOD_PULL);
        foodMapper.updateByPrimaryKeySelective(food);
        return food;
    }

    @Override
    public Food findFoodByName(String name) {
        String foodName = foodMapper.checkFoodName(name);
        if (foodName == null){
            return null;
        }
        return foodMapper.findFoodByName(name);
    }

    @Override
    public List<Food> ListFood() {
        return foodMapper.ListFood();
    }

    @Override
    public String checkFood(String name) {
        return foodMapper.checkFoodName(name);
    }

//    @Override
//    public String insertFoodName(OrderTzVO orderTzVO) {
//        orderTzVOMapper.insertFoodName(orderTzVO);
//        return ""+orderTzVO.getName();
//    }

    @Override
    public OrderTzVO insertFoodName(OrderTzVO orderTzVO) {
        orderTzVOMapper.insertFoodName(orderTzVO);
        return  orderTzVO;
    }
}

