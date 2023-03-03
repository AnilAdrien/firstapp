package com.example.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/welcome")
    public String first_api(){

        return "Welcome Project ";
    }
    
}
