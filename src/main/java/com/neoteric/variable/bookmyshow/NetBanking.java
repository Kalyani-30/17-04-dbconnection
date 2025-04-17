package com.neoteric.variable.bookmyshow;

public class NetBanking implements Payment{
    @Override
    public String pay(double amount, String orderId, String merchantId) {
        return ""+ amount+" "+orderId+""+" "+merchantId;
    }

    @Override
    public String refund(double amount, String orderId, String merchantId) {
        return ""+ amount+" "+orderId+""+" "+merchantId;
    }

    @Override
    public double calculateInterest(double principal, double rate, double timeInYears) {
        return (principal * rate * timeInYears) / 100;
    }
}
