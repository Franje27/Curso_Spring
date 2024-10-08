package com.example.springdatajpaasociaciones.repository;


import com.example.springdatajpaasociaciones.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
