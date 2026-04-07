/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_system_oop_version_2;

/**
 *
 * @author admin
 */
public class Customer extends Account{
    String customer_name;
    String phone_number;
    String username;
    String password;
    Account[] accounts;
    int transactions_count;
    
    Customer(String customer_name,String phone_number, String username, String password){
        this.setHoldername(customer_name);
        this.customer_name = customer_name;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
        this.setAccountBalance(0);
        this.accounts = new Account[4];
        for(int i=0;i<4;i++){
            this.accounts[i] = null;
        }
        this.transactions_count = 0;
    }
    
    boolean checkCredentials(String username,String password){
        if(username.equals(this.username) && password.equals(this.password)){
            System.out.println("Successfull Login");
            System.out.println("Welcome " + this.customer_name + "!");
            return true;
        }else{
            System.out.println("Wrong Username or Password.");
            return false;
        }
    }
    
    @Override
    String getAccountType(){
        return "";
    }
}
