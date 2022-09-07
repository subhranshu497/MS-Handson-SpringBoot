package com.mshandson.springbootdemo.repository;

import com.mshandson.springbootdemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
   public  List<Employee> employee = new ArrayList<Employee>();

    public List<Employee> getAllEmployee() {
        return  employee;
    }

    public String addEmployee(Employee emp) {
        employee.add(emp);
        return "Successfully Added";
    }

    public String editEmployee(Employee emp) {
        employee.stream().filter(e->e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
            e.setAddress(emp.getAddress());
            e.setName(emp.getName());
        });
        return "Updated Successfully";
    }

    public String deleteEmployee(int empId) {
        employee.remove(empId-1);

        return "Deleted";
    }
}
