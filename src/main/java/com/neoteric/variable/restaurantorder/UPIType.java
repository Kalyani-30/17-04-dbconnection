package com.neoteric.variable.restaurantorder;

public class UPIType implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("paid in "+amount+" upi type");
    }
}
