package com.example.springdatajpaasociaciones.repository;


import com.example.springdatajpaasociaciones.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRespository extends JpaRepository<Address, Long> {

}
