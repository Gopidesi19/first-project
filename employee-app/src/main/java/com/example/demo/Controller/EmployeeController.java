package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
        return "Employee Added Successfully";
    }
}
