package com.bala.practice.corejava.oop.basicelements;

public class FirstClass extends BaseClass implements SecondInterface {

    //Attributes
    private String name="bala";

    //Constructor
    public FirstClass() {

    }

    //Methods
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void doSomething(String name) {
        System.out.println(name);
    }

    @Override
    public void processSomething() {

    }

    @Override
    public void processYourself() {

    }
}
