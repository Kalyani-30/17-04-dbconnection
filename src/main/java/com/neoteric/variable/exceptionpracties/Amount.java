package com.neoteric.variable.exceptionpracties;



public class Amount {
    private double withdrawnAmount;
    private double remainingBalance;

    public Amount(double withdrawnAmount, double remainingBalance) {
        this.withdrawnAmount = withdrawnAmount;
        this.remainingBalance = remainingBalance;
    }

    public double getWithdrawnAmount() {
        return withdrawnAmount;
    }

    public double getRemainingBalance() {
        return remainingBalance;
    }
}
