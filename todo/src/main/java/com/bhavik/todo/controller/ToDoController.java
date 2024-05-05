package com.bhavik.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "to-do")
public class ToDoController {

    @GetMapping(value = "hello-world")
    public String getHelloWorld(){
        return  "Hello World";
    }
}
