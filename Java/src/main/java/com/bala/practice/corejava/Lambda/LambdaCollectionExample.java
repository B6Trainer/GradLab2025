package com.bala.practice.corejava.Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaCollectionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda expression to print each name
        names.forEach(name -> System.out.println(name));

        System.out.println("----------------------------------------");
        // Using lambda expression with stream to filter and print names starting with 'A'
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));
    }
}
