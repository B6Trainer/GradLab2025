package com.bala.practice.corejava.collections.sorting;

class PersonComparable implements Comparable<PersonComparable> {
    private String name;
    private int age;

    public PersonComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(PersonComparable other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }


}

