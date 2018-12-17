/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OrderLineCrotroller
 * Author:   hasee
 * Date:     2018/11/22 13:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.crotroller;

import com.baoxin.VO.OrderFormVO;
import com.baoxin.VO.OrderTzVO;
import com.baoxin.pojo.OrderLine;
import com.baoxin.service.serviceImpl.FoodServiceImpl;
import com.baoxin.service.serviceImpl.OrderLineServiceImpl;
import com.baoxin.service.serviceImpl.ShoppingCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/22
 * @since 1.0.0
 */
@RestController
public class OrderLineCrotroller {

    @Autowired
    OrderLineServiceImpl orderLineService;
    @Autowired
    FoodServiceImpl foodService;
    @Autowired
    ShoppingCarServiceImpl shoppingCarService;

    @RequestMapping(value = "/cust/order/Insert",method = RequestMethod.POST)
    public OrderLine insert(@RequestBody OrderLine orderLine){
        OrderLine save = orderLineService.save(orderLine);
        System.out.println("订单生成成功"+save);
        return save;
    }

    //x-wwww
    @RequestMapping("/cust/order/Delete")
    public void delete(@RequestBody OrderLine orderLine){
        orderLineService.delete(orderLine.getOrderId());
    }

    @RequestMapping(value = "/cust/order/DeleteTZ",method = RequestMethod.POST)
    public void deleteTz(@RequestBody OrderTzVO orderTzVO){

        int i = orderLineService.OrderTZDelete(orderTzVO.getName());
        System.out.println("删除成功"+i+"条数据");
    }

    @RequestMapping(value = "/cust/order/listAllOrder",method = RequestMethod.GET)
    public List<OrderLine> seleteAll(){
       return orderLineService.listAllOrder();
    }

//    @PostMapping("/cust/order/FoodTZ")
//    public OrderTzVO insert(@RequestBody OrderTzVO orderTzVO){
////        foodService.insertFoodName(orderTzVO);
////        System.out.println("商品添加成功:"+orderTzVO.getName());
//        System.out.println("商品id:"+orderTzVO.getFoodId());
//
//        shoppingCarService.insertShoppCarNum(orderTzVO);
//        System.out.println("数量添加成功:"+orderTzVO.getShoppCartNum());
//
//        orderLineService.insertOrderTotal(orderTzVO);
//        System.out.println("总价添加成功:"+orderTzVO.getOrderTotal());
//
//        return orderTzVO;
//    }

    @PostMapping("/cust/order/FoodTZ")
    public List<OrderTzVO> insert(@RequestBody List<OrderTzVO> orderTzVO){
//        foodService.insertFoodName(orderTzVO);
//        System.out.println("商品添加成功:"+orderTzVO.getName());

        /*System.out.println("商品id:"+orderTzVO.getFoodId());

        shoppingCarService.insertShoppCarNum(orderTzVO);
        System.out.println("数量添加成功:"+orderTzVO.getShoppCartNum());

        orderLineService.insertOrderTotal(orderTzVO);
        System.out.println("总价添加成功:"+orderTzVO.getOrderTotal());*/
        int Total = 0;
        System.out.println(orderTzVO.size());
        for (int i=0;i<orderTzVO.size();i++){

            OrderTzVO o = orderTzVO.get(i);
            int shoppCartNum = o.getShoppCartNum();
            Total=o.getOrderTotal()+Total;
            o.getFoodId();
            o.getName();
            shoppingCarService.insertShoppCarNum(o.getShoppCartNum(),o.getFoodId());
            orderLineService.insertOrderTotal(o.getOrderTotal(),o.getFoodId());
        }
        System.out.println(Total);
        return orderTzVO;
    }

    //x-wwww
    @RequestMapping("/cust/order/OneOrder")
    public OrderFormVO oneOrder1(@RequestBody OrderLine orderLine){
        return orderLineService.OneOrder1(orderLine.getOrderId());
    }

    @RequestMapping(value = "/cust/order/AllOrder")
    public List<OrderFormVO> allOrder(){
        return orderLineService.AllOrder();
    }

    //x-wwww
    @RequestMapping("/cust/order/check")
    public int check(@RequestBody OrderLine orderLine){
        int i = orderLineService.CheckOrderline(orderLine.getOrderId());
        return i;
    }
    //raw
    @RequestMapping("/cust/order/Update")
    public OrderLine update(@RequestBody OrderLine orderLine){
        orderLineService.update(orderLine);
        return orderLine;
    }

    @GetMapping(value = "/cust/order/OrderTz")
    public List<OrderTzVO> OrderTongZhi(){

       return orderLineService.OrderTongZhi();
    }
}

