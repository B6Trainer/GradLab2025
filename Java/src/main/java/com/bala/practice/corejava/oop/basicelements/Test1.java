package com.bala.practice.corejava.oop.basicelements;

public class Test1 {

    public static void main(String[] args) {
        printDBUrl();

        printDBUrlAgain();
    }

    private static void printDBUrl() {
        System.out.println("Test1 printDBUrl DB url: "+IAppConstants.dbURL);
    }


    private static void printDBUrlAgain() {
        System.out.println("Test1 printDBUrlAgain DB url: "+IAppConstants.dbURL);
    }
}
