package com.bala.practice.corejava.Lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterfaceExamples {
    public static void main(String[] args) {

        //Predicate Interface
        //Description: Represents a predicate (boolean-valued function) of one argument.
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        boolean result = isEven.test(4); // Output: true

        //Consumer interface
        //Description: Represents an operation that accepts a single input argument and returns no result.
        Consumer<String> printMessage = (message) -> System.out.println("Lambda says: "+message);
        printMessage.accept("Hello, Lambda!");
        printMessage.accept("Nice to meet you!");

        //Function interface
        //Description: Represents a function that accepts one argument and produces a result.
        Function<Integer, Integer> square = (number) -> number * number;
        int areaResult = square.apply(5); // Output: 25

        //Supplier interface
        //Description: Represents a supplier of results.
        Supplier<String> greetingSupplier = () -> "Hello, World!";
        String greeting = greetingSupplier.get(); // Output: Hello, World!



    }
}

