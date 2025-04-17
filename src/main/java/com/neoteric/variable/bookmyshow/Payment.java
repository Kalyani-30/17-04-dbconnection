package com.neoteric.variable.bookmyshow;

public interface Payment {
    String pay(double amount, String orderId, String merchantId);
    String refund(double amount, String orderId, String merchantId);
    double calculateInterest(double principal, double rate, double timeInYears);
}
