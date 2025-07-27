package com.bala.practice.corejava.oop.encapsulation;

public class EncapsulatedEmployee {

    // Private fields
    private String name;
    private int age;
    private String gender;

    // Constructor
    public EncapsulatedEmployee(String name, int age, String gender) {
        this.name = name;
        this.setAge(age);
        this.setGender(gender);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 21) {  // Basic validation to ensure legal age for employment
            this.age = age;
        } else {
            System.out.println("Employee age must be above 21.");
            throw new RuntimeException("Employee age must be above 21.");
        }
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Setter for gender
    public void setGender(String gender) {
        if (gender != null && !gender.trim().isEmpty()) {
            this.gender = gender;
        } else {
            System.out.println("Gender must not be null or empty.");
            throw new RuntimeException("Gender must not be null or empty.");
        }
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
