package com.bala.practice.corejava.live;

public class Calculator {


    //Variables
        //Local variable
        //Global/Instance variable
    //Methods
    //Constructor

    //static
        //Methods
        //Variables

    public static int staticAddition(int a, int b,int c) {
        //Local variable/ Method variable
        int result = a + b+c;
        return result;
    }

    //Global variable / Instance variable
    private String calculatorName;

//    public Calculator() {
//        System.out.println("Calculator Object Created with name: " + calculatorName);
//    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (obj == null ) {
            return false; // Null or different class
        }

        Calculator other = (Calculator) obj; // Cast to Calculator
        return this.calculatorName.equals(other.calculatorName);
    }

    public Calculator(String objectName) {
        //Local variable
        String calculatorName=objectName;
        //Global variable
        this.calculatorName = objectName;
        System.out.println("Calculator Object Created with name: " + calculatorName);
    }

    //Methods
    public int add(int a, int b) {
        //Local variable/ Method variable
        int result = a + b;
        return result;
    }

    public int add(int a, int b,int c) {
        //Local variable/ Method variable
        int result = a + b+c;
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public void displayInfo() {
        System.out.println("This is a Calculator object named: " + calculatorName);
    }

}

