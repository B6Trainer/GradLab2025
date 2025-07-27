package com.bala.practice.corejava.oop.firstobject;

public class Demonstrate{

    public static void main(String[] args) {

        PermEmployee permObj= new PermEmployee("Raj",25,"A123");

        System.out.println(PermEmployee.staticCompanyName);//Static
        System.out.println(permObj.companyName);// non static /Instance variable

        Person obj1 = new Person("bala");
        Person obj2 = new Person("bala");

        System.out.println("Object are equal by == : "+(obj1 == obj2));
        System.out.println("Object are equal by method: "+(obj1.equals(obj2)));


    }

}
