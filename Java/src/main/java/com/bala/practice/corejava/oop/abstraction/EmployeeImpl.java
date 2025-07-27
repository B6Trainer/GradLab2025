package com.bala.practice.corejava.oop.abstraction;

public class EmployeeImpl implements Cashier, DeliveryPerson,Employee {


    // Implementing pay method from Cashier
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of amount: " + amount);
    }

    // Implementing placeOrder method from Cashier
    @Override
    public void placeOrder(String orderDetails) {
        System.out.println("Placing order with details: " + orderDetails);
    }

    // Implementing checkStatus method from DeliveryPerson
    @Override
    public void checkStatus(String orderId) {
        System.out.println("Checking status for order ID: " + orderId);
    }

    // Implementing provideCutlery method from DeliveryPerson
    @Override
    public void provideCutlery(int numberOfPeople) {
        System.out.println("Providing cutlery for " + numberOfPeople + " people.");
    }

    // Implementing giveSalesReport method from Employee
    @Override
    public void giveSalesReport() {
        System.out.println("Generating sales report.");
    }


}
