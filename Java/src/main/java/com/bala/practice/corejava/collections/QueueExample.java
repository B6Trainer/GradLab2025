package com.bala.practice.corejava.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //FIFO
        // Enqueue elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        printTheCollection(queue);

        // Dequeue elements
        System.out.println("Removed: " + queue.poll()); // Apple
        System.out.println("Removed: " + queue.poll()); // Banana

        printTheCollection(queue);
    }

    private static void printTheCollection(Queue<String> sampleQueue) {

        System.out.println("------------Start of Queue -------------------");
        // Iterate through the queue
        for (String fruit : sampleQueue) {
            System.out.println(fruit);
        }
        System.out.println("------------End of Queue -------------------");
        System.out.println();

    }

}


