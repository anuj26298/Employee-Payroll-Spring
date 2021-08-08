package com.example.employeepayroll.controller;

import com.example.employeepayroll.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @GetMapping(value = {"","/","home"})
    public String getEmployeePayroll(){
        return "Get Employee";
    }

    @GetMapping("/getEmployee/{id}")
    public String getEmployeePayrollById(@PathVariable int id){
        return "Employee Id: " + id;
    }

    @PostMapping("/createEmployee")
    public String addEmployeePayroll(@RequestBody EmployeeDto employeeDto){
        return "Employee Created Successfully " + employeeDto;
    }

    @PutMapping("/updateEmployee")
    public String updateEmployeePayroll(@RequestBody EmployeeDto employeeDto){
        return "Employee Payroll Updated Successfully " + employeeDto;
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeePayroll(@PathVariable int id){
        return "Employee Payroll deleted (id: " + id + ")";
    }


}
