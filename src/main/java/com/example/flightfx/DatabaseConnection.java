package com.example.flightfx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
<<<<<<< HEAD
    public static Connection getConnection() {
        String databaseName = "Flight_Data";
        String databaseUser = "root";
        String databasePassword = "020701764";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false";
=======
    public static Connection getConnection() throws SQLException {
        String databaseName = "Flight_Data"; // Database Name
        String databaseUser = "root"; // Database User
        String databasePassword = "0611"; // Database Password
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false"; // Database URL
>>>>>>> 907f3dc9d22e2a68d6a6f8e9112319352f7a91af
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

//    comment
}