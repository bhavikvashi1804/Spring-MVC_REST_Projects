package com.bhavik.todo.controller;


import com.bhavik.todo.model.ToDo;
import com.bhavik.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "to-do1")
public class TodoController1 {

    @Autowired
    ToDoService toDoService;

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



    @GetMapping("/add")
    public String addToDo(){
        return "todo-add";
    }

    @PostMapping("/add")
    public String addToDo(@ModelAttribute ToDo toDo){
        toDoService.addTodo(toDo);
        return "redirect:list";
    }

    @GetMapping("/list")
    public String listToDo(Model model){
        List<ToDo> todos = toDoService.getTodos();
        model.addAttribute("todos", todos);
        return "list";
    }
}
