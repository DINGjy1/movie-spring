package com.dldx.dao;

import com.dldx.pojo.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodDao {
    //查所有
    List<Food> getAllFoods();
    //按编号查询
    Food getFoodByFoodNo(Integer foodNo);

    int addFood(Food food);

    int updateFood(Food food);

    int deleteFood(Integer foodNo);
}
