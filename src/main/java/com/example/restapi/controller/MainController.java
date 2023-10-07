package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
@RequestMapping("greetings")
public class MainController {
    private static int count = 0;


    @GetMapping( "hello")
    public String sayHello() {
        return "Hello " + count++;
    }

    @RequestMapping(path = "hi" , method = RequestMethod.GET)
    public String sayHi(){
        return "hi"+count++;
    }



}
