package com.pluralsight;
import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

        private static String username = "root";
        private static String password = "yearup";
        private static String database = "northwind";
        private static String url = "jdbc:mysql://localhost:3306/" + database;

    public static void main(String[] args){
        System.out.println("welcome");
        //display results
        try{
            List<Products> products = getProducts();
           for (Products p : products){
               System.out.println("Product ID: " + p.getProductID());
               System.out.println("Name : " + p.getProductName());
               System.out.println("Price: %.2f&n");
               System.out.println("Stock: " + p.getUnitsInStock());
           }
        } catch (ClassNotFoundException e){
            System.out.println("Problem Loading Driver: " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Problem With Database: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program ended");



    }

}

