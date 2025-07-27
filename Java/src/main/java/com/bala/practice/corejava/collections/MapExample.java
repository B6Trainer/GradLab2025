package com.bala.practice.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> map = new HashMap<>();

        // Add values to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(3, "Pinapple");

        printTheList(map);
        // Remove a value from the map
        map.remove(2);

        printTheList(map);

    }

    private static void printTheList(Map<Integer, String> map ) {

        System.out.println("------------Start of map -------------------");
        // Iterate through the sampleSet
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("------------End of map -------------------");
        System.out.println();

    }

}

