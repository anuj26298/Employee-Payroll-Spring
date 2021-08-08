package com.example.employeepayroll.dto;

public class EmployeeDto {
    private String firstName;
    private double salary;

    public EmployeeDto(String firstName, double salary) {
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
