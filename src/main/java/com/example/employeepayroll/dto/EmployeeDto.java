package com.example.employeepayroll.dto;

public class EmployeeDto {
    private String name;
    private long salary;

    public EmployeeDto(String name, long salary) {
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
