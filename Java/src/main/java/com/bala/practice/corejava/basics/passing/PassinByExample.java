package com.bala.practice.corejava.basics.passing;

public class PassinByExample {

    public static void main(String[] args) {
        int x = 10;
        modify(x);
        System.out.println("After method call: " + x);
        System.out.println("--------------------------------------------------------");

        Student s = new Student();
        s.marks = 50;

        modify(s);
        System.out.println("After method call: " + s.marks);

    }

    static void modify(int x) {
        x = 20;
        System.out.println("Inside method: " + x);
    }

    static void modify(Student s) {
        s.marks = 90;
        System.out.println("Inside method: " + s.marks);
    }

}
