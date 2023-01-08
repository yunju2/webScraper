package com.yunju2.webscraper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String Home(){

        String str = "hello";
        return str;
    }
}
