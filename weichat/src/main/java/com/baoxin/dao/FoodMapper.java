package com.baoxin.dao;

import com.baoxin.pojo.Food;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    Food findFoodByName(@Param("name") String name);

    public List<Food> ListFood();

    String checkFoodName(@Param("name") String name);

    int checkFoodStatus(Integer id);

    int insertFoodName(Food record);
}