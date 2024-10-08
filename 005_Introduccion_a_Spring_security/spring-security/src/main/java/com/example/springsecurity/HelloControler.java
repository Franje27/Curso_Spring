package com.example.springsecurity;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    // GET http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        SecurityContextHolder.getContext().getAuthentication();
        return "Hello World";
    }
}
