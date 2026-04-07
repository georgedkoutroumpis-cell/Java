/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_system;

/**
 *
 * @author admin
 */
public class Book {
    String title;
    String author;
    boolean isAvailable;
    
    
    //constuctors
    Book(String title,String author,boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    
    void showBook(){
        if(this.isAvailable){
            System.out.println("Title: " + this.title + " || Author: " + this.author);
        }
    }
}
