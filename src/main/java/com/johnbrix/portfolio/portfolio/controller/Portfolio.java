package com.johnbrix.portfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Portfolio {

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }
}
