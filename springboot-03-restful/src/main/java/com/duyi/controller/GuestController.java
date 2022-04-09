package com.duyi.controller;

import com.duyi.bean.Guest;
import com.duyi.service.GuestSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestSevice sevice;

    @GetMapping
    public String list(Model model){
        List<Guest> guestList = sevice.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(Guest guest){
        sevice.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("toUpdate/{name}")
    public String toUpdate(Model model, @PathVariable("name") String name){
        Guest guest = sevice.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest){
        sevice.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        sevice.delete(name);
        return "redirect:/guest";
    }
}
