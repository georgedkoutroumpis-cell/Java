/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory_system;

/**
 *
 * @author admin
 */
public class Item {
    private String item_id;
    private String item_name;
    
    Item(String item_id, String item_name){
        this.item_id = item_id;
        this.item_name = item_name;
    }
    
    void setItemID(String item_id){
        this.item_id = item_id;
    }
    
    void setItemName(String item_name){
        this.item_name = item_name;
    }
    
    String getItemID(){
        return item_id;
    }
    
    String getItemName(){
        return item_name;
    }
}
