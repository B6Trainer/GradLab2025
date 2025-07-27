package com.bala.practice.corejava.basics.looping;

public class ForLoopWithContinue {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Use a for loop to iterate over the array
        for (int i = 0; i < numbers.length; i++) {
            // If the current element is 30, skip the rest of the loop body and continue with the next iteration
            if (numbers[i] == 30) {
                System.out.println("Skipping element 30.");
                continue;
            }

            // Print the current element
            System.out.println("Element at index " + i + " is: " + numbers[i]);
        }

        System.out.println("Loop completed.");
    }
}
