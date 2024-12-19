package com.firstapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/apis")
public class SimpleDemoController {

    @GetMapping("/simple")
    public String demoApi1(){
        return "This is our simple API";
    }
}
