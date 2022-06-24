package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Employee;
import com.animalworldfarmsgroup.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/AWF-api/v1")
@CrossOrigin(origins = "http://localhost:8080")
public class AWFController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> listAllEmployees(){
        return employeeRepository.findAll();
    }
}
