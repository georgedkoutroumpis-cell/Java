/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_file_system;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Library_File_System {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        
        
        System.out.println("\t - WELCOME TO LIBRARY FILE SYSTEM - ");
        System.out.println("-------------------------------------------------------");
        
        Book_System books = new Book_System();
        Customer_System customers = new Customer_System();
        
        
        while(!exit){
            System.out.println("================================");
            System.out.println("\t- MENU -");
            System.out.println("================================");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Show all Books");
            System.out.println("4. Add Customer");
            System.out.println("5. Remove Customer");
            System.out.println("6. Show Customers");
            System.out.println("7. Save Books to File");
            System.out.println("8. Load Books from File");
            System.out.println("9. Save Customers to File");
            System.out.println("10. Load Customers from File");
            System.out.println("11. Lend a Book to a Customer");
            System.out.println("12. Show Customer's Lended Books");
            System.out.println("13. Save Customer's Lended Books to File");
            System.out.println("14. Load Customer's Lended Books from File");
            System.out.println("15. Exit program");
            System.out.println("================================");
            System.out.print("Please enter a choice on Menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("----------------------------------------");
            switch(choice){
                case 1 -> addNewBook(books);
                case 2 -> removeABook(books);
                case 3 -> {
                            System.out.println("=======================================");
                            System.out.println("\t- AVAILABLE BOOKS -");
                            System.out.println("=======================================");
                            books.showAllBooks();
                }
                case 4 -> addNewCustomer(customers);
                case 5 -> removeACustomer(customers);
                case 6 -> customers.showAllCustomers();
                case 7 ->{ books.saveBooksToFile();
                           System.out.println("Saving Books to File....");
                }
                case 8 ->{
                            System.out.println("Loading Books from File....");
                            books.loadBooksFormFile();
                }
                case 9 -> {
                            System.out.println("Saving Customers to File....");
                            customers.saveCustomersToFile();
                }
                case 10 -> {
                            System.out.println("Loading Customers from File....");
                            customers.loadCustomersFromFile();
                }
                case 11 ->{
                            System.out.println("=======================================");
                            System.out.println("\t- AVAILABLE BOOKS -");
                            System.out.println("=======================================");
                            books.showAllBooks();
                            System.out.println("=======================================");
                            System.out.print("Please select which book would like to lend(Enter Book-ID): ");
                            String book_id = scanner.nextLine();
                            System.out.print("Please enter Customer's name: ");
                            String name = scanner.nextLine();
                            //retrieveing book attributes from available books
                            String book_title = books.retrieveBookTitle(book_id);
                            String book_author = books.retrieveBookAuthor(book_id);
                            if(customers.checkIfRegistered(name)){
                                customers.setCurrentCustomerBooks(name, book_id,book_title,book_author);
                            }else{
                                System.out.println("Customer " + name + " not found.");
                            }
                }
                case 12 ->{ 
                            System.out.println("\t- SHOWING CUSTOMER'S LENDED BOOKS -");
                            System.out.println("=================================================");
                            System.out.print("Please enter Customer's name: ");
                            String name = scanner.nextLine();
                            System.out.println("=================================================");
                            if(customers.checkIfRegistered(name)){
                                customers.getCurrentCustomerBooks(name);
                            }else{
                                System.out.println("Customer " + name + " not found!");
                            }
                }
                case 13 ->{ System.out.print("Please enter Customer's name: ");
                            String name = scanner.nextLine();
                            if(customers.checkIfRegistered(name)){
                                System.out.println("Saving lended books to File....");
                                customers.saveCustomerLendedBookstoFile(name);
                            }else{
                                System.out.println("Customer " + name + " not found!");
                            }     
                }
                case 14 -> {
                            System.out.println("\t- LOADING CUSTOMER'S LENDED BOOKS FROM FILE -");
                            System.out.println("==========================================================");
                            System.out.print("Please enter customer's name: ");
                            String name = scanner.nextLine();
                            if(customers.checkIfRegistered(name)){
                                customers.loadCustomerLendedBooksFromFile(name);
                            }else{
                                System.out.println("Customer " + name + " not found!");
                            }
                }
                case 15 -> {
                            exit = true;
                            System.out.println("Exiting Program....");
                }
                default -> System.out.println("Wrong choice on Menu. Please pick again 1-11.");
            }
        }
        
        
        scanner.close();
    }
    
    static void addNewBook(Book_System books){
        System.out.println("=======================================");
        System.out.println("\t- ADDING NEW BOOK -");
        System.out.println("=======================================");
        System.out.print("Please enter New Book Title: ");
        String new_title = scanner.nextLine();
        System.out.print("Please enter New Book Author: ");
        String new_author = scanner.nextLine();
        System.out.println("---------------------------------------------");
        
        //getting last id number
        String[] id_parts = books.chechEmptyBookCatalog().split("-");
        int int_id = Integer.parseInt(id_parts[1]);
        int_id++;
        String new_id = "B-"+int_id;
        
        
        if(books.checkIfAlreadyRegistered(new_title)){
            System.out.println("Book already registered.");
        }else{
            books.addBook(new_title, new_id, new_author);
        }
    }
    
    static void removeABook(Book_System books){
        System.out.println("=======================================");
        System.out.println("\t- AVAILABLE BOOKS -");
        System.out.println("=======================================");
        books.showAllBooks();
        System.out.println("======================================");
        System.out.println("\t- REMOVING A BOOK -");
        System.out.println("======================================");
        System.out.print("Please enter a Book ID from above to remove: ");
        String picked_id = scanner.nextLine();
        
        books.removeBook(picked_id);
    }
    
    static void addNewCustomer(Customer_System customers){
        System.out.println("\t- ADDING NEW CUSTOMER FORM-");
        System.out.println("=============================================");
        System.out.print("Please enter Customer's name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter Customer's phone: ");
        String phone = scanner.nextLine();
        
        //adding the new customer
        customers.addCustomer(name, phone);
    }
    
    static void removeACustomer(Customer_System customers){
        System.out.println("\t- REMOVING A CUSTOMER FORM -");
        System.out.println("=============================================");
        System.out.print("Please enter Customer's name: ");
        String name = scanner.nextLine();
        if(customers.checkIfRegistered(name)){
            customers.removeCustomer(name);
        }else{
            System.out.println("Customer with name " + name + " is not registerd in Customers calatog.");
        }
    }
    
}
