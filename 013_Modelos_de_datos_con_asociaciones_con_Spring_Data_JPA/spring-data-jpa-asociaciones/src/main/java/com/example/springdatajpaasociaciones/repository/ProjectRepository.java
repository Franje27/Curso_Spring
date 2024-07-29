package com.example.springdatajpaasociaciones.repository;

import com.example.springdatajpaasociaciones.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
