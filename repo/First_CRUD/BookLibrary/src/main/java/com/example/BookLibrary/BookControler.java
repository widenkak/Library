package com.example.BookLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookControler {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/test")
    public String test() {
        return "Test response";
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.getAll();
    }
}
