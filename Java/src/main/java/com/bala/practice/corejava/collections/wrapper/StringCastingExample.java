package com.bala.practice.corejava.collections.wrapper;

public class StringCastingExample {

    public static void main(String[] args) {
        // String to int
        String intString = "123";
        int intValue = Integer.parseInt(intString);
        System.out.println("String to int: " + intValue);

        // int to String
        int num = 456;
        String strFromInt = Integer.toString(num);
        System.out.println("int to String: " + strFromInt);

        // String to double
        String doubleString = "123.45";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("String to double: " + doubleValue);

        // double to String
        double d = 456.78;
        String strFromDouble = Double.toString(d);
        System.out.println("double to String: " + strFromDouble);

        // String to float
        String floatString = "123.45";
        float floatValue = Float.parseFloat(floatString);
        System.out.println("String to float: " + floatValue);

        // float to String
        float f = 456.78f;
        String strFromFloat = Float.toString(f);
        System.out.println("float to String: " + strFromFloat);

        // String to long
        String longString = "123456789";
        long longValue = Long.parseLong(longString);
        System.out.println("String to long: " + longValue);

        // long to String
        long l = 987654321L;
        String strFromLong = Long.toString(l);
        System.out.println("long to String: " + strFromLong);

        // Handling exceptions
        try {
            String invalidIntString = "abc";
            int invalidInt = Integer.parseInt(invalidIntString);
            System.out.println("This line will not be printed due to exception");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input string for int conversion.");
        }

        try {
            String invalidDoubleString = "abc";
            double invalidDouble = Double.parseDouble(invalidDoubleString);
            System.out.println("This line will not be printed due to exception");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input string for double conversion.");
        }
    }
}
