package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData(){
        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(new EmployeePayrollData(1,new EmployeeDto("Anuj",4000000)));
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int id){
       return  new EmployeePayrollData(1, new EmployeeDto("Anuj", 50000));
    }
    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeeDto employeeDto){
        return new EmployeePayrollData(1, employeeDto);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int id, EmployeeDto employeeDto){
        return new EmployeePayrollData(id, employeeDto);
    }

    @Override
    public void deleteEmployeePayrollData(int id){

    }
}
