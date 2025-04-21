package com.neoteric.variable.exceptionpracties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbAccountRepository {
    public Account getAccountByNumber(String accountNumber) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String query = "SELECT * FROM accounts WHERE account_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, accountNumber);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Account account = new Account();
            account.setAccountNumber(resultSet.getString("account_number"));
            account.setBalance(resultSet.getDouble("balance"));

            CardDetails cardDetails = new CardDetails();
            cardDetails.setCardNumber(resultSet.getString("card_number"));
            cardDetails.setPinNumber(resultSet.getString("pin_number"));

            account.setCardDetails(cardDetails);
            cardDetails.setAccount(account);

            connection.close();
            return account;
        } else {
            connection.close();
            return null;
        }
    }

    public CardDetails getCardDetailsByCardNumber(String cardNumber) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String query = "SELECT * FROM card_details WHERE card_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, cardNumber);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            CardDetails cardDetails = new CardDetails();
            cardDetails.setCardNumber(resultSet.getString("card_number"));
            cardDetails.setPinNumber(resultSet.getString("pin_number"));

            // also fetch account details
            Account account = new Account();
            account.setAccountNumber(resultSet.getString("account_number"));
            account.setBalance(resultSet.getDouble("balance"));

            account.setCardDetails(cardDetails);
            cardDetails.setAccount(account);

            connection.close();
            return cardDetails;
        } else {
            connection.close();
            return null;
        }
    }
}


