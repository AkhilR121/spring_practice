package com.shopping_app.shopping_cart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String welcomePage(){
        return "Welcome!!";
    }
}
