package com.june13.entity;

public class Employee {

    private int empId;
    private String empName;

    public Employee() {
    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
    // from main branch -> Employee Entity

    // from f-testing  its for testing should be reflect in main
    // hello reddy sekhar

    //  hello yarraneella reddysekhar
    // testing from MAIN

}
