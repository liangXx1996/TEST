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
package com.baosight.VO;

import java.math.BigDecimal;

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
    private BigDecimal orderTotal;
    private int shoppCartNum;

    public OrderTzVO() {
    }

    public OrderTzVO(String name, BigDecimal orderTotal, int shoppCartNum) {
        this.name = name;
        this.orderTotal = orderTotal;
        this.shoppCartNum = shoppCartNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getShoppCartNum() {
        return shoppCartNum;
    }

    public void setShoppCartNum(int shoppCartNum) {
        this.shoppCartNum = shoppCartNum;
    }

    @Override
    public String toString() {
        return "OrderTzVO{" +
                "name='" + name + '\'' +
                ", orderTotal=" + orderTotal +
                ", shoppCartNum=" + shoppCartNum +
                '}';
    }
}

