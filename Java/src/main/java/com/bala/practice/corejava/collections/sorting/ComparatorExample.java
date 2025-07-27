package com.bala.practice.corejava.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));


        // Sort by name
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("-------------------------------------");

        // Sort by age
        Collections.sort(people, new AgeComparator());
        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

