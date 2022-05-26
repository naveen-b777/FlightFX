package com.example.flightfx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection getConnection() {
        String databaseName = "Flight_Data";
        String databaseUser = "root";
        String databasePassword = "0611";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println(connection);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}