package com.springboot.springboot_crud_web_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springboot_crud_web_app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
