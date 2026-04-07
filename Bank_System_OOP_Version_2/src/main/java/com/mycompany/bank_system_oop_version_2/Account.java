/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_system_oop_version_2;

/**
 *
 * @author admin
 */
public abstract class Account{
    private String IBAN;
    private String holder_name;
    private double account_balance;
    private String[] transaction_history = new String[10];
    
    
    //CONCRETE methods
    void deposit(double deposit_amount){
        System.out.println("Making a deposit.");
        this.account_balance += deposit_amount;
    }
    
    void withdraw(double withdraw_amount){
        System.out.println("Making a withdraw.");
        this.account_balance -= withdraw_amount;
    }
    
    abstract String getAccountType();
    
    
    //getters
    String getIBAN(){
        return this.IBAN;
    }
    
    String getHolderName(){
        return this.holder_name;
    }
    
    double getAccountBalance(){
        return this.account_balance;
    }
    
    String[] getTransactionHistory(){
        return this.transaction_history;
    }
    
    int getTransactionHistoryLength(){
        return this.transaction_history.length;
    }
    
    //setters
    void setIBAN(String IBAN){
        this.IBAN = IBAN;
    }
    
    void setHoldername(String holder_name){
        this.holder_name = holder_name;
    }
    
    void setAccountBalance(double balance){
        this.account_balance = balance;
    }
    
    void setTransaction(String transaction_type,double amount, int transaction_id){
        this.transaction_history[transaction_id] = transaction_type + " " + " || Amount:$" + amount;
    }
}
