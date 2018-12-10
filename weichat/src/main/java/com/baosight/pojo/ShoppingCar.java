package com.baosight.pojo;

import java.util.Date;

public class ShoppingCar {
    private Integer id;

    private Integer userId;

    private Integer foodId;

    private Integer status;

    private Integer num;

    private Date creatTime;

    private Date updateTime;



    public ShoppingCar(Integer id, Integer userId, Integer foodId, Integer status, Integer num, Date creatTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.foodId = foodId;
        this.status = status;
        this.num = num;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public ShoppingCar() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
}