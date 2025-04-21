package com.neoteric.variable.dbconnection;

import java.sql.*;

public class EmployeeService {

    private Connection connection;

    public EmployeeService() {

        this.connection = DatabaseConnection.getConnection();
    }


    public void displayEmployeeDetails() {
        String query = "SELECT name, id, salary FROM employee25";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                double salary = resultSet.getDouble("salary");
                System.out.println("name: " + name + ", id: " + id + ", Salary: " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void testConnection() {
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT VERSION()")) {
            if (resultSet.next()) {
                System.out.println("Connected to MySQL version: " + resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
