/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_system;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Library_System {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        int customer_count=0;
        
        //creating a list of books
        //it can be replaced by a datafile that stores all books
        Book[] book_list = {new Book("Data Structures and Algorithms","K. Manning",true),
                            new Book("Data Science in Python","S. Marshall",true),
                            new Book("C and C++: Introduction to Programming","D. Tselikis",true),
                            new Book("Networks and Telecommunications","G. Abraham",false)
        };
        
        //list of customers
        Customer[] customer_list = new Customer[10];
        
        System.out.println("************************************");
        System.out.println("\tLIBRARY SYSTEM");
        System.out.println("************************************");
        
        while(!exit){
            System.out.println("************************************");
            System.out.println("\t\tMENU");
            System.out.println("************************************");
            System.out.println("1. New customer");
            System.out.println("2. Book Lending");
            System.out.println("3. Return a Book");
            System.out.println("4. View available Books");
            System.out.println("5. Show Customers list");
            System.out.println("6. Show Customer's lend books");
            System.out.println("7. Exit Program");
            //EXTRA: 1)DATA STORAGE, 2)SEARCH BOOK, 3) SEARCH CUSTOMER, 4)VALIDATION(NOT LENDING SAME BOOK BY SAME PERSON)
            System.out.print("Please pick a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> {newCustomer(customer_count,customer_list);
                           customer_count++;
                }
                case 2 -> lendBook(book_list,customer_list);
                case 3 -> { System.out.print("Please enter customer name: ");
                            String name = scanner.nextLine();
                            returnBook(customer_list,name);
                }
                case 4 -> viewAvailableBooks(book_list);
                case 5 -> showCustomers(customer_list);
                case 6 -> showCustomerBooks(customer_list) ;
                case 7 -> exit =true;
                default -> System.out.println("Wrong choice on menu. Please enter a choice(1-4).");
            }
            
        }
        
        scanner.close();
    }
    
    static void newCustomer(int customer_count,Customer[] customer_list){
        System.out.println("***************************************************");
        System.out.println("\tNEW CUSTOMER SIGN UP");
        System.out.println("***************************************************");
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("Please enter phone number: ");
        String phone_number = scanner.nextLine();
        System.out.println("***************************************************");
        System.out.println("New Customer created successfully!");
        
        customer_list[customer_count] = new Customer(name,phone_number);
        
                
    }
    
    static void showCustomers(Customer[] customer_list){
        System.out.println("*************************************");
        System.out.println("\tCUSTOMER LIST");
        System.out.println("*************************************");
        for (Customer customer_list1 : customer_list) {
            if(customer_list1!=null){
                System.out.println("Name: " + customer_list1.name + " || Phone number: " + customer_list1.phone);
            }
        }
    }
    
    static void lendBook(Book[] book_list, Customer[] customer_list){
        boolean available;
        int id;
        int book_count;
        
        System.out.print("Please enter title: ");
        String title = scanner.nextLine();
        available = checkIfAvailable(title,book_list);
        if(available){
            System.out.println("The book : \"" + title + "\" is available for lending.");
            System.out.print("Please enter customer's name for lending: ");
            String name = scanner.nextLine();
            id = findCustomer(customer_list,name);
            book_count = customer_list[id].customerLendBooks();
            System.out.println("For debug::: Customers books: " + book_count);
            
            customer_list[id].addBookLend(book_count, title);
            
            book_count = customer_list[id].customerLendBooks();
            System.out.println("For debug::: Customers books: " + book_count);
        }else{
            System.out.println("The book : \"" + title + "\" is not available for lending.");
        }
    }
    
    static boolean checkIfAvailable(String title, Book[] book_list){
        for(Book book:book_list){
            if(title.equals(book.title)){
                if(book.isAvailable){
                    return true;
                }
            }
        }
        return false;
    }
    
    static int findCustomer(Customer[] customer_list,String name){
        int id=0;
        for(Customer customer:customer_list){
            if(customer != null && name.equals(customer.name)){
                break;
            }
            id++;
        }
       return id; 
    }
    
    static void showCustomerBooks(Customer[] customer_list){
        int id;
        boolean exit=false;
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        id = findCustomer(customer_list,name);
        customer_list[id].CustomerBooks();
        
        System.out.println();
        System.out.println("Press the following:");
        System.out.println("1. Return to Main Menu");
        System.out.println("2. Return a book");
        System.out.print("Please enter a choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        while(!exit){
            switch(choice){
                case 1 ->exit=true;
                case 2 -> {returnBook(customer_list,name);
                           exit =true;
                }
                default -> System.out.println("Wrong choice on Menu. Please pick again(1-2).");
            }
        }
    }
    
    static void returnBook(Customer[] customer_list,String name){
        int id = findCustomer(customer_list,name);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        customer_list[id].removeLendBook(title);
    }
    
    
    static void viewAvailableBooks(Book[] book_list){
        System.out.println("================================================================");
        System.out.println("\t\t\tAVAILABLE BOOKS");
        System.out.println("================================================================");
        
        for(Book book:book_list){
            if(book!=null){
                book.showBook();
            }
        }
    }
    
}
