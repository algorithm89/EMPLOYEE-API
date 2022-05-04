package com.example.newproj;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService empService;


    @RequestMapping(value="/employees", method=RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee emp) {
        return empService.createEmployee(emp);
    }

    @RequestMapping(value="/employees", method=RequestMethod.GET)
    public List<Employee> readEmployees() {
        return empService.getEmployees();
    }

    @GetMapping("/employees/{employeeid}")
    private Employee getEmployees(@PathVariable("employeeid") Long employeeid)
    {
        return empService.getEmployeesById(employeeid);
    }


    @RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
    public Employee readEmployees(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
        return empService.updateEmployee(id, empDetails);
    }

    @RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
    public void deleteEmployees(@PathVariable(value = "empId") Long id) {
        empService.deleteEmployee(id);
    }
}