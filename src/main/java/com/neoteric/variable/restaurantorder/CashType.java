package com.neoteric.variable.restaurantorder;

public class CashType implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount + "CashType");
    }
}
