package com.bala.practice.corejava.basics.primitives;

public class ArrayExample {


    /*
        Array = fixed-size collection of same data type
        Index starts from 0
        Length is fixed
        Useful for storing multiple values efficiently
    */


    public static void main(String[] args) {

        primitiveArray();
        wrapperArray();
        objectArray();

    }


    public static void primitiveArray() {

        int[] marks = {85, 90, 78, 92};

        System.out.println("Mark 1 = " + marks[0]);
        System.out.println("Mark 2 = " + marks[1]);

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        System.out.println("Total = " + total);
    }

    public static void wrapperArray() {

        Integer[] nums = {10, 20, 30};
        Double[] values = {10.5, 20.8};
        Boolean[] status = {true, false};
        Character[] letters = {'X', 'Y', 'Z'};

        System.out.println("Wrapper Array = " + nums.length);
        for (Integer num : nums) {
            System.out.println(num);
        }


        String[] names = {"John", "Sara", "Mike"};

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }



    }

    public static void objectArray() {

        Student[] students = new Student[3];

        students[0] = new Student("Alice", 85);
        students[1] = new Student("Bob", 90);
        students[2] = new Student("Charlie", 88);

        for (Student s : students) {
            s.display();
        }
    }

}
