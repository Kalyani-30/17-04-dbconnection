package com.neoteric.variable.restaurantorder;

public class Order {
    String itemName;
   double price;
    Payment paymetType;

    public Order(String itemName, double price, Payment paymetType) {
        this.itemName = itemName;
        this.price = price;
        this.paymetType = paymetType;
    }

    public void paymentprocesse(){

        System.out.println(" order for " +itemName +  "  ");
        paymetType.pay(price);
    }
}
