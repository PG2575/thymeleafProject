package com.excelsiortechie.thymeleafproject.service;

import com.excelsiortechie.thymeleafproject.entity.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}

