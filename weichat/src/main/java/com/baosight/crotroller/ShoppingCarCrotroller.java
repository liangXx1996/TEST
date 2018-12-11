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
package com.baosight.crotroller;

import com.baosight.VO.ShoppingCarVO;
import com.baosight.pojo.ShoppingCar;
import com.baosight.service.serviceImpl.ShoppingCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ShoppingCar insert(@RequestBody ShoppingCar shoppingCar){
        shoppingCarService.save(shoppingCar);
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

    @RequestMapping("/cust/shopCar/Selete")
    public List<ShoppingCarVO> select(){
        return shoppingCarService.shopCarSelete();
    }

    @RequestMapping("/cust/shopCar/Update")
    public ShoppingCar update(@RequestBody ShoppingCar shoppingCar){
        return shoppingCarService.update(shoppingCar);
    }

}

