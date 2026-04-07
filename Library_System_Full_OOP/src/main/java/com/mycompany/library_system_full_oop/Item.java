/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_system_full_oop;

/**
 *
 * @author admin
 */
public abstract class Item {
    private String item_id;
    private String title;
    private String author;
    private String version;
    
    
    //constructor
    
    
    //getters
    String getItemId(){
        return this.item_id;
    }
    
    String getTitle(){
        return this.title;
    }
    
    String getAuthor(){
        return this.author;
    }
    
    String getVersion(){
        return this.version;
    }
    
    
    //setters
    void setItemId(String item_id){
        this.item_id = item_id;
    }
    
    void setTitle(String title){
        this.title = title;
    }
    
    void setAuthor(String author){
        this.author = author;
    }
    
    void setVersion(String version){
        this.version = version;
    }
    
}
