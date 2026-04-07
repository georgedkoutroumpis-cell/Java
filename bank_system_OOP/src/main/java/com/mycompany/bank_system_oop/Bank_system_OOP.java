/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank_system_oop;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Bank_system_OOP {
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        boolean exit=false;
        boolean logged_in=false;
        String[] credential_username = new String[1];
        String[] credential_password = new String[1];
        int transaction_count=0;
        
        customer[] bank_customers = {new customer("George Koutroumpis","gkoutr2","gkoutr2"),
                                     new customer("Giannis Ioannou","gioannou2","gioannou2",11550.80),
                                     new customer("Maria Iasonidou","miason2","miason2",8590.00),
                                     new customer("Kostas Konstantinou","kkonst2","kkonst2")
        };
        
       
        
        while(!exit){
            System.out.println("==============================");
            System.out.println("\tMENU");
            System.out.println("==============================");
            System.out.println("1. Login");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Transactions History");
            System.out.println("6. Exit");
            
            System.out.println();
            System.out.print("Please make a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> { logged_in = customerLogin(bank_customers,credential_username,credential_password);
                            //for debug after customerLogin() method
                            System.out.println("Username: " + credential_username[0]);
                            System.out.println("Password: " + credential_password[0]);
                }
                case 2 -> {
                           if(!logged_in){
                               System.out.println("You must first Sign In to make a Deposit.");
                           }else{
                               makeDeposit(credential_username,credential_password,bank_customers,transaction_count);
                               transaction_count++;
                           }
                }
                case 3 -> {
                           if(!logged_in){
                               System.out.println("You must first Sign In to make a Deposit.");
                           }else{
                               makeWithdraw(credential_username,credential_password,bank_customers,transaction_count);
                               transaction_count++;
                           }
                }
                case 4 -> {
                           if(!logged_in){
                               System.out.println("You must first Sign In to make a Deposit.");
                           }else{
                               showBalance(credential_username,credential_password,bank_customers);
                           }
                }
                case 5 -> {
                           if(!logged_in){
                               System.out.println("You must first Sign In to make a Deposit.");
                           }else{
                               showTransactions(credential_username,credential_password,bank_customers);
                           }
                }
                
                case 6 -> exit=true;
                default -> System.out.println("Wrong choice on menu. Please pick again(1-5).");
            }
            
        }
        
        scanner.close();
    }
    
    static boolean customerLogin(customer[] bank_customers,String[] credential_username, String[] credential_password ){
        boolean found=false;
        System.out.println("************************************");
        System.out.print("Username:");
        credential_username[0] = scanner.nextLine().trim();
        System.out.println();
        System.out.print("Password:");
        credential_password[0] = scanner.nextLine().trim();
        System.out.println("************************************");
        
        //checking for credentials
        for(customer customer:bank_customers){
            if(credential_username[0].equals(customer.username) && credential_password[0].equals(customer.password)){
                System.out.println("Login Susccessfull!");
                found=true;
                break;
            }
        }
        
        if(!found){
            System.out.println("Invalid username or password.");
        }
        return found;
    }
    
    
    static void makeDeposit(String[] credential_username, String[] credential_password,customer[] bank_customers,int transaction_count){
        int index=0;
        
        System.out.println("******************************");
        System.out.println("\tDEPOSIT");
        System.out.println("******************************");
        System.out.print("Please enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        
        //checking if amount about to deposit is <5.0$
        while(amount<5.0){
            System.out.println("Deposit amount must be greater than 5$.");
            System.out.print("Please enter amount to deposit: ");
            amount = scanner.nextDouble();
            scanner.nextLine();
        }
        
        //credential verification so we can access customers attributes
        for(customer customer:bank_customers){
            if(credential_username[0].equals(customer.username) && credential_password[0].equals(customer.password)){
                break;
            }
            index++;
        }
        
        //calling Class Customer method customerDeposit() with the amount about to deposit so we can increase current customer's balance
        bank_customers[index].customerDeposit(amount);     
        
        //calling Class Customer method => addTransactionDeposit()
        bank_customers[index].addTransactionDeposit(transaction_count, amount);
    }
    
    
    static void showBalance(String[] credential_username, String[] credential_password,customer[] bank_customers){
        //credential verification
        int index = credentialVerification(credential_username[0],credential_password[0],bank_customers);
        //calling Class Customer method => customerBalance()
        bank_customers[index].customerBalance();
    }
    
    static int credentialVerification(String credential_username,String credential_password,customer[] bank_customers){
        int index=0;
        //credential verification so we can access customers attributes
        for(customer customer:bank_customers){
            if(credential_username.equals(customer.username) && credential_password.equals(customer.password)){
                break;
            }
            index++;
        }
        return index;
    }
    
    static void makeWithdraw(String[] credential_username,String[] credential_password, customer[] bank_customers,int transaction_count){
        System.out.println("******************************");
        System.out.println("\tWITHDRAW");
        System.out.println("******************************");
        System.out.print("Please enter amount to Withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        
        //checking if amount about to withdraw is >20.0$
        while(amount<20.0){
            System.out.println("Deposit amount must be 20$ or greater.");
            System.out.print("Please enter amount to deposit: ");
            amount = scanner.nextDouble();
            scanner.nextLine();
        }
        
        int index = credentialVerification(credential_username[0],credential_password[0],bank_customers);
        
        //calling Class Customer method=>customerWithdraw()
        bank_customers[index].customerWithdraw(amount);
        //calling Class Customer method => addTransactionWithdraw()
        bank_customers[index].addTrnasactionWithdraw(transaction_count, amount);
    }
    
    static void showTransactions(String[] credential_username, String[] credential_password,customer[] bank_customers){
        //credentials verification
        int index = credentialVerification(credential_username[0],credential_password[0],bank_customers);
        //calling Class Customer method => customerTransactions()
        bank_customers[index].customerTransactions();
        
        //EXTRA: showing transactions from current to older: transactions[0]=current
        //                                                   ...............
        //                                                   transactions[n]=older
    }
    
}
