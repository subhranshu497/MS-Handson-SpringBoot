package com.mshandson.springbootdemo.service;

import com.mshandson.springbootdemo.entity.Employee;
import com.mshandson.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.getAllEmployee();

    }

    public String AddEmployee(Employee emp) {
        return employeeRepository.addEmployee(emp);
    }

    public String editEmployee(Employee emp) {
        return employeeRepository.editEmployee(emp);
    }

    public String deleteEmployee(int empId) {
        return employeeRepository.deleteEmployee(empId);
    }
}
