package com.duyi.controller;

import com.duyi.model.Guest;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping("")
    public String getGuests(Model model){
        List<Guest> result = guestService.getGuests();
        model.addAttribute("guests",result);
        return "/list";
    }
}
