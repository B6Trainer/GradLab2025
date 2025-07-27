package com.bala.practice.corejava.basics.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND
        System.out.println("x && y: " + (x && y)); // Output: false

        // Logical OR
        System.out.println("x || y: " + (x || y)); // Output: true

        // Logical NOT
        System.out.println("!x: " + (!x)); // Output: false
        System.out.println("!y: " + (!y)); // Output: true
    }
}
