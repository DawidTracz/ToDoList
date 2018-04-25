package com.DawidTracz.toDoList.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }
    }


