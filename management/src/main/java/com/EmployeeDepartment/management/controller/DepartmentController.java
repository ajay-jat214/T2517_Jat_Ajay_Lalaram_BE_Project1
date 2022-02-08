package com.EmployeeDepartment.management.controller;

import com.EmployeeDepartment.management.model.Department;
import com.EmployeeDepartment.management.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping(method = RequestMethod.POST,value="/department/")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }
    @RequestMapping("/department/getDepartments/")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/department/deleteDepartment/{id}")
    public void deleteDepartment(@PathVariable String id){
         departmentService.deleteDepartment(id);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/department/updateDepartment/")
    public void updateDepartment(@RequestBody Department department){
        departmentService.updateDepartment(department);
    }
}
