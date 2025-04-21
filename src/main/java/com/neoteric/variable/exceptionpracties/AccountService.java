package com.neoteric.variable.exceptionpracties;

public class AccountService {

    public Amount withdraw(Account account, double withdrawalAmount) throws InfficientBalanceException {
        AccountRepository accountRepository = new AccountRepository();
        Account dbAccount = accountRepository.getAccountbyNumber(account.getAccountNumber());

        if (dbAccount.getBalance() >= withdrawalAmount) {
            dbAccount.setBalance(dbAccount.getBalance() - withdrawalAmount);
            return new Amount(withdrawalAmount, dbAccount.getBalance());
        } else {
            throw new InfficientBalanceException("Insufficient balance in account: " + dbAccount.getAccountNumber());
        }
    }
}
