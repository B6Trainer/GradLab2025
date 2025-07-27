package com.bala.practice.corejava.oop.firstobject;

import java.util.Objects;

public class Person {
    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;


}
