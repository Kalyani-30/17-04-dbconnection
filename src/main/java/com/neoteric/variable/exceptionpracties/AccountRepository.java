package com.neoteric.variable.exceptionpracties;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

private static Map<String, Account> accountMap= new HashMap<>();

private static Map<String, CardDetails> cardDetailsMap= new HashMap<>();

static {

    CardDetails cardDetails1 = new CardDetails();
    cardDetails1.setCardNumber("111111");
    cardDetails1.setPinNumber("222");

    Account account1 = new Account();
    account1.setAccountNumber("1234");
    account1.setBalance(5000);
    account1.setCardDetails(cardDetails1);

    // Link account to card
    cardDetails1.setAccount(account1);

    accountMap.put(account1.getAccountNumber(), account1);
    cardDetailsMap.put(cardDetails1.getCardNumber(), cardDetails1);


    CardDetails cardDetails11= new CardDetails();
    cardDetails11.setCardNumber("111111");
    cardDetails11.setPinNumber("222");

    Account account2= new Account();
    account2.setAccountNumber("12345");
    account2.setBalance(4000);
    account2.setCardDetails(cardDetails11);

    cardDetails11.setAccount(account2);

    accountMap.put(account2.getAccountNumber(), account1);
    cardDetailsMap.put(cardDetails11.getCardNumber(),cardDetails11);
}

public  Account getAccountbyNumber(String accountNumber){
    return accountMap.get(accountNumber);
}
public CardDetails getcardDetails(String cardNumber){
    return cardDetailsMap.get(cardNumber);
}
}
