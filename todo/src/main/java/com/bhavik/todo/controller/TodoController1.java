package com.bhavik.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "to-do1")
public class TodoController1 {

    @GetMapping("hello-world")
    @ResponseBody
    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("say-hello")
    public String getSayHelloPage(){
        return "say-hello";
    }

    @GetMapping("welcome")
    public String getWelcomePage(){
        return "welcome";
    }
}
