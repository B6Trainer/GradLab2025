package com.bala.practice.corejava.oop.firstobject;

public class EmployeeClass {

    //Attribute
    private String name;
    private int age;

    //Constructor

    public EmployeeClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData(){
        System.out.println("Name: "+name + " Age: "+age);
    }
}
