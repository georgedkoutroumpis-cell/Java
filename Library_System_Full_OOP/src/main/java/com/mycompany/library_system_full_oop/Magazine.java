/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_system_full_oop;

/**
 *
 * @author admin
 */
public class Magazine extends Item{
 
    
    //constructor
    Magazine(int item_id, String title, String author, String version){
        this.setItemId("M-" + item_id);
        this.setTitle(title);
        this.setAuthor(author);
        this.setVersion(version);
    }

}
