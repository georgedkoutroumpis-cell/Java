/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_system;

/**
 *
 * @author admin
 */
public class Customer {
    String name;
    String phone;
    String[] books_lend = new String[10];
    
    //constructor
    Customer(String name,String phone){
        this.name = name;
        this.phone = phone;
    }
    
    //methods
    int customerLendBooks(){
        int count = 0;
        for(String book:this.books_lend){
            if(book!=null){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    
    void CustomerBooks(){
        System.out.println("==============================");
        System.out.println("\nBOOKS LEND");
        System.out.println("==============================");
        
        for(String book:this.books_lend){
            if(book!=null){
                System.out.println(book);
            }else{
                break;
            }
        }
    }
    
    void addBookLend(int idBookLend, String title){
        this.books_lend[idBookLend] = title;
    }
    
    void removeLendBook(String title){
        for(int i = 0; i < books_lend.length; i++){
            if(books_lend[i] != null && books_lend[i].equals(title)){
                // shift left
                for(int j = i; j < books_lend.length - 1; j++){
                    books_lend[j] = books_lend[j+1];
                }

                books_lend[books_lend.length - 1] = null;
                break;
            }
        }
    }
}
