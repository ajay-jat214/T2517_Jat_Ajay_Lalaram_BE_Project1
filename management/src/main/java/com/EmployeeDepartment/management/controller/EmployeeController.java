package com.EmployeeDepartment.management.controller;

import com.EmployeeDepartment.management.model.Employee;
import com.EmployeeDepartment.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.time.format.SignStyle;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.POST,value = "/employee/")
    public void addEmployee(@RequestBody Employee employee){
         employeeService.addEmployee(employee);
    }
    @RequestMapping("/employee/findEmployeeById/{id}")
    public List<Employee> findEmployeeByDid(@PathVariable String id){
        return employeeService.findEmployeeByDid(id);
    }
    @RequestMapping("/employee/getEmployees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/employee/update/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable String id){
        employeeService.updateEmployee(employee,id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/employee/delete/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
    }
}
