package com.johnbrix.portfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Portfolio {

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }
}
