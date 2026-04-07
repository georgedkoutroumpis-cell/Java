/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise_bank_system;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.Arrays;

public class Exercise_bank_system {
    
    static Scanner scanner = new Scanner(System.in);
    static double acc_balance=10000;
    static int count=0;
    
    
    public static void main(String[] args) throws InterruptedException {
        
        String[] transactions = new String[10];
        Arrays.fill(transactions,"-");
        
        
        System.out.println("================================================================");
        System.out.println("\t\t    WELCOME TO GK BANK!");
        System.out.println("================================================================");
        String welcome_screen = """
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                """;
        System.out.println(welcome_screen);
        System.out.println("================================================================");
        pause();
        
        System.out.print("\t\t [ ");
        for(int i=0;i<10;i++){
            System.out.print("-#");
            Thread.sleep(500);
        }
        System.out.print(" ]");
        
        skip_current_screen();
        
        boolean exit=false;
        
        while(!exit){
            System.out.println("================================================================");
            System.out.println("\t\t\t\tMENU");
            System.out.println("================================================================");
            System.out.println("\t1. Account Balance");
            System.out.println("\t2. Deposit/ Withdraw");
            System.out.println("\t3. Transaction History");
            System.out.println("\t4. Exit Bank");
            System.out.println("================================================================");
            System.out.print("Please enter a choice: ");;
            int choice = scanner.nextInt();
            scanner.nextLine(); //cleanig buffer
            
            switch(choice){
                case 1 -> {accountBalance();
                           pause();
                }
                case 2 -> {depositOrWithdraw(transactions);
                           pause();
                }
                case 3 -> {showTransactionHistory(transactions);
                           pause();
                }
                case 4 -> exit=true;
                default -> System.out.print("Wrong choice. Please pick again(1-4): ");
            }
            skip_current_screen();
        } 
    }
    
    static void accountBalance(){
        System.out.println("================================================================");
        System.out.println("\t\t\t  BALANCE");
        System.out.println("================================================================");
        System.out.printf("""
                           
                           
                           Balance: %.2f
                           
                           
                           """,acc_balance);
        
        System.out.println("================================================================");
    }
    
    static void pause(){
        //awaiting user to press Enter before changing screen
        System.out.print("\t\t  Press enter to continue");
        scanner.nextLine();
    }
    
    static void depositOrWithdraw(String[] transactions){
        System.out.println("================================================================");
        System.out.println("""
                                
                                
                                
                                
                            Would you like to make: 
                           \t\t1. Deposit
                           \t\t2. Withdraw
                                
                                
                                
                                
                                """);
        System.out.println("================================================================");
        System.out.print("Please pick 1 or 2: ");
        int choice = scanner.nextInt();
        
        switch(choice){
            case 1 -> {skip_current_screen();
                       scanner.nextLine();
                       makeDeposit(transactions);}
            case 2 -> {skip_current_screen();
                       makeWithdraw(transactions);}
        }
    }
    
    static void skip_current_screen(){
        for(int i=0;i<50;i++){
            System.out.println();
        }
    }
    
    static void makeDeposit(String[] transactions){
        //moving transactions array elements so we can store the new transactions
        if(count>0 && count<10){
            for(int i = count;i>0;i--){
                transactions[i] = transactions[i-1];
            }
        }else if(count>=10){
            for(int i = 9;i>0;i--){  //for future design if we have a bigger array that stores tranasactions the value 9 inside for must CHANGE  to  value-1 (value refers to transactions array length-num of elements)
                transactions[i] = transactions[i-1];
            }
        }
        
        //deposit screen
        System.out.println("================================================================");
        System.out.print("Please enter amount to deposit: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("""
                                
                                
                                
                                
                           You are about to Deposit: %d
                                
                                
                                
                                
                                \n""",amount);
        System.out.println("================================================================");
        
        acc_balance += amount;
        count++;
        
        transactions[0] = "Deposit || Amount: +$" + amount;
        
        
        
    }
    
    static void makeWithdraw(String[] transactions){
        //moving transactions array elements so we can store the new transactions
        if(count>0 && count<10){
            for(int i = count;i>0;i--){
                transactions[i] = transactions[i-1];
            }
        }else if(count>=10){
            for(int i = 9;i>0;i--){  //for future design if we have a bigger array that stores tranasactions the value 9 inside for must CHANGE  to  value-1 (value refers to transactions array length-num of elements)
                transactions[i] = transactions[i-1];
            }
        }
        
        //withdraw screen
        System.out.println("================================================================");
        System.out.println("\t\t\tWithdraw");
        System.out.println("================================================================");
        
        System.out.println("""
                           
                           
                           
                           """);
        System.out.print("Please enter amount to withdraw: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("""     
                           You are about to Withdraw: %d
                                
                                
                                
                                
                                \n""",amount);
        System.out.println("================================================================");
        
        if(acc_balance-amount>=0){
            acc_balance -= amount;
            count++;
        }else{
            System.out.println("Cannot withdraw this amount. Not enough balance in your account.");
        }
        transactions[0] = "Withdraw || Amount: -$" + amount;
        
        
    }
    
    static void showTransactionHistory(String[] transactions){
        System.out.println("================================================================");
        System.out.println("\t\t\tTransaction History");
        System.out.println("================================================================");
        for(String trans:transactions){
            System.out.println(trans);
        }
        System.out.println("================================================================");
    }
}
