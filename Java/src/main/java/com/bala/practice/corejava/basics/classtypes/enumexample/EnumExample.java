package com.bala.practice.corejava.basics.classtypes.enumexample;

public class EnumExample {
    public static void main(String[] args) {
        // Using an enum constant
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Using a switch statement with enums
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("End of the work week!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a regular day.");
                break;
        }

        // Iterating over all enum constants
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Comparing enum values
        Day anotherDay = Day.WEDNESDAY;
        if (today == anotherDay) {
            System.out.println("Today is Wednesday.");
        } else {
            System.out.println("Today is not Wednesday.");
        }
    }
}
