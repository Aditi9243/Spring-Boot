package com.springboot.springboot_crud_web_app.service;

import com.springboot.springboot_crud_web_app.model.Employee;
import com.springboot.springboot_crud_web_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }
}
