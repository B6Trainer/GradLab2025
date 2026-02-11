package com.bala.practice.corejava.live;

public class Demo1 {

        public static void main(String[] args) {
            System.out.println("Starting the Calculator Demo...");

            Calculator.staticAddition(1, 2,3);

            //Creating an object of Calculator class
            Calculator calc1 = new Calculator("Calc1 Object");
            Calculator calc2 = new Calculator("Calc2 Object");

            calc1.add(10, 5);
            calc2.add(20, 4);


            System.out.println("1. Are the objects equal: "+(calc1==calc2));
            System.out.println("2. Are the objects equal: "+(calc1.equals(calc2)));

//            int num1=10;
//            int num2=10;
//
//            System.out.println("Are the numbers equal: "+(num1 == num2));

        }


}
