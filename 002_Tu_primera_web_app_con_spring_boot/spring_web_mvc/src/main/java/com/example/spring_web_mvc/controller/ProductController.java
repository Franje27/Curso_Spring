package com.example.spring_web_mvc.controller;

import com.example.spring_web_mvc.entity.Product;
import com.example.spring_web_mvc.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products ")
public class ProductController {

    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String findAll(Model model){

        List<Product> products = this.repository.findAll();
        model.addAttribute("products", products);
        return "product-list";

    }



}
