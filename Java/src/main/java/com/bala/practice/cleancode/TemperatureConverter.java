package com.bala.practice.cleancode;

import java.util.Scanner;

public class TemperatureConverter {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);

        scanner.close();
    }
}

