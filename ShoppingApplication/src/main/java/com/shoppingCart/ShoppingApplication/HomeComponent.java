package com.shoppingCart.ShoppingApplication;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HomeComponent {
    @RequestMapping("/")
    public String firstBuild(){
        return "First Build";
    }
}
