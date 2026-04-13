/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_file_system;

/**
 *
 * @author admin
 */
import java.util.ArrayList;


public class Customer {
    //attributes
    private String name;
    private String phone;
    private ArrayList<Book> books_lended;
    
    
    //constructor
    Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.books_lended = new ArrayList<>();
    }
    
    //getters
    String getCustomerName(){
        return this.name;
    }
    
    String getCustomerPhone(){
        return this.phone;
    }
    
    void getCustomerBooks(){
        System.out.println(this.name + " lended Books List: ");
        System.out.println("--------------------------------------------------------------------");
        for(Book book:books_lended){
            System.out.println("Book ID: " + book.getBookID() + " || Title: " + book.getBookTitle());
        }
    }
    
    //setters
    void setCustomerName(String name){
        this.name = name;
    }
    
    void setCustomerPhone(String phone){
        this.phone = phone;
    }
    
    void addCustomerBook(String book_id, String book_title, String book_author){
        
        books_lended.add(new Book(book_title,book_id, book_author));
    }
    
    Book[] getBooks(){
        Book[] books = new Book[books_lended.size()];
        int count = 0;
        for(Book book:books_lended){
            books[count] = new Book(book.getBookTitle(),book.getBookID(),book.getBookAuthor());
            count++;
        }
        return books;
    }
}
