package fr.lernejo.todo;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

@Table("todo")
public class TodoEntity {
    @Id
    public Long Id;
    public String message;
    public String author;
}
