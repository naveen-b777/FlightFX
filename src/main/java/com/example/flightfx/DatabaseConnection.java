package com.example.flightfx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        String databaseName = "Flight_Data"; // Database Name
        String databaseUser = "root"; // Database User
        String databasePassword = "0611"; // Database Password
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false"; // Database URL
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println(connection);
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        return connection;
    }
}