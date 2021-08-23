package com.javainuse.service;

import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;

@Service
public class EmployeeService {

    public Employee createEmployee(String name, String empId) {

        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmpId(empId);

//        int a=3/0;
        return emp;
    }

    public void deleteEmployee(String empId) {

    }
}
