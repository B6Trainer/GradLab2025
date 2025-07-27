package com.bala.practice.corejava.basics.primitives;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // byte
        //        Size: 8-bit signed integer
        //        Range: -128 to 127
        byte byteVar = 100;
        System.out.println("byteVar: " + byteVar);

        // short
        //        Size: 16-bit signed integer
        //        Range: -32,768 to 32,767
        short shortVar = 10000;
        System.out.println("shortVar: " + shortVar);

        // int
        //        Size: 32-bit signed integer
        //        Range: -2^31 to 2^31-1
        int intVar = 100000;
        int intVar2 = intVar;

        Object obj1 = new Object();
        Object obj2 = obj1;


        System.out.println("intVar: " + intVar);

        // long
        //        Size: 64-bit signed integer
        //        Range: -2^63 to 2^63-1
        long longVar = 10000000000L;
        System.out.println("longVar: " + longVar);

        // float
        //        Size: 32-bit floating-point
        //        Range: Approximately ±3.40282347E+38F
        float floatVar = 3.14f;
        System.out.println("floatVar: " + floatVar);

        // double
        //        Size: 64-bit floating-point
        //        Range: Approximately ±1.79769313486231570E+308
        double doubleVar = 3.141592653589793;
        System.out.println("doubleVar: " + doubleVar);

        // char
        //        Size: 16-bit Unicode character
        //        Range: '\u0000' (0) to '\uffff' (65,535)
        char charVar = 'A';
        System.out.println("charVar: " + charVar);

        // boolean
        //        Size: 1-bit (but the size is not precisely defined)
        //        Values: true or false
        boolean booleanVar = true;
        System.out.println("booleanVar: " + booleanVar);
    }
}
