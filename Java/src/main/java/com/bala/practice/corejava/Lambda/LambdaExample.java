package com.bala.practice.corejava.Lambda;

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8
        System.out.println("Subtraction: " + subtraction.operate(5, 3)); // Output: 2
    }
}

