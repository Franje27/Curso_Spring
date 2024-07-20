package com.example.springapirest.service;

import com.example.springapirest.model.Manufacturer;

import java.util.List;
import java.util.Optional;

/*
CRUD:
Create
Retrieve / Read
Update
Delete
 */

public interface ManufacturerService {
    // Retrieve
    List<Manufacturer> findAll();
    List<Manufacturer> findAllByYear(Integer year);
    Optional<Manufacturer> findById(Long id);
    Optional<Manufacturer> findByName(String name);

    // Create / update
    Manufacturer save(Manufacturer manufacturer);

    // Delete
    void deleteById(Long id);
    void deleteAll();

    // Mas logica de negocio
    // 1.Coches fabricados
    // 2.Beneficios obtenidos
    // 3. ....

}
