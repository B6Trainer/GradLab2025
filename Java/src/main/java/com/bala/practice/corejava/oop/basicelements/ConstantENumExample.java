package com.bala.practice.corejava.oop.basicelements;

public class ConstantENumExample {
    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    public static void main(String[] args) {
        // Assign a day
        int today = MONDAY;

        // Print the day
        System.out.println("Today is: " + getDayName(today));

        // Use switch case with constants
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

    // Helper method to get the name of the day
    public static String getDayName(int day) {
        switch (day) {
            case SUNDAY:
                return "SUNDAY";
            case MONDAY:
                return "MONDAY";
            case TUESDAY:
                return "TUESDAY";
            case WEDNESDAY:
                return "WEDNESDAY";
            case THURSDAY:
                return "THURSDAY";
            case FRIDAY:
                return "FRIDAY";
            case SATURDAY:
                return "SATURDAY";
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }
}
