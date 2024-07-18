package com.example.spring_intro.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public String hello() {
        return "Hello World";
    }
}
