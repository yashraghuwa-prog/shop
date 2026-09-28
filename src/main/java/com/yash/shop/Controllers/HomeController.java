package com.yash.shop.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")

    public String greet(){
        return "welcome to shopper";
    }

    @RequestMapping("/about")
    public String about(){
        return "we dont love you";
    }

}
