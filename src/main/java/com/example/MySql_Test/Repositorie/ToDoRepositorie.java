package com.example.MySql_Test.Repositorie;

import com.example.MySql_Test.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepositorie extends JpaRepository<Todo, Integer> {
}
