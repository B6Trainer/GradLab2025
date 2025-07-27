package com.bala.practice.corejava.collections.wrapper;

public class WrapperExample {

    public static void main(String[] args) {
        // Wrapper Classes
        Integer integerWrapper = Integer.valueOf(100); // Boxing

        Integer integerWrapper2 = 180; // AutoBoxing

        Double doubleWrapper = Double.valueOf(5.55); // Boxing
        Character charWrapper = Character.valueOf('A'); // Boxing

        // Unboxing
        int intPrimitive = integerWrapper.intValue();
        double doublePrimitive = doubleWrapper.doubleValue();
        char charPrimitive = charWrapper.charValue();

        System.out.println("Boxed Integer: " + integerWrapper);
        System.out.println("Unboxed int: " + intPrimitive);

        System.out.println("Boxed Double: " + doubleWrapper);
        System.out.println("Unboxed double: " + doublePrimitive);

        System.out.println("Boxed Character: " + charWrapper);
        System.out.println("Unboxed char: " + charPrimitive);

        // Auto-boxing and Auto-unboxing
        Integer autoBoxedInteger = 200; // Auto-boxing
        int autoUnboxedInteger = autoBoxedInteger; // Auto-unboxing

        System.out.println("Auto-boxed Integer: " + autoBoxedInteger);
        System.out.println("Auto-unboxed int: " + autoUnboxedInteger);

        // Typecasting
        double d = 9.78;
        int i = (int) d; // Manual typecasting from double to int

        System.out.println("Original double: " + d);
        System.out.println("Typecasted int: " + i);

        // Widening (Implicit typecasting)
        int intVal = 50;
        double doubleVal = intVal; // Implicit typecasting from int to double

        System.out.println("Original int: " + intVal);
        System.out.println("Implicitly casted double: " + doubleVal);

        // Narrowing (Explicit typecasting)
        doubleVal = 100.99;
        intVal = (int) doubleVal; // Explicit typecasting from double to int

        System.out.println("Original double: " + doubleVal);
        System.out.println("Explicitly casted int: " + intVal);
    }
}

