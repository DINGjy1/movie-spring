package com.dldx.controller;

import com.dldx.pojo.Food;
import com.dldx.service.FoodService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FoodController {
    @Resource
   private FoodService foodService;

    @GetMapping("/food/allfoods")
    public List<Food> getAllFoods(){
        return  foodService.getAllFoods();
    }

    @GetMapping("/food/{foodNo}")
    public Food getOneFood(@PathVariable  Integer foodNo){
        return foodService.getFoodByFoodNo(foodNo);
    }

    @PutMapping("/food/food")
    public String updateFood(@RequestBody Food food){
        String msg="Error";
        int num = foodService.updateFood(food);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }
    @PostMapping("/food/food")
    public String insertFood(Food food){
        String msg="Erroe";
        int num = foodService.addFood(food);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }

    @DeleteMapping("/food/{foodNo}")
    public String deleteFood(@PathVariable Integer foodNo){
        String msg="Error";
        int num = foodService.deleteFood(foodNo);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }


}
