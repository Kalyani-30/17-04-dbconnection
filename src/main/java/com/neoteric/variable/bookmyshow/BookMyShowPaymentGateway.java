package com.neoteric.variable.bookmyshow;

public class BookMyShowPaymentGateway {

    public Payment getPaymentProcess(String paymentType) {
        if (paymentType.equalsIgnoreCase("CARD")) {
            return new CardType();
        } else if (paymentType.equalsIgnoreCase("UPI")) {
            return new UPIType();
        } else if (paymentType.equalsIgnoreCase("NETBANKING")) {
            return new NetBanking();
        } else if (paymentType.equalsIgnoreCase("FOREIGN")) {
            return new ForeginService();
        }
        throw new IllegalArgumentException("Invalid Payment Type: " + paymentType);
    }

    public String processPayment(String paymentType, double amount, String orderId, String merchantId) {
        if (amount <= 0) {
            return "Payment failed ";
        }
        Payment payment = getPaymentProcess(paymentType);
        return payment.pay(amount, orderId, merchantId);
    }

    public String processRefund(String paymentType, double amount, String orderId, String merchantId) {
        if (amount <= 0) {
            return "Refund failed ";
        }
        Payment payment = getPaymentProcess(paymentType);
        return payment.refund(amount, orderId, merchantId);
    }
}
