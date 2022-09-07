package com.mshandson.springbootdemo.controller;

import com.mshandson.springbootdemo.entity.Employee;
import com.mshandson.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get/all")
    public List<Employee>  getAllEmployee(){
        List<Employee> empList = employeeService.getAllEmployee();
        return empList;
    }
    @PostMapping("/add")
    public String  AddEmployee(@RequestBody Employee emp){
        return employeeService.AddEmployee(emp);
    }
    @PutMapping("/edit")
    public String  editEmployee(@RequestBody Employee emp){
        return employeeService.editEmployee(emp);
    }

    @DeleteMapping("/delete")
    public String  deleteEmployee(@RequestParam int empId){
        return employeeService.deleteEmployee(empId);
    }
}
