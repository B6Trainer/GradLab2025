package com.bala.practice.corejava.basics.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;

        // Unary plus
        System.out.println("+a: " + (+a)); // Output: 10

        // Unary minus
        System.out.println("-a: " + (-a)); // Output: -10

        // Increment
        System.out.println("a++: " + (a++)); // Output: 10
        System.out.println("After a++: " + a); // Output: 11

        int b = 10;
        System.out.println("++b: " + (++b)); // Output: 11
        System.out.println("After b++: " + b); // Output: 11

        // Decrement
        System.out.println("a--: " + (a--)); // Output: 11
        System.out.println("After a--: " + a); // Output: 10

        // Logical NOT
        boolean bool = false;
        System.out.println("!b: " + (!bool)); // Output: true
    }
}
