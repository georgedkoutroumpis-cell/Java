/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_system_oop;

/**
 *
 * @author admin
 */
public class customer {
    String username;
    String password;
    String name;
    double balance;
    String[] transactions = new String[15];
    
    //constructors
    customer(String name,String username,String password,double balance){
        this.name = name;
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
    
    customer(String name,String username,String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    //methods
    void customerDeposit(double amount){
        this.balance +=amount;
    }
    
    void customerBalance(){
        System.out.println("Balance: " + this.balance);
    }
    
    void customerWithdraw(double amount){
        this.balance -= amount;
    }
    
    void addTrnasactionWithdraw(int transaction_counter,double amount){
        this.transactions[transaction_counter] = "Withdraw || Amount: -$" + amount;
    }
    
    void addTransactionDeposit(int transaction_counter,double amount){
        this.transactions[transaction_counter] = "Deposit || Amount: +$" +amount;
    }
    
    void customerTransactions(){
        for(String transaction:transactions){
            System.out.println(transaction);
        }
    }
}
