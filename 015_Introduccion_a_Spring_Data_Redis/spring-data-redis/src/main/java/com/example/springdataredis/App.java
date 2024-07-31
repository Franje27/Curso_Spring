package com.example.springdataredis;

import com.example.springdataredis.domain.Employee;
import com.example.springdataredis.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.Repository;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        var repo = context.getBean(EmployeeRepository.class);
        List<Employee> employees = List.of(
                new Employee(null, "emp1", 20, LocalDate.of(1999, 1,1)),
                new Employee(null, "emp2", 30, LocalDate.of(1980, 1,1)),
                new Employee(null, "emp3", 40, LocalDate.of(1973, 1,1)),
                new Employee(null, "emp4", 30, LocalDate.of(1960, 1,1)),
                new Employee(null, "emp5", 50, LocalDate.of(1960, 1,1)),
                new Employee(null, "emp6", 30, LocalDate.of(1960, 1,1)),
                new Employee(null, "emp7", 30, LocalDate.of(1960, 1,1))
        );
        repo.saveAll(employees);

     //   repo.findAll().forEach(System.out::println);

    //    repo.findAll().forEach(employee -> {
    //        repo.findById(employee.getId());
    //    });

    //    repo.findById("aeb085b2-29c2-4029-81d4-aa9490809ab9").ifPresent(System.out::println);
        repo.findTop3ByAge(30).forEach(System.out::println);

    //    var redis = context.getBean(RedisTemplate.class);

    }


}
