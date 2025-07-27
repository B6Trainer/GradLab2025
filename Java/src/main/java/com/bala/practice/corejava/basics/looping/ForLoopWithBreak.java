package com.bala.practice.corejava.basics.looping;

public class ForLoopWithBreak {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Use a for loop to iterate over the array
        for (int i = 0; i < numbers.length; i++) {
            // Print the current element
            System.out.println("Element at index " + i + " is: " + numbers[i]);

            // If the current element is 30, break the loop
            if (numbers[i] == 30) {
                System.out.println("Breaking the loop as element 30 is found.");
                break;
            }
        }

        System.out.println("Loop terminated.");
    }
}
