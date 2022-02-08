package com.EmployeeDepartment.management.service;

import com.EmployeeDepartment.management.model.Department;
import com.EmployeeDepartment.management.model.Employee;
import com.EmployeeDepartment.management.repository.DepartmentRepository;
import com.EmployeeDepartment.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public void addDepartment(Department department){
        departmentRepository.save(department);
    }

    public List<Department> getDepartments(){
        return (List<Department>) departmentRepository.findAll();
    }

    public void deleteDepartment(String id){
        employeeRepository.deleteAllByDId(id);
        departmentRepository.deleteById(id);
    }

    public void updateDepartment(Department department){
        departmentRepository.save(department);
    }
}
