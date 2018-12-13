/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ShoppingCarVO
 * Author:   hasee
 * Date:     2018/11/27 21:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.VO;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/27
 * @since 1.0.0
 */
public class ShoppingCarVO {

    private String name;
    private BigDecimal price;
    private Integer num;
    private Date creatTime;
    private Integer status;

    public ShoppingCarVO() { }

    public ShoppingCarVO(String name, BigDecimal price, Integer num, Date creatTime, Integer status) {
        this.name = name;
        this.price = price;
        this.num = num;
        this.creatTime = creatTime;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ShoppingCarVO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", creatTime=" + creatTime +
                ", status=" + status +
                '}';
    }
}

