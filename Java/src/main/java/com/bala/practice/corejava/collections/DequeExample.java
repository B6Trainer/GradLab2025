package com.bala.practice.corejava.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and rear
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");

        printTheList(deque);

        // Remove elements from the front and rear
        System.out.println("Removed from front: " + deque.pollFirst()); // Cherry
        System.out.println("Removed from rear: " + deque.pollLast()); // Banana

        printTheList(deque);
    }

    private static void printTheList(Deque<String> deque  ) {

        System.out.println("------------Start of deque -------------------");

        // Iterate through the deque
        for (String fruit : deque) {
            System.out.println(fruit); // Apple
        }
        System.out.println("------------End of deque -------------------");
        System.out.println();

    }
}

