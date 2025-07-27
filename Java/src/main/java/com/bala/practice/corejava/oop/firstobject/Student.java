package com.bala.practice.corejava.oop.firstobject;


//  Runtime - Instantiated - Object creation

public class Student {

    //Instatiation
    static {
        System.out.println("Student is in static");
    }

    //Object creation
    public Student() {
        System.out.println("Student is in constructor");
    }
}
