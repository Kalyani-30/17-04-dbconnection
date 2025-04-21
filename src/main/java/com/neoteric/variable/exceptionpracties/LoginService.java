package com.neoteric.variable.exceptionpracties;


public class LoginService {

    public Account login(CardDetails userEnteredCardDetails) {
        AccountRepository accountRepository = new AccountRepository();
        CardDetails cardDetails = accountRepository.getcardDetails(userEnteredCardDetails.getCardNumber());

        if (cardDetails != null
                && userEnteredCardDetails.getCardNumber().equalsIgnoreCase(cardDetails.getCardNumber())
                && userEnteredCardDetails.getPinNumber().equalsIgnoreCase(cardDetails.getPinNumber())) {
            return cardDetails.getAccount();
        } else {
            throw new LoginFailedException("Invalid credentials...");
        }
    }
}
