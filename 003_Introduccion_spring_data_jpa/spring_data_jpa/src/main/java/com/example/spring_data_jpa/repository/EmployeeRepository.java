package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByFullName(String fullName);
    Optional<Employee> findByFullNameAndBirthDate(String fullName, LocalDate birthdate);
    List<Employee> findAllByBirthDateAfter(LocalDate birthdate);
    List<Employee> findAllByBirthDateBetween(LocalDate min, LocalDate max);
    List<Employee> findAllByMarriedTrue();
    List<Employee> findAllByMarriedFalse();


}
