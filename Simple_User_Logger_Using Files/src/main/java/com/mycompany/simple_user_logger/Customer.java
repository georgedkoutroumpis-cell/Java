/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_user_logger;

/**
 *
 * @author admin
 */
public class Customer {
    //attributes
    private String name;
    private int balance;
    private String username;
    private String password;
    
    
    //constructor
    Customer(String name, String username, String password){
        this.setCustomerName(name);
        this.setBalance(0);
        this.setUsername(username);
        this.setPassword(password);
    }
    
    //getters
    int getBalance(){
        return this.balance;
    }
    
    String getUsername(){
        return this.username;
    }
    
    String getPassword(){
        return this.password;
    }
    
    String getCustomerName(){
        return this.name;
    }
    
    void setBalance(int balance){
        this.balance = balance;
    }
    
    void setUsername(String username){
        this.username = username;
    }
    
    void setPassword(String password){
        this.password = password;
    }
    
    void setCustomerName(String name){
        this.name = name;
    }
}
