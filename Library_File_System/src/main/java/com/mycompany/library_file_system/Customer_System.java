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

public class Customer_System {
    private ArrayList<Customer> customers;
    
    Customer_System(){
        customers = new ArrayList<>();
    }
    
    void addCustomer(String name, String phone){
        customers.add(new Customer(name,phone));
    }
    
    boolean checkIfRegistered(String name){
        for(Customer customer:customers){
            if(name.equals(customer.getCustomerName())){
                return true;
            }
        }
        return false;
    }
    
    void removeCustomer(String name){
        int index = 0;
        for(Customer customer:customers){
            if(name.equals(customer.getCustomerName())){
                System.out.println("Removing Customer " + name);
                customers.remove(index);
            }
            index++;
        }
    }
    
    void showAllCustomers(){
        System.out.println("\t- CUSTOMERS CATALOG -");
        System.out.println("-----------------------------------------------------------");
        for(Customer customer:customers){
            System.out.println("Name: " + customer.getCustomerName() + " || Phone: " + customer.getCustomerPhone());
        }
    }
    
    void saveCustomersToFile(){
        try{
            FileWriter fw = new FileWriter("Customers.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            for(Customer customer:customers){
                pw.println(customer.getCustomerName() + "," + customer.getCustomerPhone());
            }
            
            pw.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
    void loadCustomersFromFile(){
        try{
            FileReader fr = new FileReader("Customers.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line!=null){
                String[] line_parts = line.split(",");
                customers.add(new Customer(line_parts[0], line_parts[1]));
                
                line = br.readLine();
            }
            
            br.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
    
    void setCurrentCustomerBooks(String name, String book_id, String book_title, String book_author){
        for(Customer customer:customers){
            if(name.equals(customer.getCustomerName())){
                customer.addCustomerBook(book_id,book_title,book_author);
            }
        }
    }
    
    void getCurrentCustomerBooks(String name){
        for(Customer customer:customers){
            if(name.equals(customer.getCustomerName())){
                customer.getCustomerBooks();
                break;
            }
        }
    }
    
    void saveCustomerLendedBookstoFile(String name){
        String filename = name + " Lended Books.txt";
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            for(Customer customer:customers){
                if(name.equals(customer.getCustomerName())){
                    Book[] books = customer.getBooks();
                    for(Book book:books){
                        pw.println(book.getBookID() + "," + book.getBookTitle() + "," + book.getBookAuthor());
                    }
                    break;
                }
            }
            
            pw.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
    void loadCustomerLendedBooksFromFile(String name){
        for(Customer customer:customers){
            if(name.equals(customer.getCustomerName())){
                String filename = name + " Lended Books.txt";
                try{
                    FileReader fr = new FileReader(filename);
                    BufferedReader br = new BufferedReader(fr);
            
                    String line = br.readLine();
                    while(line!=null){
                        String[] line_parts = line.split(",");
                        customer.addCustomerBook(line_parts[1],line_parts[0],line_parts[2]);
                        
                        line = br.readLine();
                    }
                    br.close();
                }catch(IOException ioe){
                    System.out.println("Error: " + ioe);
                }
                break;
            }
        }
    }
    
    
}
