package com.baoxin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Food {
    public Integer id;

    public String name;

    public BigDecimal price;

    public String picture;

    public Integer stock;

    public Date creatTime;

    public Date updateTime;

    public Food(Integer id, String name, BigDecimal price, String picture, Integer stock, Date creatTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.stock = stock;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public Food() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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