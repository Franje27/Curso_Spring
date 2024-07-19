package com.example.spring_data_jpa.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="empolyees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="full_name", unique = true)
    private String fullName;

    private LocalDate birthDate;

    public Employee() {
    }

    public Employee(Long id, String fullName, LocalDate birthDate) {
        this.id = id;
        this.fullName = fullName;

        this.birthDate = birthDate;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
