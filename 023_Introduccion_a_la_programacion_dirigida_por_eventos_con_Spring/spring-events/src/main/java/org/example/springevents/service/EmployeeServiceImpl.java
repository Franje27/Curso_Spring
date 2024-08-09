package org.example.springevents.service;

import org.example.springevents.event.EmployeeEventPublisher;
import org.example.springevents.model.Employee;
import org.example.springevents.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private EmployeeEventPublisher publisher;

    @Override
    public Employee create(Employee employee) {
        repository.save(employee);
        publisher.publishCreateEvent(employee);
        return employee;
    }

    @Override
    public void deleteById(Long id) {
        if (!repository.existsById(id)){
            publisher.publishDeleteEvent(null);
            return;
        }
            

        repository.findById(id).ifPresent(employee -> {
            repository.deleteById(id);
            publisher.publishDeleteEvent(employee);
        });
    }
}
