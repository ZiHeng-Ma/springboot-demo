package com.duyi.controller;

import com.duyi.bean.Food;
import com.duyi.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 * 是@Controller和@ResponseBody的结合
 * 返回JSON格式的响应结果
 */
@RestController
public class JsonController {

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
