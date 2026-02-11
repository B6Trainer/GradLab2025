package com.bala.practice.corejava.oop.abstraction;

public class Employee2026 implements Cashier, DeliveryPerson,Employee {


    // Implementing pay method from Cashier
    @Override
    public void pay(double amount) {
        System.out.println("Employee2026:Processing payment of amount: " + amount);
    }

    // Implementing placeOrder method from Cashier
    @Override
    public void placeOrder(String orderDetails) {
        System.out.println("Employee2026:Placing order with details: " + orderDetails);
    }

    // Implementing checkStatus method from DeliveryPerson
    @Override
    public void checkStatus(String orderId) {
        System.out.println("Employee2026:Checking status for order ID: " + orderId);
    }

    // Implementing provideCutlery method from DeliveryPerson
    @Override
    public void provideCutlery(int numberOfPeople) {
        System.out.println("Employee2026:Providing cutlery for " + numberOfPeople + " people.");
    }

    // Implementing giveSalesReport method from Employee
    @Override
    public void giveSalesReport() {
        System.out.println("Employee2026: Generating sales report.");
    }


}
