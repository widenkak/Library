package com.example.BookLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List <Book> getAll() {
        return jdbcTemplate.query("SELECT id, name, author FROM book", BeanPropertyRowMapper.newInstance(Book.class));
    }
}

