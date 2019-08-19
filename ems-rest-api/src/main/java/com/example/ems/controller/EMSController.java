package com.example.ems.controller;


import com.example.ems.enitities.Employee;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ems.repositories.EmployeeRepository;
import com.example.ems.repositories.HierarchyRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@Log4j2
@RequestMapping("/v1")
public class EMSController  {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    HierarchyRepository hierarchyRepository;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity(employeeRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
        return new ResponseEntity(employeeRepository.save(employee), HttpStatus.CREATED);
    }

    @GetMapping("/employees/{categoryId}")
    public ResponseEntity<Employee> getOneEmploye(@PathVariable(value = "categoryId") Long employeeID) {
        return new ResponseEntity(employeeRepository.findById(employeeID), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Employee>> getOneByName(@Valid @RequestBody Employee employee) {
        System.out.println("First Name:     :::::::::::"+employee.getFirstName());
        System.out.println("First Name:     :::::::::::"+employee.getLastName());

        return new ResponseEntity(employeeRepository.findByFirstNameContainingIgnoreCase(employee.getFirstName().trim()), HttpStatus.OK);
    }


}
