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
        for (Entry<Integer, String> element : map.entrySet()) {
            System.out.println("Key: " + element.getKey() + ", Value: " + element.getValue());
        }
        System.out.println("------------End of map -------------------");
        System.out.println();

    }

    /*
        Map{
            entry{key:1 , value:"Apple"},
            entry{key:2 , value:"Cherry"},
            entry{key:3 , value:"Banana"}
        }


     */

}

