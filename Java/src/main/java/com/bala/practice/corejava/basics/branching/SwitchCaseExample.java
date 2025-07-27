package com.bala.practice.corejava.basics.branching;

public class SwitchCaseExample {

    public static void main(String[] args) {
        String country = "India";  // You can change this value to test different countries
        String capital = getCapital(country);
        System.out.println("The capital of " + country + " is " + capital + ".");
    }

    public static String getCapital(String country) {
        String capital;
        switch (country) {
            case "United States":
                capital = "Washington, D.C.";
                break;
            case "Canada":
                capital = "Ottawa";
                break;
            case "United Kingdom":
                capital = "London";
                break;
            case "France":
                capital = "Paris";
                break;
            case "Germany":
                capital = "Berlin";
                break;
            case "Italy":
                capital = "Rome";
                break;
            case "Japan":
                capital = "Tokyo";
                break;
            case "Australia":
                capital = "Canberra";
                break;
            case "India":
                capital = "New Delhi";
                break;
            case "Brazil":
                capital = "Brasilia";
                break;
            default:
                capital = "Unknown";
                break;
        }
        return capital;
    }
}
