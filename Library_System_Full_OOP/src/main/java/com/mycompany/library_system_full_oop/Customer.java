/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_system_full_oop;

/**
 *
 * @author admin
 */
public class Customer {
    private String name;
    private String phone;
    Item[] items_lended;
    
    Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.items_lended = new Item[10];
    }
    //getters
    String getCustomerName(){
        return this.name;
    }
    
    String getCustomerPhone(){
        return this.phone;
    }
    
    Item[] getCustomerItems(){
        return this.items_lended;
    }
    
    int getNextNullElementInLendedItems(){
        int pos = 0;
        for(Item item:this.items_lended){
            if(item!=null){
                pos++;
            }else{
                break;
            }
        }
        return pos;
    }
    
    //setters
    void setCustomerName(String name){
        this.name = name;
    }
    
    void setCustomerPhone(String phone){
        this.phone = phone;
    }
    
    void setCustomerItems(){
        this.items_lended = new Item[10];
    }
    
    
    
}
