package com.example.MySql_Test.Controller;

import com.example.MySql_Test.Model.Todo;
import com.example.MySql_Test.Repositorie.ToDoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoRepositorie repositorie;


    @GetMapping("/todos")
    List<Todo> getAllTodos(){

        List<Todo> todos = repositorie.findAll();

        return todos;
    }





}
