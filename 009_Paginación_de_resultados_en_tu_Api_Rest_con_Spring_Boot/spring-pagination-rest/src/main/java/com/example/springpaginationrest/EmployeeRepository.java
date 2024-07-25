package com.example.springpaginationrest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Page<Employee> findAllByMarriedTrue(Pageable pageable);

    List<Employee> findAllBySalaryBetween(double min, double max, Sort sort);

    Page<Employee> findByBirthDateBefore(LocalDate birthDate, Pageable pageable);

}
