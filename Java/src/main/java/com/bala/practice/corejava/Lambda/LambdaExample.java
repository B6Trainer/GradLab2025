package com.bala.practice.corejava.Lambda;

public class LambdaExample {
    public static void main(String[] args) {

        //var result = add(10, 20);

        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        printData(10,30,addition);
        printData(10,30,subtraction);

//        System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8
//        System.out.println("Subtraction: " + subtraction.operate(5, 3)); // Output: 2
    }


    private static void printData(int i, int i1, MathOperation ops) {
        System.out.println("Result: " + ops.operate(i, i1));
    }


}

