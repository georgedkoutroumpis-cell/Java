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
import java.io.*;

public class Book_System {
    private ArrayList<Book> books;
    
    Book_System(){
        books = new ArrayList<>();
    }
    
    //methods
    void addBook(String title,String id, String author){
        books.add(new Book(title,id,author));
    }
    
    boolean checkIfAlreadyRegistered(String title){
        for(Book book:books){
            if(book.getBookTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    
    String chechEmptyBookCatalog(){
        if(books.isEmpty()){
            return "B-100";
        }else{
            return books.get(books.size()-1).getBookID();
        }
    }
    
    void showAllBooks(){
        for(Book book:books){
            System.out.printf("ID: %s || Title: %s || Author: %s\n",book.getBookID(),book.getBookTitle(),book.getBookAuthor());
        }
    }
    
    void removeBook(String id){
        int count = 0;
        for(Book book:books){
            if(id.equals(book.getBookID())){
                System.out.println("Removing book " + book.getBookTitle() + " with ID " + book.getBookID());
                books.remove(count);
                break;
            }
            count++;
        }
    }
    
    
    void saveBooksToFile(){
        try{
            FileWriter fw = new FileWriter("Books.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            for(Book book:books){
                pw.println(book.getBookID() + "," + book.getBookTitle() + "," + book.getBookAuthor());
            }
            
            pw.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
    void loadBooksFormFile(){
        try{
            FileReader fr = new FileReader("Books.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line!=null){
                String[] line_parts = line.split(",");
                books.add(new Book(line_parts[1],line_parts[0],line_parts[2]));
                
                line = br.readLine();
            }
            
            br.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
    
    String retrieveBookTitle(String book_id){
        for(Book book : books){
            if(book_id.equals(book.getBookID())){
                return book.getBookTitle();
            }
        }
        return "No book title found.";
    }
    
    String retrieveBookAuthor(String book_id){
        for(Book book:books){
            if(book_id.equals(book.getBookID())){
                return book.getBookAuthor();
            }
        }
        return "No book author found";
    }
}
