package com.jsystems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    private static Connection connection = null;
    public static Connection getConnection(){
        if (DatabaseConnector.connection == null){
            initConnection();

        }
        return DatabaseConnector.connection;
    }

    public static void initConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "usermock";
            String pass = "usermock";
            DatabaseConnector.connection= DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
