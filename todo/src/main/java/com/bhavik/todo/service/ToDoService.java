package com.bhavik.todo.service;



import org.springframework.stereotype.Service;

import java.util.*;

import  com.bhavik.todo.model.ToDo;

@Service
public class ToDoService {

    List<ToDo> todos = new ArrayList<>();


    public List<ToDo> getTodos() {
        return todos;
    }

    public Boolean addTodo(ToDo todo) {
        return todos.add(todo);
    }
}
