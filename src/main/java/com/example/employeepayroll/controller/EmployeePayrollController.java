package com.example.employeepayroll.controller;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.dto.ResponseDTO;
import com.example.employeepayroll.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @GetMapping(value = {"","/","home"})
    public ResponseEntity<ResponseDTO> getEmployeePayroll(){
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(1,
                new EmployeeDto("Anuj",400000));
        ResponseDTO responseDTO = new ResponseDTO("GET: ", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollById(@PathVariable int id){
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(id,
                new EmployeeDto("Anuj", 5000000));
        ResponseDTO responseDTO = new ResponseDTO("GET BY ID:",employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<ResponseDTO> addEmployeePayroll(@RequestBody EmployeeDto employeeDto){
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(1,employeeDto);
        ResponseDTO responseDTO = new ResponseDTO("Employee Payroll Create Successfully",employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<ResponseDTO> updateEmployeePayroll(@RequestBody EmployeeDto employeeDto){
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeeDto);
        ResponseDTO responseDTO = new ResponseDTO("Employee Payroll Data Updated Successfully", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayroll(@PathVariable int id){
        ResponseDTO responseDTO = new ResponseDTO("Employee Payroll Data Deleted Successfully: ", +id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

}
