package com.bala.practice.corejava.basics.branching;


public class TernaryBranchingExample {
    public static void main(String[] args) {
        int number = 9;  // You can change this value to test different numbers

        // Using the ternary operator to call different methods based on the condition
        String result = (number % 2 == 0) ? getEvenMessage() : getOddMessage();

        // Print the result
        System.out.println(result);
    }

    public static String getEvenMessage() {
        return "The number is even.";
    }

    public static String getOddMessage() {
        return "The number is odd.";
    }
}

