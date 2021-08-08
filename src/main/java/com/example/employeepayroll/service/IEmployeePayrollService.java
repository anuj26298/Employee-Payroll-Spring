package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int id);

    EmployeePayrollData createEmployeePayrollData(EmployeeDto employeeDto);

    EmployeePayrollData updateEmployeePayrollData(int id, EmployeeDto employeeDto);

    void deleteEmployeePayrollData(int id);
}
