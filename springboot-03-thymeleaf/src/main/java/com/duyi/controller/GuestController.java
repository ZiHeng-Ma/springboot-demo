package com.duyi.controller;

import com.duyi.bean.Guest;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/guest/list")
    public String list(Model model){
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toUpdate")
    public String toUpdate(Model model,String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/delete")
    public String delete(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }
}
