/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OrderTzVO
 * Author:   hasee
 * Date:     2018/12/4 15:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.VO;

//import java.math.int;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/12/4
 * @since 1.0.0
 */
public class OrderTzVO {

    private String name;
    private int orderTotal;
    private int shoppCartNum;
    private int foodId;
    private Date time;
    private int status;

    public OrderTzVO() {
    }

    public OrderTzVO(String name, int orderTotal, int shoppCartNum, int foodId, Date time, int status) {
        this.name = name;
        this.orderTotal = orderTotal;
        this.shoppCartNum = shoppCartNum;
        this.foodId = foodId;
        this.time = time;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getShoppCartNum() {
        return shoppCartNum;
    }

    public void setShoppCartNum(int shoppCartNum) {
        this.shoppCartNum = shoppCartNum;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderTzVO{" +
                "name='" + name + '\'' +
                ", orderTotal=" + orderTotal +
                ", shoppCartNum=" + shoppCartNum +
                ", foodId=" + foodId +
                ", time=" + time +
                ", status=" + status +
                '}';
    }
}

