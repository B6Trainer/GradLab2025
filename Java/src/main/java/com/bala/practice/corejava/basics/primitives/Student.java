package com.bala.practice.corejava.basics.primitives;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " - " + marks);
    }
}

