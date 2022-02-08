package com.EmployeeDepartment.management.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @Column(name="did")
    private String did;
    private String dname;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "department")
    private List<Employee> employeeList;
    public Department() {
        super();
    }

    public Department(String did, String dname) {
        super();
        this.did = did;
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did='" + did + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
