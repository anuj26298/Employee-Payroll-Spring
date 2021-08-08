package com.example.employeepayroll.model;

import com.example.employeepayroll.dto.EmployeeDto;

public class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData(){
    }

    public EmployeePayrollData(int employeeId, EmployeeDto employeeDto) {
        this.employeeId = employeeId;
        this.name = employeeDto.getName();
        this.salary = employeeDto.getSalary();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
