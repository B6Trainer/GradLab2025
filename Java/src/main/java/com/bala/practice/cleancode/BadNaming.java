package com.bala.practice.cleancode;

import java.util.Scanner;

public class BadNaming {

    public static double fx(double y) {
        return (y - 32) * 5 / 9;
    }

    public static void main(String[] z) {
        Scanner x = new Scanner(System.in);

        System.out.print("V: ");
        double q = x.nextDouble();

        double p = fx(q);

        System.out.printf("R: %.2f\n", p);

        x.close();
    }
}

