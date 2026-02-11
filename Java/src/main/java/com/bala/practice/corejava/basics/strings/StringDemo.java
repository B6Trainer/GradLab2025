package com.bala.practice.corejava.basics.strings;

import java.util.Arrays;

public class StringDemo {

    public static void main(String[] args) {

        System.out.println("========== 1. STRING CREATION ==========");
        stringCreationDemo();

        System.out.println("\n========== 2. == vs equals() ==========");
        equalsVsOperatorDemo();

        System.out.println("\n========== 3. IMMUTABILITY ==========");
        immutabilityDemo();

        System.out.println("\n========== 4. COMMON STRING METHODS ==========");
        stringMethodsDemo();

        System.out.println("\n========== 5. INTERN METHOD ==========");
        internDemo();

        System.out.println("\n========== 6. STRING vs STRINGBUILDER ==========");
        stringBuilderDemo();

        System.out.println("\n========== 7. STRING FORMATTING ==========");
        formattingDemo();

        System.out.println("\n========== 8. MULTILINE STRING (Java 15+) ==========");
        multilineDemo();
    }

    // 1️⃣ String Creation
    static void stringCreationDemo() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1 == s2 : " + (s1 == s2)); // true (same SCP reference)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (heap object)
    }

    // 2️⃣ == vs equals()
    static void equalsVsOperatorDemo() {
        String a = "Hello";
        String b = new String("Hello");

        System.out.println("Using == : " + (a == b));
        System.out.println("Using equals() : " + a.equals(b));
    }

    // 3️⃣ Immutability
    static void immutabilityDemo() {
        String s = "Hello";
        s.concat(" World");  // new object created but not assigned

        System.out.println("After concat (without assignment): " + s);

        s = s.concat(" World");
        System.out.println("After concat (with assignment): " + s);
    }

    // 4️⃣ Common String Methods
    static void stringMethodsDemo() {
        String text = "  Java Programming  ";

        System.out.println("Length: " + text.length());
        System.out.println("Trim: '" + text.trim() + "'");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Substring (2,6): " + text.substring(2, 6));
        System.out.println("Contains 'Java'? " + text.contains("Java"));
        System.out.println("Replace: " + text.replace("Java", "Python"));

        String[] words = text.trim().split(" ");
        System.out.println("Split: " + Arrays.toString(words));
    }

    // 5️⃣ intern()
    static void internDemo() {
        String s1 = new String("PoolDemo");
        String s2 = s1.intern();
        String s3 = "PoolDemo";

        System.out.println("s2 == s3 : " + (s2 == s3)); // true
    }

    // 6️⃣ String vs StringBuilder
    static void stringBuilderDemo() {

        // Inefficient way (String)
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += i;
        }
        System.out.println("Using String: " + s);

        // Efficient way (StringBuilder)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }
        System.out.println("Using StringBuilder: " + sb.toString());
    }

    // 7️⃣ String Formatting
    static void formattingDemo() {
        String name = "John";
        int age = 30;

        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);
    }

    // 8️⃣ Multiline String (Java 15+)
    static void multilineDemo() {
        String multiline = """
                This is a
                multiline
                string example.
                """;

        System.out.println(multiline);
    }
}

