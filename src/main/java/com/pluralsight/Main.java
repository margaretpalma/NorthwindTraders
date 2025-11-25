package com.pluralsight;
import java.sql.*;


public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "root";
        String password = "yearup";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("You're in!");









        } catch (SQLException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

}