package com.example.springcrudthymeleaf.controller;

import com.example.springcrudthymeleaf.model.Book;
import com.example.springcrudthymeleaf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/*
CRUD
Create
Retrieved/Read
Update
Delete
 */
@Controller
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping("/")
    public String index(){
        return "redirect:/books";
    }
    @GetMapping("/books")
    public String findAll(Model model){
        model.addAttribute("books", repository.findAll());
        return "book-list";
    }

    @GetMapping("/books/view/{id}")
    public String findById(Model model, @PathVariable Long id){
        model.addAttribute("books", repository.findById(id).get());
        return "book-view";
    }



    @GetMapping("/books/form")
    public String getForm(Model model){
        model.addAttribute("book", new Book());
        return "book-form";
    }

    @GetMapping("/books/form/edit/{id}")
    public String getFormWithBook(Model model, @PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.findById(id).ifPresent(b -> model.addAttribute("book", b));
            return "book-form";
        } else {
            return "redirect:/books/form";
        }
    }
    @PostMapping("/books")
    public String create(@ModelAttribute Book book){
       if(book.getId() != null){
           // actualizacion
           repository.findById(book.getId()).ifPresent(b -> {
               b.setTitle(book.getTitle());
               b.setAuthor(book.getAuthor());
               b.setPrice(book.getPrice());
           });
       } else {
           //creacion
           repository.save(book);
       }
       return "redirect:/books";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteById(@PathVariable Long id){
        if(repository.existsById(id))
            repository.deleteById(id);
        return "redirect:/books";
    }
    }
