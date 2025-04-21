package com.neoteric.variable.exceptionpracties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/exceptionconnection";  // Correct database name
    private static final String USERNAME = "root";  // MySQL username
    private static final String PASSWORD = "root";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
