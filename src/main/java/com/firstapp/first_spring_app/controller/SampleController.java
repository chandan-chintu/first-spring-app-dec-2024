package com.firstapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/sample1")
    public String sampleApi1(){
        return "This is our first sample API";
    }
}
