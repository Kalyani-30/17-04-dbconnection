package com.neoteric.variable.exceptionpracties;

public class CardDetails {
    private String cardNumber;
    private String pinNumber;
    private Account account;

    // Getters and Setters
    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getPinNumber() { return pinNumber; }
    public void setPinNumber(String pinNumber) { this.pinNumber = pinNumber; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }
}
