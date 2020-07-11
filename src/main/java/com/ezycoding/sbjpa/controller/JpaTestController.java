package com.ezycoding.sbjpa.controller;

import com.ezycoding.sbjpa.entity.Employee;
import com.ezycoding.sbjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JpaTestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> employees(@PathVariable("id") Integer id) {
        Employee emp = employeeRepository.findById(id).get();
        return ResponseEntity.ok(emp);
    }
}
