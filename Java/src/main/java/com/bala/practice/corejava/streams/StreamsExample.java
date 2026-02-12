package com.bala.practice.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    /*

        Important Characteristics
        Does NOT store data
        Does NOT modify original collection
        Supports functional programming
        Lazy evaluation
        Can be parallel
        ------------------------------------------------------------------------

        How does Streams work?

        1️⃣ Source:    Collection → .stream()

        2️⃣ Intermediate Operations:  filter, map, sorted, distinct etc.

        3️⃣ Terminal Operation:  forEach, collect, count, reduce etc.

     */


    public static void main(String[] args) {

       //simpleList();
        nestedList();
    }


    public static void simpleList() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda expression to print each name
        names.forEach(name -> System.out.println(name));

        System.out.println("----------------------------------------");
        // Using lambda expression with stream to filter and print names starting with 'A'
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));
    }

    public static void nestedList() {

        System.out.println("-----------------Example with nested list-----------------------");
        List<List<String>> list = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        System.out.println("------------------Wrong Usage----------------------");
        list.stream()
                .map(l -> l.stream())
                .forEach(System.out::println);

        System.out.println("-----------------Correct Usage-----------------------");
        List<String> result = list.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        System.out.println(result);

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        List<String> sentences = Arrays.asList(
                "Java is powerful",
                "Streams are useful"
        );

        List<List<String>> sentencesSplit = Arrays.asList(
                Arrays.asList( "Java","is","powerful"),
                Arrays.asList("Streams","are","useful")
        );

        System.out.println("------------------Wrong Usage----------------------");
        sentences.stream()
                .map(s -> s.split(" "))
                .forEach(System.out::println);



        System.out.println("-----------------Correct Usage-----------------------");
        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());

        System.out.println(words);

        System.out.println("----------------------------------------");



    }

}

/*
Intermediate Operations: (return a Stream)
filter
map
mapToInt
mapToLong
mapToDouble
flatMap
flatMapToInt
flatMapToLong
flatMapToDouble
distinct
sorted
limit
skip
peek
takeWhile (Java 9+)
dropWhile (Java 9+)

-----------------------------------------------------------------

Terminal Operations: (produce final result) (return a value / Optional / Collection / void)

forEach
forEachOrdered
collect
reduce
count
min
max
sum
average
summaryStatistics
anyMatch
allMatch
noneMatch
findFirst
findAny
toArray

-----------------------------------------------------------------

Easy Trick to Remember
If it returns Stream → Intermediate
If it returns value / Optional / Collection / void → Terminal


 */
