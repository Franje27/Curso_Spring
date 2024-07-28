package com.example.springtestingunit.service;

import com.example.springtestingunit.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();
    Optional<Book> findById(Long id);
}
