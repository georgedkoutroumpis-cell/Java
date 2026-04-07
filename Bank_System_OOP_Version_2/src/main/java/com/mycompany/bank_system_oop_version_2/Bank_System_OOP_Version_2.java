/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank_system_oop_version_2;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.Random;

public class Bank_System_OOP_Version_2 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    
    public static void main(String[] args) {
        //Account[] accounts = new Account[10];
        boolean exit = false;
        
        //array of customers
        Customer[] customers = {new Customer("George Koutroumpis","6946278539","gkoutr","gkoutr2"),
                                new Customer("Giannis Antoniou","6946489937","ganton","ganton2"),
                                new Customer("Maria Iasonidou","6978536456","miason","miason2"),
                                new Customer("Katerina Papaioannou","6978323789","kpap","kpap2")
        };
        
        System.out.println("*****************************************************");
        System.out.println("\t\tWELCOME TO BANKING SYSTEM");
        System.out.println("*****************************************************");
        System.out.println();
        
        //main menu
        while(!exit){
            System.out.println("\t====================");
            System.out.println("\t\tMENU");
            System.out.println("\t====================");
            System.out.println("1. User Login");
            System.out.println("2. Open an Account -- Not complete yet");
            System.out.println("5. Exit Bank System");
            System.out.println("\t====================");
            System.out.print("Please enter a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> userLogin(customers);
                case 5 -> {exit = true;
                           System.out.println("Exiting Program.");
                } 
                default -> System.out.println("Wrong choice on menu. Please pick again(1-5).");
                
            }
        }
        
        scanner.close();
    }
    
    static void userLogin(Customer[] customers){
        boolean exit = false;
        int created_account_counter = 0;
        System.out.print("Please enter username: ");
        String username = scanner.nextLine();
        System.out.print("Please enter password: ");
        String password = scanner.nextLine();
        
        Customer current_customer = null;
        for(Customer customer:customers){
            if(customer.checkCredentials(username, password)){
                current_customer = new Customer(customer.customer_name,customer.phone_number,customer.username,customer.password);
                break;
            }
        }
        
        while(!exit){
            //User menu after login
            System.out.println("=============================");
            System.out.println("\tUSER'S MENU");
            System.out.println("=============================");
            System.out.println("1. Show Balance");
            System.out.println("2. Make Deposit");
            System.out.println("3. Make Withdraw");
            System.out.println("4. Transfer Money -- Not complete yet (Maybe we can implement it by using data files)");
            System.out.println("5. Show Accounts");
            System.out.println("6. Create an Account");
            System.out.println("7. Transaction History");
            System.out.println("8. Logout");
            System.out.println("=============================");
            System.out.print("Please enter a choice on menu: ");
            int choice = scanner.nextInt();
            System.out.println("===========================================");
            scanner.nextLine();
        
            switch(choice){
                case 1 -> showBalance(current_customer);
                case 2 -> makeDeposit(current_customer, current_customer.transactions_count);
                case 3 -> makeWithdraw(current_customer, current_customer.transactions_count);
                case 5 -> showAccounts(current_customer);
                case 6 -> {createAccount(current_customer,created_account_counter);
                           created_account_counter++;
                }
                case 7 -> showTransactionHistory(current_customer);
                case 8 -> { exit=true;
                            System.out.println("Successfull Logout.");
                }
            }
            
        }   
    }
    
    static void showBalance(Customer current_customer){
        System.out.println("************************");
        System.out.println("\tACCOUNTS");
        System.out.println("************************");
        for(int i=0;i<current_customer.accounts.length;i++){
            if(current_customer.accounts[i] == null){
                break;
            }else if(current_customer.accounts[i]!=null){
                System.out.println(current_customer.accounts[i].getAccountType() + " || IBAN: " + current_customer.accounts[i].getIBAN() + " || Balance: " + current_customer.accounts[i].getAccountBalance());
            }
        }
        System.out.println("************************");
                
    }
    
    static void showAccounts(Customer current_customer){
        System.out.println("************************");
        System.out.println("\tACCOUNTS");
        System.out.println("************************");
        for(int i=0;i<current_customer.accounts.length;i++){
            if(current_customer.accounts[i] == null){
                break;
            }else if(current_customer.accounts[i]!=null){
                System.out.println(current_customer.accounts[i].getAccountType() + " || IBAN: " + current_customer.accounts[i].getIBAN());
            }
        }
        System.out.println("************************");
    }
    
    static void makeDeposit(Customer current_customer, int transactions_count){
        showBalance(current_customer);

        System.out.print("Please pick in which account would like to make deposit: ");
        int account_choice = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Please enter amount about to deposit: ");
        double deposit_amount = scanner.nextDouble();
        scanner.nextLine();
        current_customer.accounts[account_choice-1].deposit(deposit_amount);
        
        //adding transaction details to transactions_history array
         current_customer.accounts[account_choice-1].setTransaction("Deposit",deposit_amount,transactions_count);
        //increment current user's transaction counter
        current_customer.transactions_count++;
    }
    
    static void makeWithdraw(Customer current_customer, int transactions_count){
        showAccounts(current_customer);
        
        System.out.print("Please pick in which account would like to make withdraw: ");
        int account_choice = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Please enter amount about to withdraw: ");
        double withdraw_amount = scanner.nextDouble();
        scanner.nextLine();
        current_customer.accounts[account_choice-1].withdraw(withdraw_amount);
        
        //adding transaction details to transactions_history array
        current_customer.accounts[account_choice-1].setTransaction("Withdraw",withdraw_amount,transactions_count);
        //increment current user's transaction counter
        current_customer.transactions_count++;
    }
    
    static void createAccount(Customer current_customer, int created_account_counter){
        System.out.println("************************");
        System.out.println("\tACCOUNTS");
        System.out.println("************************");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Acount");
        System.out.println("************************");
        
        
        System.out.print("Please pick which account would like to create: ");
        int account_choice = scanner.nextInt();
        scanner.nextLine();
        if(account_choice == 1){
            String IBAN = IBANBuilder(15);
            System.out.println(IBAN);
            current_customer.accounts[created_account_counter] = new SavingsAccount(current_customer.customer_name,IBAN);
        }else if(account_choice == 2){
            String IBAN = IBANBuilder(15);
            System.out.println(IBAN);
            current_customer.accounts[created_account_counter] = new CheckingAccount(current_customer.customer_name,IBAN);
        }
    }
    
    static String IBANBuilder(int IBANLength){
        String IBAN = "GR";
        for(int i=0;i<IBANLength;i++){
            IBAN += random.nextInt(0,10);
        }
        return IBAN;
    }
    
    static void showTransactionHistory(Customer current_customer){
        showAccounts(current_customer);
        
        System.out.print("Please pick the account would like to show Transactions History: ");
        int account_choice = scanner.nextInt();
        scanner.nextLine();
        
        if(account_choice == 1){
           int length = current_customer.accounts[account_choice-1].getTransactionHistoryLength();
           String[] transactions = new String[length];
           transactions = current_customer.accounts[account_choice-1].getTransactionHistory();
           System.out.println(current_customer.accounts[account_choice-1].getAccountType() + " || IBAN: " + current_customer.accounts[account_choice-1].getIBAN());
           System.out.println("*************************************************");
           System.out.println("\tACCOUNT'S TRANSACTION HISTORY");
           System.out.println("*************************************************");
           for(String transaction:transactions){           
                   System.out.println(transaction);
           }
        }else if(account_choice == 2){
           int length = current_customer.accounts[account_choice-1].getTransactionHistoryLength();
           String[] transactions = new String[length];
           transactions = current_customer.accounts[account_choice-1].getTransactionHistory();
           System.out.println(current_customer.accounts[account_choice-1].getAccountType() + " || IBAN: " + current_customer.accounts[account_choice-1].getIBAN());
           System.out.println("*************************************************");
           System.out.println("\tACCOUNT'S TRANSACTION HISTORY");
           System.out.println("*************************************************");
           for(String transaction:transactions){           
                   System.out.println(transaction);
           }
        }
    }
}
