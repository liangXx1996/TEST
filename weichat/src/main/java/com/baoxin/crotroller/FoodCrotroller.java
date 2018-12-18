/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FoodCrotroller
 * Author:   hasee
 * Date:     2018/11/21 17:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.crotroller;

import com.baoxin.pojo.Food;
import com.baoxin.service.serviceImpl.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/21
 * @since 1.0.0
 */
@RestController
public class FoodCrotroller {

    @Autowired
    FoodServiceImpl foodService;
    /*
    增
     */
    //raw
    @RequestMapping("/cust/food/Save")
    public Food insert(@RequestBody Food food){
        foodService.save(food);
        return  food;
    }
    /*
    改
     */
    //raw
    @RequestMapping(value = "/cust/food/update",method = RequestMethod.POST)
    public Food update(@RequestBody Food food){
        foodService.update(food);
        return food;
    }
    /*
    查
    */
    //x-wwww
    @RequestMapping("/cust/food/findByName")
    public Food findFoodByName(@RequestBody Food food){
        return foodService.findFoodByName(food.getName());
    }
    /*
    查找所有
    */
    @GetMapping("/cust/food/listFood")
    public List<Food> ListCustomer(){
        return foodService.ListFood();
    }
}

