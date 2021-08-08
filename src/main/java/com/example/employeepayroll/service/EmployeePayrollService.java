package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData(){
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int id){
       return employeePayrollDataList.get(id -1);
    }
    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeeDto employeeDto){
        EmployeePayrollData employeePayrollData =  new EmployeePayrollData(employeePayrollDataList.size() + 1, employeeDto);
        this.employeePayrollDataList.add(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int id, EmployeeDto employeeDto){
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(id);
        employeePayrollData.setName(employeeDto.getName());
        employeePayrollData.setSalary(employeeDto.getSalary());
        this.employeePayrollDataList.set(id-1,employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayrollData(int id){
        employeePayrollDataList.remove(id-1);
    }
}
