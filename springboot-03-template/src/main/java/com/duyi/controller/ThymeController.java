package com.duyi.controller;

import com.duyi.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

    @RequestMapping("/thyme")
    public String index(Model model){
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("大师傅");
        restaurant.setChef("林大厨");
        model.addAttribute("restaurant",restaurant);
        return "thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "thymeleaf/welcome";
    }

    @RequestMapping("/hello")
    public String hello(Model m) {
        // m.addAttribute("name", "thymeleaf");
        m.addAttribute("name", "<span style='color:red'>thymeleaf</span>");
        return "hello";
    }
}
