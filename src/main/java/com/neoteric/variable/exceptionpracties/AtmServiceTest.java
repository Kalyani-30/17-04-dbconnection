package com.neoteric.variable.exceptionpracties;

public class AtmServiceTest {
    public static void main(String[] args) {
        // create card details
        CardDetails cardDetails1 = new CardDetails();
        cardDetails1.setCardNumber("111111");
        cardDetails1.setPinNumber("222");

        // create the withdrawal request amount
        Account withdrawRequest = new Account();
        withdrawRequest.setAccountNumber("1234");
        withdrawRequest.setBalance(2000);  // amount to withdraw

        // attach it to card details
        cardDetails1.setAccount(withdrawRequest);

        // call ATM service
        ATMService atmService = new ATMService();
        ApiResponse<Amount> amountApiResponse = atmService.getMemory(cardDetails1);

        if (amountApiResponse.getData() != null) {
            System.out.println("Withdrawn: " + amountApiResponse.getData().getWithdrawnAmount() +
                    " | Remaining Balance: " + amountApiResponse.getData().getRemainingBalance());
        } else {
            System.out.println("Error: " + amountApiResponse.getMessage());
        }
    }
}
