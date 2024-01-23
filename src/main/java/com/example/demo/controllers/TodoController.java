package com.example.demo.controllers;

import com.example.demo.models.TODO;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // Create todo

    @PostMapping
    public TODO createTodo(@RequestBody TODO todo){
        //Create todo
        return todoService.createTodo(todo);
    }


    // Get all todo

    @GetMapping
    public List<TODO> getAll(){
        return todoService.getList();
    }


    //Do work on Update and delete Todos





}
