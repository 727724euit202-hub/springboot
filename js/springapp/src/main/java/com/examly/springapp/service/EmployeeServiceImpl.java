package com.examly.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.model.Employee;
import com.examly.springapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository EmployeeRepo;

    public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
        EmployeeRepo = employeeRepo;
    }

    public Employee createNewEmployee(Employee employee){
        return EmployeeRepo.save(employee);
    }


    public Employee fetchEmployeeById(int id){
        return EmployeeRepo.findById(id).orElse(null);
    }

    public List<Employee> fetchAllEmployees(){
        return EmployeeRepo.findAll();
    }

    public Employee updateEmployeeDetails(int id,Employee newEmployee){
        Employee e = EmployeeRepo.findById(id).orElse(null);
        e.setEmpCode(newEmployee.getEmpCode());
        e.setEmail(newEmployee.getEmail());
        e.setDepartment(newEmployee.getDepartment());
        e.setName(newEmployee.getName());
        return EmployeeRepo.save(e);
    }

    

    
    



    
}
