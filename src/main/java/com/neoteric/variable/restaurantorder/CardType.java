package com.neoteric.variable.restaurantorder;

public class CardType implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("paid in"+amount+" cardtype");
    }
}
