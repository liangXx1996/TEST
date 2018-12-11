package com.baosight.pojo;

import java.util.Date;

public class Coll {
    private Integer id;

    private Integer userId;

    private Integer foodId;

    private Date creatTime;

    private Date updateTime;

    public Coll(Integer id, Integer userId, Integer foodId, Date creatTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.foodId = foodId;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public Coll() {
        super();
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