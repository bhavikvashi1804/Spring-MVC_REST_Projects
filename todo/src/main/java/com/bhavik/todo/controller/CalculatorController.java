package com.bhavik.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("calculator")
public class CalculatorController {


    @GetMapping("/add")
    public String add(){
        return "add";
    }


    @GetMapping("/add-num")
    public String add(@RequestParam Long number1, @RequestParam Long number2, Model model){
        model.addAttribute("result", number1+ number2);
        return "result";
    }
}
