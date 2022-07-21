package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "hello world ! ! !";
    }

}
