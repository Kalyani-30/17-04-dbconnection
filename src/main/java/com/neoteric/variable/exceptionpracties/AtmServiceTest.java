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
        try {
            DbAccountRepository repo = new DbAccountRepository();
            CardDetails cardDetails = repo.getCardDetailsByCardNumber("111111");

            if (cardDetails != null) {
                System.out.println("Card Found: " + cardDetails.getCardNumber());
                System.out.println("Account Number: " + cardDetails.getAccount().getAccountNumber());
                System.out.println("Balance: " + cardDetails.getAccount().getBalance());
            } else {
                System.out.println("Card not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
