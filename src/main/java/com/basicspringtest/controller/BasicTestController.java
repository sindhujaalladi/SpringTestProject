package com.basicspringtest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/project")
public class BasicTestController {

    @GetMapping
    public String getMessage() {
        return "Hello!! this is my first " ;
    }
}
