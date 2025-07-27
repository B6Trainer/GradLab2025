package com.bala.practice.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class ListExample {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();

        // Add values to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");
        list.add("Cherry");

        printTheCollection(list );
        // Remove a value from the list
        list.remove("Banana");

        printTheCollection(list );
    }

    private static void printTheCollection(List<String> list ) {

        System.out.println("------------Start of list -------------------");
        // Iterate through the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println("------------End of list -------------------");
        System.out.println();

    }

}
