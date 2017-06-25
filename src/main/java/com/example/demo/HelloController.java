package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by x002070 on 6/18/2017.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeTryRepository employeeTryRepository;

    Hello hello = new Hello();

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Hello getHello() {
        System.out.println("****** Hello ******");
        hello.setKey("Name");
        hello.setValue("Baskar");
        return hello;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/db")
    public EmployeeTry getDataFromDb() {

        System.out.println("****** DB method ******");

/*
        List<Employee> employee = employeeRepository.findAll();
        employee.forEach(employee1 -> System.out.println("employee1"+employee1.getName()));
*/

        List<EmployeeTry> employee = employeeTryRepository.findAll();
        employee.forEach(employee1 -> System.out.println("Employee Try : "+employee1.getName()));


        return employee.get(0);
    }
}
