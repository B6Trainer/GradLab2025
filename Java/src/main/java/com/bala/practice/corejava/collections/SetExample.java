package com.bala.practice.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a Set
        Set<String> sampleSet = new HashSet<>();

        // Add values to the sampleSet
        sampleSet.add("Apple");
        sampleSet.add("Banana");
        sampleSet.add("Cherry");
        sampleSet.add("Cherry");

        printTheList(sampleSet);
        // Remove a value from the sampleSet
        sampleSet.remove("Banana");

        printTheList(sampleSet);

    }

    private static void printTheList(Set<String> sampleSet) {

        System.out.println("------------Start of Set -------------------");
        // Iterate through the sampleSet
        for (String fruit : sampleSet) {
            System.out.println(fruit);
        }
        System.out.println("------------End of Set -------------------");
        System.out.println();

    }
}
