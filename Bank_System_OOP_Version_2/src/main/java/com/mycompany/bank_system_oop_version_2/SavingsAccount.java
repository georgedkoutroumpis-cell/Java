/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_system_oop_version_2;

/**
 *
 * @author admin
 */
public class SavingsAccount extends Account{
    String account_type;
    //constructor
    SavingsAccount(String holder_name, String IBAN){
        this.setIBAN(IBAN);
        this.setHoldername(holder_name);
        this.setAccountBalance(0);
        this.account_type = "Savings Account";
    }
    
    
    
    @Override
    String getAccountType(){
        return this.account_type;
    }
    
   
}
