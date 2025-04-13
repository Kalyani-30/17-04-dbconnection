package com.neoteric.variable.restaurantorder;

public class Test {
    public static void main(String[] args) {

        Payment cashType= new CashType();
        Order order= new Order("puri",60.0, cashType);
        order.paymentprocesse();

    }
}
