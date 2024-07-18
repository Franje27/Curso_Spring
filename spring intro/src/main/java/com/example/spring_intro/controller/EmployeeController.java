package com.example.spring_intro.controller;

import com.example.spring_intro.primary.CustomerService;
import com.example.spring_intro.service.EmployeeService;
import com.example2.spring_intro.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

  //  @Autowired
    private HelloService helloService;

  //  @Autowired
    private EmployeeService employeeService;

 //   @Autowired
    private CustomerService customerService;

    public EmployeeController(HelloService helloService, EmployeeService employeeService, CustomerService customerService) {
        this.helloService = helloService;
        this.employeeService = employeeService;
        this.customerService = customerService;
    }

    public String hello(){

       return this.employeeService.hello();
    }

    public String helloFromEmployeeService(){
        return this.employeeService.hello();
    }

    public String helloFromCustomerService(){
        return this.customerService.hello();
    }
}
