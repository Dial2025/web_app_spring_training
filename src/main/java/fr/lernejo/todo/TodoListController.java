package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    private final List<Todo> todoList = new ArrayList<Todo>();

    @RequestMapping(value = ("/api/todo"), method=RequestMethod.POST)
    public void addTodo(@RequestBody Todo todo) {
        todoList.add(todo);
    }

    @RequestMapping(value = ("/api/todo"),  method=RequestMethod.GET)
    public List<Todo> viewTodo() {
        return todoList;
    }
}


