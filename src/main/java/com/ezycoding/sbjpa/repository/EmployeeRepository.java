package com.ezycoding.sbjpa.repository;

import com.ezycoding.sbjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
