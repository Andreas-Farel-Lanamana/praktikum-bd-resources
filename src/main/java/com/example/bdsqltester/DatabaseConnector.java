package com.example.bdsqltester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection connectToMainDB() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/sql_tester_db";
        String user = "postgres";
        String password = "yourpassword";
        return DriverManager.getConnection(url, user, password);
    }

    public static Connection connectToHRDB() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/hr_db";
        String user = "readonly";
        String password = "readonly123";
        return DriverManager.getConnection(url, user, password);
    }
}

