/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.simple_user_logger;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Simple_User_Logger {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean exit = false;
        //SIMPLE USER LOGGER -- LOGGING USER'S ACTIONS IN FILE
        int amount;

        //creating an array of Customers
        Customer[] customers = {new Customer("George Koutroumpis", "gkoutr", "gkoutr2"),
            new Customer("Maria Iasonidou", "miason", "miason2"),
            new Customer("Giannis Eleftheriou", "gelef", "gelef2")};
        Customer customer_temp = null;

        while (!exit) {
            System.out.println("===============================");
            System.out.println("\t- MENU -");
            System.out.println("===============================");
            System.out.println("1. User Login");
            System.out.println("2. Deposit");
            System.out.println("3. User Logout");
            System.out.println("4. Show System Logger Data");
            System.out.println("5. Exit");
            System.out.println("===============================");
            System.out.print("Please pick a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    customer_temp = userLogin(customers);
                    //creating a Login log for current user
                    createLog(customer_temp.getCustomerName() + " logged in");
                }
                case 2 -> {
                    if (customer_temp != null) {
                        amount = userDeposit();
                        //creating a deposit log for current user
                        createLog(customer_temp.getCustomerName() + " deposited " + amount + "$");
                        //creating a deposit log to current user's deposits file
                        createDepositLog(customer_temp, amount);
                    } else {
                        System.out.println("Please login first!");
                    }
                }
                case 3 -> {
                    //creating a logout log for current user
                    createLog(customer_temp.getCustomerName() + " logged out");
                    customer_temp = null;
                }
                case 4 -> {
                    showLoggerData();
                }
                case 5 -> {
                    exit = true;
                    System.out.println("Exiting Program...");
                }
                default ->
                    System.out.println("Wrong choice on menu. Please pick again(1-4).");
            }
        }

        scanner.close();
    }

    static int userDeposit() {
        System.out.println("==================================");
        System.out.print("Please enter amount to deposit: ");
        int deposit = scanner.nextInt();
        return deposit;
    }

    static void createLog(String message) {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter("User_Data_Logger.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.println(LocalDateTime.now() + " - " + message);
        } catch (IOException ioe) {
            System.out.println("Error " + ioe);
        } finally {
            if (pw != null) {
                pw.close();
            }

        }
    }

    static Customer userLogin(Customer[] customers) {
        int count = 0;
        System.out.println("=======================================");
        System.out.println("\t- USER LOGIN PAGE -");
        System.out.println("=======================================");
        System.out.print("Please enter username: ");
        String username = scanner.nextLine();
        System.out.println();
        System.out.print("Please enter password: ");
        String password = scanner.nextLine();

        for (Customer customer : customers) {
            if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())) {
                System.out.println(customer.getCustomerName() + " successfull Login!");
                return customer;
            } else {
                count++;
            }
        }
        System.out.println("Wrong username or password!");
        return null;
    }

    static void showLoggerData() {

        try {
            FileReader fr = new FileReader("User_Data_Logger.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("==========================================");
            System.out.println("\t- USER DATA LOGGER -");
            System.out.println("==========================================");
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println("==========================================");
        } catch (IOException ioe) {
            System.out.println("Error " + ioe);
        }

    }

    static void createDepositLog(Customer customer, int amount) {
        String filename = customer.getCustomerName().trim() + " Deposit Data.txt";
        PrintWriter pw = null;

        try {
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.println(LocalDateTime.now() + " - " + "Deposit amount: " + amount + "$");
        } catch (IOException ioe) {
            System.out.println("Error " + ioe);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
