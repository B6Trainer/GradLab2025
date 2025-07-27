package com.bala.practice.corejava.oop.encapsulation;

public class Demonstrate {

    public static void main(String[] args) {

        //demonstrateNoEncapsulation();
       // demonstrateEncapsulation();

        DBDetails dbDetails = new DBDetails("123","abc");
        connectDB(dbDetails);


    }

    private static void connectDB(DBDetails dbDetails) {

        dbDetails.getPassword();
        dbDetails.getUserId();


    }

    private static void demonstrateNoEncapsulation() {

        // Create a new Person object
        EmployeeWithNoEncapsulation noEncapsulationPerson = new EmployeeWithNoEncapsulation("Alice", 25, "Female");

        // Access and modify fields directly
        noEncapsulationPerson.name = "Bob";
        noEncapsulationPerson.age = -5;
        noEncapsulationPerson.gender = null;

        // Display updated information
        noEncapsulationPerson.displayInfo();

    }

    private static void demonstrateEncapsulation() {

        // Create a new Person object
        EncapsulatedEmployee noEncapsulationPerson = new EncapsulatedEmployee("Alice", 25, "Female");

        // Access and modify fields only through controlled methods

        noEncapsulationPerson.setName("Bob");
        noEncapsulationPerson.setAge(22);
        noEncapsulationPerson.setGender("Male");

        // Display updated information
        noEncapsulationPerson.displayInfo();

    }

}

