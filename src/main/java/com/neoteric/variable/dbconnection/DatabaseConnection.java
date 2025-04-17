package com.neoteric.variable.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydbemployee";  // Correct database name
            String user = "root";  // MySQL username
            String password = "root";  // MySQL password
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
