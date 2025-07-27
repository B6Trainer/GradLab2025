package com.bala.practice.corejava.oop.abstraction;

public class Demonstrate {

    public static void main(String[] args) {

        System.out.println(); // Print a blank line for separation

        Cashier cashier = getCashier();

        cashier.placeOrder("Burger");
        cashier.pay(50);

        System.out.println(); // Print a blank line for separation

        DeliveryPerson deliveryPerson = getDelieryPerson();
        deliveryPerson.checkStatus("123");
        deliveryPerson.provideCutlery(2);

        System.out.println(); // Print a blank line for separation

        Employee employee = getEmployee();
        employee.giveSalesReport();


    }

    private static Employee getEmployee() {
        Employee employee= new EmployeeImpl();
        return employee;
    }


    private static DeliveryPerson getDelieryPerson() {
        DeliveryPerson deliveryPerson= new EmployeeImpl();
        return deliveryPerson;
    }

    private static Cashier getCashier() {
        Cashier cashierObj= new SpecialCashier();
        return cashierObj;
    }

}
