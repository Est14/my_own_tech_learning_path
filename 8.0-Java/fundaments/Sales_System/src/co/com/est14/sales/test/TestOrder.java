package co.com.est14.sales.test;

import co.com.est14.sales.Order;

public class TestOrder {

    public static void main(String[] args) {
         Order myFirstOrder = new Order();

         myFirstOrder.addProduct("Computer", 1500);
         myFirstOrder.addProduct("Iphone", 2000);
         myFirstOrder.addProduct("PlayStation5", 1300);
         myFirstOrder.addProduct("Laptop", 3000);
         myFirstOrder.addProduct("Drone", 2800);

        System.out.println("Total: " + myFirstOrder.calculateTotal());
         myFirstOrder.showOrder();

    }
}
