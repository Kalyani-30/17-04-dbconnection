package com.neoteric.variable.bookmyshow;

public class Seat {
    private String seatNumber;
    private boolean isBooked;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookSeat() {
        this.isBooked = true;
        System.out.println("Seat " + seatNumber + " booked successfully.");
    }
}
