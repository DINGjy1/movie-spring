package com.dldx.service;

import com.dldx.pojo.Food;

import java.util.List;

public interface FoodService {

    List<Food> getAllFoods();

    Food getFoodByFoodNo(Integer foodNo);

    int addFood(Food food);

    int updateFood(Food food);

    int deleteFood(Integer foodNo);
}
