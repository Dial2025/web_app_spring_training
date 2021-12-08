package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    private final TodoRepository repository;

    public TodoListController(TodoRepository repo) {
        this.repository = repo;
    }

    @RequestMapping(value = ("/api/todo"), method=RequestMethod.POST)
    public void addTodo(@RequestBody TodoEntity newTodo) {
        this.repository.save(newTodo);
    }

    @RequestMapping(value = ("/api/todo"),  method=RequestMethod.GET)
    public Iterable<TodoEntity> getTodoList() {
        return this.repository.findAll();
    }
}


