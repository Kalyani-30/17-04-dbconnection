package com.neoteric.variable.exceptionpracties;

public class ATMService {

    public ApiResponse<Amount> getMemory(CardDetails userEnteredCardDetails) {
        ApiResponse<Amount> apiResponse;

        try {
            LoginService loginService = new LoginService();
            Account dbAccount = loginService.login(userEnteredCardDetails);

            double withdrawalAmount = userEnteredCardDetails.getAccount().getBalance(); // assuming balance holds withdrawal amount

            AccountService accountService = new AccountService();
            Amount amount = accountService.withdraw(dbAccount, withdrawalAmount);

            apiResponse = new ApiResponse<>();
            apiResponse.setData(amount);
            apiResponse.setMessage("Transaction successful");
            apiResponse.setCode("200");

        } catch (LoginFailedException e) {
            apiResponse = new ApiResponse<>();
            apiResponse.setMessage("Login Failed: " + e.getMessage());
            apiResponse.setCode("401");
            System.out.println("LoginFailed: " + e);

        } catch (InfficientBalanceException e) {
            apiResponse = new ApiResponse<>();
            apiResponse.setMessage("Transaction Failed: " + e.getMessage());
            apiResponse.setCode("402");
            System.out.println("Insufficient Balance: " + e);

        } catch (Exception e1) {
            apiResponse = new ApiResponse<>();
            apiResponse.setMessage("Something went wrong: " + e1.getMessage());
            apiResponse.setCode("500");
            System.out.println("Error: " + e1);
        }
        return apiResponse;
    }
}
