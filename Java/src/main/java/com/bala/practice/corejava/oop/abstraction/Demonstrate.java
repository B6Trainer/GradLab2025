package com.bala.practice.corejava.oop.abstraction;

public class Demonstrate {

    public static void main(String[] args) {

        System.out.println(); // Print a blank line for separation

        Cashier cashier = getCashier();

        cashier.placeOrder("Burger");
        cashier.pay(50);

        System.out.println(); // Print a blank line for separation

        DeliveryPerson deliveryPerson = getDeliveryPerson();
        deliveryPerson.checkStatus("123");
        deliveryPerson.provideCutlery(2);

        System.out.println(); // Print a blank line for separation

        Employee employee = getEmployee();
        employee.giveSalesReport();


        /////////////////////
        EmployeeImpl obj= new EmployeeImpl();

        Cashier obj2 = new Employee2026();
        DeliveryPerson obj3 = new Employee2026();

        /*
        1000 bz fun
         */


    }

    private static Employee getEmployee() {
        Employee employee= new EmployeeImpl();
        return employee;
    }


    private static DeliveryPerson getDeliveryPerson() {
        EmployeeImpl deliveryPerson= new EmployeeImpl();
        //DeliveryPerson deliveryPerson= new EmployeeImpl();
        return deliveryPerson;
    }

    private static Cashier getCashier() {
        Employee2026 cashierObj= new Employee2026();
        //EmployeeImpl cashierObj= new EmployeeImpl();
        //Cashier cashierObj= new EmployeeImpl();
        return cashierObj;
    }

}
