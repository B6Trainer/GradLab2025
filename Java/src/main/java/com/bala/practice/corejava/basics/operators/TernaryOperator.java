package com.bala.practice.corejava.basics.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max); // Output: 10
    }
}

