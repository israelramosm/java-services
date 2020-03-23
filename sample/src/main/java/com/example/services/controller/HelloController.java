package com.example.services.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {

    @RequestMapping(value="/greet", method=RequestMethod.GET)
    public @ResponseBody String greet() {
        return "Greetings from Spring Boot!";
    }
}