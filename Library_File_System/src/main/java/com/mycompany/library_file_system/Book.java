/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_file_system;

/**
 *
 * @author admin
 */
public class Book {
    private String title;
    private String id;
    private String author;
    
    Book(String title, String id, String author){
        this.title = title;
        this.id = id;
        this.author = author;
    }
    
    //getters
    String getBookTitle(){
        return this.title;
    }
    
    String getBookID(){
        return this.id;
    }
    
    String getBookAuthor(){
        return this.author;
    }
    
    //setters
    void setBookTitle(String title){
        this.title =title;
    }
    
    void setBookID(String id){
        this.id = id;
    }
    
    void setBookAuthor(String author){
        this.author = author;
    }
}
