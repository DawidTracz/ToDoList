package com.DawidTracz.toDoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }

    @GetMapping("/register")
    public String registrationPage(Model model) {
        return "registrationform";
    }


}


