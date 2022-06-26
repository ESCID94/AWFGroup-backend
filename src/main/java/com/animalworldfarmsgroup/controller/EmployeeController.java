package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Employee;
import com.animalworldfarmsgroup.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AWF-app/v1/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    //List all objects
    @GetMapping("/")
    public List<Employee> listAllEmployees(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/")
    void addEmployee(@RequestBody Employee employee) {repository.save(employee);}

    //Get an object by id
    @GetMapping("/employeeById")
    public Optional<Employee> getEmployee(@RequestBody Employee employee){ return repository.findById(employee.getId_employee());}

    //List objects by id
    @GetMapping("/employeesById")
    public List<Employee> listEmployeesByIds(@RequestBody List<Employee> employees) {
        List<Long> listIds = employees.stream().map(Employee::getId_employee).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @PostMapping("/deleteById")
    void deleteEmployee(@RequestBody Employee employee) {repository.delete(employee);}
}
