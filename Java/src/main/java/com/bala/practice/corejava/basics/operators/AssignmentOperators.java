package com.bala.practice.corejava.basics.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Assign
        int c = b;
        System.out.println("c: " + c); // Output: 5

        // Add and assign
        c += a;
        //c = c+a;
        System.out.println("c += a: " + c); // Output: 15

        // Subtract and assign
        c -= b;
        System.out.println("c -= b: " + c); // Output: 10

        // Multiply and assign
        c *= b;
        System.out.println("c *= b: " + c); // Output: 50

        // Divide and assign
        c /= a;
        System.out.println("c /= a: " + c); // Output: 5

        // Modulus and assign
        c %= b;
        System.out.println("c %= b: " + c); // Output: 0
    }
}
