package com.bala.practice.corejava.oop.basicelements;

public class EnumExample {

    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        // Assign a day
        Day today = Day.MONDAY;

        // Print the day
        System.out.println("Today is: " + today);

        // Use switch case with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case FRIDAY:
                System.out.println("End of the work week.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}
