package com.bala.practice.corejava.oop.encapsulation;

public class EmployeeWithNoEncapsulation {

    // Private fields
    public String name;
    public int age;
    public String gender;

    // Constructor
    public EmployeeWithNoEncapsulation(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // Method to display open access person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
