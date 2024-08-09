package com.example.springwebfluxthymeleaf.example1.controller;

import com.example.springwebfluxthymeleaf.example1.model.Employee;
import com.example.springwebfluxthymeleaf.example1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring6.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

@Controller
public class EmployeeController {

    //Modo FULL
    //Modo CHUNKED: añadir propiedad spring.thymeleaf.reactive.max-chunk-size=1024 en application.properties
    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public String FindAll(Model model){
        Flux<Employee> employees = service.findAll();
        model.addAttribute("employees", employees);
        return "employee-list";
    }

    @GetMapping("/employees/reactive")
    public String findAllReactive(Model model){
        Flux<Employee> employees = service.findAll();
        model.addAttribute("employees", new ReactiveDataDriverContextVariable(employees, 50));
        return "employee-list";
    }

}
