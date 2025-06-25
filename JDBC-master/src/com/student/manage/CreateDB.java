package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {
    public static Connection connection;

    public static Connection createDBConnection() {
        connection = null;

        // Hardcoded values
        String url = "jdbc:mysql://localhost:3306/student_manage";
        String username = "root";
        String password = "1234@vikasM";

        try {
            // Load MySQL JDBC Driver (optional from Java 6+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        return connection;
    }
}
