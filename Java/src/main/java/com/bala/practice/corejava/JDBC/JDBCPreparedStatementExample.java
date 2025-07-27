package com.bala.practice.corejava.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPreparedStatementExample {

    // Database URL, username and password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/javapractice";
    private static final String DB_USER = "javauser";
    private static final String DB_PASSWORD = "javauser123";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to the database...");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Step 3: Execute a query
            String sql = "SELECT id, user_email, otp FROM ss_otp WHERE user_email = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "master"); // Example email parameter
            resultSet = preparedStatement.executeQuery();

            // Step 4: Extract data from result set
            while (resultSet.next()) {
                // Retrieve by column name
                int id = resultSet.getInt("id");
                String userEmail = resultSet.getString("user_email");
                String otp = resultSet.getString("otp");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", User Email: " + userEmail);
                System.out.println(", OTP: " + otp);
            }
        } catch (SQLException | ClassNotFoundException se) {
            // Handle errors for JDBC and Class.forName
            se.printStackTrace();
        } finally {
            // Step 5: Clean-up environment
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        System.out.println("Success!");
    }
}

