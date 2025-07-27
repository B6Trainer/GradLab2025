package com.bala.practice.corejava.basics.looping;

public class NestedLoopExample {
    public static void main(String[] args) {
        // Initialize two arrays with fixed values
        int[] array1 = {10, 25, 30, 45, 60};
        int[] array2 = {15, 20, 35, 50, 55};

        // Print the arrays
        System.out.println("Array 1:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray 2:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Compare each element of array1 with each element of array2
        System.out.println("Comparisons:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                int num1 = array1[i];
                int num2 = array2[j];

                // Compare the numbers and print the result
                if (num1 > num2) {
                    System.out.println(num1 + " (from Array 1) is greater than " + num2 + " (from Array 2).");
                } else if (num1 < num2) {
                    System.out.println(num1 + " (from Array 1) is less than " + num2 + " (from Array 2).");
                } else {
                    System.out.println(num1 + " (from Array 1) is equal to " + num2 + " (from Array 2).");
                }
            }
        }
    }
}

