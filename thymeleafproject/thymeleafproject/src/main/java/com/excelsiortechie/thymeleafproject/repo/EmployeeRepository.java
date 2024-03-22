package com.excelsiortechie.thymeleafproject.repo;

import com.excelsiortechie.thymeleafproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
