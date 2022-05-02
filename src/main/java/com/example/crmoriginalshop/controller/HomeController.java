package com.example.crmoriginalshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final static String HOME_PAGE = "home";

    @GetMapping
    public String home(){
    return HOME_PAGE;
    }
}
