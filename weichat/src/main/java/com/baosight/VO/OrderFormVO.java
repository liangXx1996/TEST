/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OrderFormVO
 * Author:   hasee
 * Date:     2018/11/27 16:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baosight.VO;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/27
 * @since 1.0.0
 */
public class OrderFormVO {
//o.id,c.name,f.name,f.picture,f.price,f.stock,o.num,o.total
    private String orderId;
    private String foodId;
    private String ShopCarFoodId;
    private String foodName;
    private String foodPic;
    private BigDecimal foodPrice;
    private int foodStatues;
    private int foodNum;
    private BigDecimal orderTotal;

    public OrderFormVO() {
    }

    public OrderFormVO(String orderId, String foodId, String shopCarFoodId, String foodName, String foodPic, BigDecimal foodPrice, int foodStatues, int foodNum, BigDecimal orderTotal) {
        this.orderId = orderId;
        this.foodId = foodId;
        this.ShopCarFoodId = shopCarFoodId;
        this.foodName = foodName;
        this.foodPic = foodPic;
        this.foodPrice = foodPrice;
        this.foodStatues = foodStatues;
        this.foodNum = foodNum;
        this.orderTotal = orderTotal;
    }


    public String getShopCarFoodId() {
        return ShopCarFoodId;
    }

    public void setShopCarFoodId(String shopCarFoodId) {
        this.ShopCarFoodId = shopCarFoodId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(String foodPic) {
        this.foodPic = foodPic;
    }

    public BigDecimal getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(BigDecimal foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodStatues() {
        return foodStatues;
    }

    public void setFoodStatues(int foodStatues) {
        this.foodStatues = foodStatues;
    }

    public int getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(int foodNum) {
        this.foodNum = foodNum;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public String toString() {
        return "OrderFormVO{" +
                "orderId='" + orderId + '\'' +
                ", foodId='" + foodId + '\'' +
                ", ShopCarFoodId='" + ShopCarFoodId + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodPic='" + foodPic + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodStatues=" + foodStatues +
                ", foodNum=" + foodNum +
                ", orderTotal=" + orderTotal +
                '}';
    }
}


