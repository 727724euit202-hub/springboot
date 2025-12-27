package com.examly.springapp.controller;



import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Employee;
import com.examly.springapp.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }
    
    @PostMapping
    public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee employee){
        Employee e = employeeService.createNewEmployee(employee);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeebyId(@PathVariable int id){
        Employee e = employeeService.fetchEmployeeById(id);
        return ResponseEntity.ok(e);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeDetails(@PathVariable int id,@RequestBody Employee newEmployee){
        Employee e = employeeService.updateEmployeeDetails(id,newEmployee);
        return ResponseEntity.ok(e);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> e = employeeService.fetchAllEmployees();
        return ResponseEntity.ok(e);
    }

    


}
