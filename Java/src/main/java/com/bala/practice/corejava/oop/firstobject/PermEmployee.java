package com.bala.practice.corejava.oop.firstobject;

public class PermEmployee extends EmployeeClass{

    private String employeeId;

    public static String staticCompanyName="ABC";
    public String companyName="XYZ";



    public PermEmployee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }





}
