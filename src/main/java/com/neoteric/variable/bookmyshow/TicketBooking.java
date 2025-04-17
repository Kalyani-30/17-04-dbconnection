package com.neoteric.variable.bookmyshow;

public class TicketBooking {
    private String movieName;
    private double price;
    private Seat seat;
    private String merchantId;
    private String orderId;
    private Payment paymentType;

    public TicketBooking(String movieName, double price, Seat seat, String merchantId, String orderId, Payment paymentType) {
        this.movieName = movieName;
        this.price = price;
        this.seat = seat;
        this.merchantId = merchantId;
        this.orderId = orderId;
        this.paymentType = paymentType;
    }

    public void processBooking() {
        System.out.println("\nBooking ticket for " + movieName);

        if (!seat.isBooked()) {
            seat.bookSeat();
            String paymentResponse = paymentType.pay(price, orderId, merchantId);
            System.out.println(paymentResponse);
            System.out.println("Booking Confirmed — Seat: " + seat.getSeatNumber() + "\n");
        } else {
            System.out.println("Sorry, Seat " + seat.getSeatNumber() + " is already booked.");
        }
    }
}
