package com.examly.springapp.service;

import java.util.List;

import com.examly.springapp.model.Employee;

public interface EmployeeService {
    public Employee createNewEmployee(Employee employee);
    public Employee fetchEmployeeById(int id);
    public List<Employee> fetchAllEmployees();
    public Employee updateEmployeeDetails(int id,Employee newEmployee);
}
