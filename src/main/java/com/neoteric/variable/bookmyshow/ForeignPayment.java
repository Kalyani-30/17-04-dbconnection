package com.neoteric.variable.bookmyshow;

public interface ForeignPayment {
     String conversion(double amount, String orderId, String merchantId);
}
