package com.example.services.controller;

import org.springbootframework.web.bind.annotation.RestController;
import org.springbootframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}