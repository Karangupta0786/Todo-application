package com.example.demo.service;

import com.example.demo.models.TODO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<TODO> list = new ArrayList<>();
    public TODO createTodo(TODO todo){
        list.add(todo);
        return todo;
    }
    public List<TODO> getList(){
        return list;
    }
}
