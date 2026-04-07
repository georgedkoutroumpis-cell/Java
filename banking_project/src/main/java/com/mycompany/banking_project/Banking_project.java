/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banking_project;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Banking_project {
    static double balance = 10000;  //CLASS
    static Scanner scanner = new Scanner(System.in);    //CLASS
    
    public static void main(String[] args) {
        
        
        boolean exit=false;
        String choice;
        
        while(!exit){
            System.out.println("*****************");
            System.out.println(" BANKING PROGRAM ");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4.EXIT");
            System.out.println("*****************");
            
            System.out.print("Please choose in menu(1-4): ");
            choice = scanner.nextLine();
            
            switch(choice){
                case "1" -> showBalance(balance);
                case "2" -> makeDeposit();
                case "3" -> makeWithdraw();
                case "4" -> {exit = true; System.out.println("Exiting Banking Program...."); System.out.println("Thank you.");}
                default -> System.out.println("Wrong choice on menu. Please pick again!");
            }
        }
        
        
        
        scanner.close();
    }
    
    static void showBalance(double balance){
        System.out.printf("Your balance is: %.2f\n",balance);
    }
    
    static void makeDeposit(){
        double dep_amount;
        System.out.print("What amount would you like to deposit? Please enter the amount: ");
        dep_amount = scanner.nextDouble();
        balance = balance + dep_amount;
    }
    
    static void makeWithdraw(){
        double withdraw_amount;
        System.out.print("What amount of money would you like to withdraw? Please enter the amount: ");
        withdraw_amount = scanner.nextDouble();
        balance = balance - withdraw_amount;
    }
}
