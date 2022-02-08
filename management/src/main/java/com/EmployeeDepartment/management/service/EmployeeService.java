package com.EmployeeDepartment.management.service;

import com.EmployeeDepartment.management.model.Department;
import com.EmployeeDepartment.management.model.Employee;
import com.EmployeeDepartment.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        employee.setDepartment(new Department(employee.getDid(),""));
        employeeRepository.save(employee);
    }

    public List<Employee> getEmployees(){
        List<Employee> employeeList=new ArrayList<Employee>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }

    public void updateEmployee(Employee employee,String id){
        employee.setDepartment(new Department(employee.getDid(),""));
        employeeRepository.save(employee);
    }

    public void deleteEmployee(String id){
        employeeRepository.deleteById(id);
    }
    public List<Employee> findEmployeeByDid(String id){
        return employeeRepository.findByDid(id);
    }
}
