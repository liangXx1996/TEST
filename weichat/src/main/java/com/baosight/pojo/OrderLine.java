package com.baosight.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderLine {
    private Integer id;

    private String orderId;

    private Integer userId;

    private Integer foodId;

    private Integer num;

    private BigDecimal total;

    private Integer status;

    private Date creatTime;

    private Date updateTime;

    private List<Food> foods;

    public OrderLine(Integer id, String orderId, Integer userId, Integer foodId, Integer num, BigDecimal total, Integer status, Date creatTime, Date updateTime) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.foodId = foodId;
        this.num = num;
        this.total = total;
        this.status = status;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public OrderLine() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderid(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserid() {
        return userId;
    }

    public void setUserid(Integer userId) {
        this.userId = userId;
    }

    public Integer getFoodid() {
        return foodId;
    }

    public void setFoodid(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreattime() {
        return creatTime;
    }

    public void setCreattime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdatetime() {
        return updateTime;
    }

    public void setUpdatetime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", userId=" + userId +
                ", foodId=" + foodId +
                ", num=" + num +
                ", total=" + total +
                ", status=" + status +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", foods=" + foods +
                '}';
    }
}