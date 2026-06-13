package com.june13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jun13Controller {
    @GetMapping("/get")
    public String test(){
    return "hello reddy its june 13 and its for testing + merge conflict example";
    }
}
