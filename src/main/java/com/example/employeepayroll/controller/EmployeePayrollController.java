package com.example.employeepayroll.controller;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.dto.ResponseDTO;
import com.example.employeepayroll.model.EmployeePayrollData;
import com.example.employeepayroll.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping(value = {"","/","home"})
    public ResponseEntity<ResponseDTO> getEmployeePayroll(){
        List<EmployeePayrollData> employeePayrollDataList = employeePayrollService.getEmployeePayrollData();
        ResponseDTO responseDTO = new ResponseDTO("GET: ", employeePayrollDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollById(@PathVariable int id){
        EmployeePayrollData employeePayrollData = employeePayrollService.getEmployeePayrollDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("GET BY ID:",employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<ResponseDTO> addEmployeePayroll(@RequestBody EmployeeDto employeeDto){
        EmployeePayrollData employeePayrollData = employeePayrollService.createEmployeePayrollData(employeeDto);
        ResponseDTO responseDTO = new ResponseDTO("Employee Payroll Create Successfully",employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayroll(@RequestBody EmployeeDto employeeDto, @PathVariable int id){
        EmployeePayrollData employeePayrollData = employeePayrollService.updateEmployeePayrollData(id, employeeDto);
        ResponseDTO responseDTO = new ResponseDTO("Employee Payroll Data Updated Successfully", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayroll(@PathVariable int id){
        employeePayrollService.deleteEmployeePayrollData(id);
        ResponseDTO responseDTO = new ResponseDTO("Employee Payroll Data Deleted Successfully: ", +id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

}
