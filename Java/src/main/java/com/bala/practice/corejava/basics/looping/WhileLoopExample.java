package com.bala.practice.corejava.basics.looping;

public class WhileLoopExample {

    public static void main(String[] args) {
        int count = 10;  // Initialize the counter to a value that makes the condition false

       WhileLoopExample(count);
       DoWhileLoopExample(count);
    }

    public static void WhileLoopExample (int count) {

        // Use a while loop to iterate until count is less than 5
        while (count < 5) {
            System.out.println("Count is: " + count);
            count++;  // Increment the counter
        }

        System.out.println("While loop terminated.");
    }


    public static void DoWhileLoopExample (int count) {

        // Use a do-while loop to iterate until count is less than 5
        do {
            System.out.println("Dowhile Count is: " + count);
            count++;  // Increment the counter
        } while (count < 5);

        System.out.println("Do-while loop terminated.");
    }


}



