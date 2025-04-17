package com.neoteric.variable.bookmyshow;

public class Test {
    public static void main(String[] args) {
        BookMyShowPaymentGateway gateway = new BookMyShowPaymentGateway();

        Payment cardPayment = gateway.getPaymentProcess("CARD");
//        Payment foreignPayment=gateway.getPaymentProcess(" foreign");

        Seat seat1 = new Seat("A1");
        TicketBooking booking1 = new TicketBooking(" raja saab", 500, seat1, "MERCH001", "ORD001", cardPayment);
        booking1.processBooking();
        System.out.println("Card Interest: ₹" + cardPayment.calculateInterest(10000, 5, 1));

        Payment upiPayment = gateway.getPaymentProcess("UPI");
        Seat seat2 = new Seat("B2");
        TicketBooking booking2 = new TicketBooking("darling", 600, seat2, "MERCH002", "ORD002", upiPayment);
        booking2.processBooking();
        System.out.println("UPI Interest: ₹" + upiPayment.calculateInterest(8000, 4, 2));



//        if (foreignPayment instanceof ForeignPayment) {
//            String convertedAmount = ((ForeignPayment) foreignPayment).conversion(600, "ORD003", "MERCH003");
//            System.out.println(convertedAmount);
//        }
    }
}
