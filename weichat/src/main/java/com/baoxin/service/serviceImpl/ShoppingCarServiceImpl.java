/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ShoppingCarServiceImpl
 * Author:   hasee
 * Date:     2018/11/22 8:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.service.serviceImpl;

import com.baoxin.VO.OrderTzVO;
import com.baoxin.VO.ShoppingCarVO;
import com.baoxin.common.Conts;
import com.baoxin.dao.FoodMapper;
import com.baoxin.dao.OrderTzVOMapper;
import com.baoxin.dao.ShopCarVOMapper;
import com.baoxin.dao.ShoppingCarMapper;
import com.baoxin.pojo.ShoppingCar;
import com.baoxin.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/22
 * @since 1.0.0
 */
@Service
public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    ShoppingCarMapper shoppingCarMapper;
    @Autowired
    ShopCarVOMapper shopCarVOMapper;
    @Autowired
    FoodMapper foodMapper;
    @Autowired
    OrderTzVOMapper orderTzVOMapper;

    @Override
    public ShoppingCar save(ShoppingCar shoppingCar) {
        //1=下架
//        int i = foodMapper.checkFoodStatus(shoppingCar.getFoodid());
//        if (i == 1){
//            return null;
//        }
        shoppingCar.setStatus(Conts.SHOPPINGCAR_CHECKED);
        shoppingCarMapper.insert(shoppingCar);
        return shoppingCar;
    }

    @Override
    public void delete(Integer num) {
        shoppingCarMapper.deleteByPrimaryKey(num);
    }

    @Override
    public ShoppingCar update(ShoppingCar shoppingCar) {

        shoppingCar.setStatus(Conts.SHOPPINGCAR_UNCHECKED);
        shoppingCarMapper.updateByPrimaryKeySelective(shoppingCar);
        return shoppingCar;
    }

    @Override
    public List<ShoppingCarVO> shopCarSelete() {
        return shopCarVOMapper.shopCarSelete();
    }

//    @Override
//    public ShoppingCar insertShoppCarNum(ShoppingCar shoppingCar) {
//        shoppingCarMapper.insertShoppCarNum(shoppingCar);
//        return shoppingCar;
//    }


    @Override
    public void insertShoppCarNum(int shoppCartNum,int foodId) {
         orderTzVOMapper.insertShoppCarNum(shoppCartNum,foodId);
    }
}

