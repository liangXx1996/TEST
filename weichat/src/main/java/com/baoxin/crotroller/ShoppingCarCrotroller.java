/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ShoppingCarCrotroller
 * Author:   hasee
 * Date:     2018/11/22 13:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.crotroller;

import com.baoxin.VO.ShoppingCarVO;
import com.baoxin.pojo.ShoppingCar;
import com.baoxin.service.serviceImpl.ShoppingCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/22
 * @since 1.0.0
 */
@RestController
public class ShoppingCarCrotroller {

    @Autowired
    ShoppingCarServiceImpl shoppingCarService;

    //raw
    @RequestMapping("/cust/shopCar/Insert")
    public List<ShoppingCar> insert(@RequestBody List<ShoppingCar> shoppingCar){
        for(int i=0;i<shoppingCar.size();i++){
            ShoppingCar car = shoppingCar.get(i);
            car.getFoodid();
            car.getNum();
            shoppingCarService.insertFood(car.getFoodid(),car.getNum(),car.getStatus(),car.getCreattime());
            System.out.println("foodId:"+car.getFoodid());
            System.out.println("num:"+car.getNum());
        }
        return shoppingCar;
    }

    //x-wwww
    @RequestMapping("/cust/shopCar/Delete")
 //   public void delete(@RequestParam("id") Integer id)
    public void delete(@RequestBody ShoppingCar shoppingCar) {
        ShoppingCar car = shoppingCarService.update(shoppingCar);
        if (car.getNum() == 0){
            shoppingCarService.delete(shoppingCar.getNum());
        }

    }

    @RequestMapping(value = "/cust/shopCar/Selete",method = RequestMethod.GET)
    public List<ShoppingCarVO> select(){
        return shoppingCarService.shopCarSelete();
    }

    @RequestMapping("/cust/shopCar/Update")
    public ShoppingCar update(@RequestBody ShoppingCar shoppingCar){
        return shoppingCarService.update(shoppingCar);
    }

    @PostMapping("/cust/shopCar/deleteAll")
    public int deleteAll(@RequestBody ShoppingCar shoppingCar){
        int i = shoppingCarService.deleteAll(shoppingCar.getStatus());
        System.out.println("删除了:"+i+"条数据");
        return i;
    }

    @RequestMapping("/cust/shopCar/updataStatus")
    public int updataStatus(){
        int i = shoppingCarService.updateShopCarStatus();
        System.out.println("状态以修改:"+i+"条数据");
        return i;
    }
}

