package com.bala.practice.corejava.basics.branching;

public class MultiLevelIfElseExample {
    public static void main(String[] args) {
        int number = 75;  // You can change this value to test different scenarios
        classifyNumberWithIfElse(number);
    }

    public static void classifyNumberWithIfElse(int number) {
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number >= 0 && number <= 50) {
            System.out.println("The number is between 0 and 50.");
        } else if (number > 50 && number <= 100) {
            System.out.println("The number is between 51 and 100.");
        } else if (number > 100 && number <= 500) {
            System.out.println("The number is between 101 and 500.");
        } else {
            System.out.println("The number is greater than 500.");
        }

        if(number>100){
            
        }

        if(number>100){

        }else{

        }


    }

}
