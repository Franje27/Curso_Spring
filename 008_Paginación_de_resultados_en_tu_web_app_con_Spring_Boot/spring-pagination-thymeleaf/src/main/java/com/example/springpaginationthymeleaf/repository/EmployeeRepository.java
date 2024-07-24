package com.example.springpaginationthymeleaf.repository;

import com.example.springpaginationthymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
