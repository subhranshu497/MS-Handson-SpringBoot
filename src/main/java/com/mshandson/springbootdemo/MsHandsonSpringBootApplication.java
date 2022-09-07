package com.mshandson.springbootdemo;

import com.mshandson.springbootdemo.entity.Employee;
import com.mshandson.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MsHandsonSpringBootApplication implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsHandsonSpringBootApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee(1, "Batman", "Gotham city");
        Employee e2 = new Employee(2, "Arrow", "Starings City");
        Employee e3 = new Employee(3, "Dare Devil", "New York City");

        employeeRepository.employee.addAll(Arrays.asList(e1,e2,e3));
    }
}
