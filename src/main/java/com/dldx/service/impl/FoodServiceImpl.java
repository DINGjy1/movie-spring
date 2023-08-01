package com.dldx.service.impl;

import com.dldx.dao.FoodDao;
import com.dldx.pojo.Food;
import com.dldx.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Resource
    private FoodDao foodDao ;
    @Override
    public List<Food> getAllFoods() {
        return foodDao.getAllFoods();
    }

    @Override
    public Food getFoodByFoodNo(Integer foodNo) {
        return foodDao.getFoodByFoodNo(foodNo);
    }

    @Override
    public int addFood(Food food) {
        return foodDao.addFood(food);
    }

    @Override
    public int updateFood(Food food) {
        return foodDao.updateFood(food);
    }

    @Override
    public int deleteFood(Integer foodNo) {
        return foodDao.deleteFood(foodNo);
    }
}
