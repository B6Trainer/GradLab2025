package com.bala.practice.corejava.collections.sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<PersonComparable> people = new ArrayList<>();
        people.add(new PersonComparable("Alice", 30));
        people.add(new PersonComparable("Bob", 25));
        people.add(new PersonComparable("Charlie", 35));

        Collections.sort(people);

        System.out.println("Sorted by age:");
        for (PersonComparable personComparable : people) {
            System.out.println(personComparable);
        }
    }
}

