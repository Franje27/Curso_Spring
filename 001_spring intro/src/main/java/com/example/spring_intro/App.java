package com.example.spring_intro;

import com.example.spring_intro.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.spring_intro", "com.example2.spring_intro"})
public class App {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(App.class, args);

        var employeeController = context.getBean(EmployeeController.class);
        System.out.println(employeeController.helloFromEmployeeService());
        System.out.println(employeeController.helloFromCustomerService());
    }
}
