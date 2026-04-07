/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_system_full_oop;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Library_System_Full_OOP {
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        boolean exit = false;
        
        
        System.out.println("**************************************************");
        System.out.println("\tWELCOME TO LIBRARY SYSTEM");
        System.out.println("**************************************************");
        
        
        //First we create an array that stores all the Library Items(Books and Magazines)
        Stored_Items storedItems = new Stored_Items();  
        //WE use the constructor of Stored_Items Class and by default we create an array
        //that can store 100 items(books and magazines). If we want more we can change
        //the number of elements in this constructor.
        
        
        
        //We create 3 books and 1 magazine to test the implementation of our program
        storedItems.stored_items[0] = new Book(101,"Data Structures and Algorithms","G. Argwall","A");
        storedItems.stored_items[1] = new Book(102,"Introduction to C and C++","A. Longbow","B");
        storedItems.stored_items[2] = new Book(103,"Introduction to Matlab","K. Sommerstein","A");
        storedItems.stored_items[3] = new Magazine(101,"AI in Science","Boston Science Institute","2026.10");
        int stored_items_till_now = 4;  //using later for storing new Book or Magazine
        int[] last_stored_bookid = {103}; //keeping last book ID
        int[] last_stored_magazineid = {101};   //keeping last magazine ID
        
        //Creating an array that stores customers
        Customer_System Library_customers = new Customer_System();
        //WE use the constructor of Customer_System Class and by default we create an array
        //that can store 100 Customers. If we want more we can change
        //the number of elements in this constructor.
        
        //WE create 2 customers to test the implementation of our program
        Library_customers.customers[0] = new Customer("George Koutroumpis", "6946278539");
        Library_customers.customers[1] = new Customer("Maria Iasonidou", "6937854562");
        int stored_customers_till_now = 2;  //using later for storing new Customer
        
        
        while(!exit){
            //MAIN MENU
            System.out.println("================================");
            System.out.println("\t\tMENU");
            System.out.println("================================");
            System.out.println("1. Add New Book or Magazine");
            System.out.println("2. Show Stored Books and Magazines");
            System.out.println("3. Show Customers -- Customer's lended Items");
            System.out.println("4. Add new Customer");
            System.out.println("5. Lend a Book or Magazine");
            System.out.println("6. Exit Library System");
            System.out.println("================================");
            System.out.print("Please enter a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 ->{addNewItem(storedItems, stored_items_till_now, last_stored_bookid, last_stored_magazineid);
                          stored_items_till_now++;
                }
                case 2 -> showStoredItems(storedItems);
                case 3 -> showCustomers(Library_customers);
                case 4 -> { addNewCustomer(Library_customers, stored_customers_till_now);
                            stored_customers_till_now++;
                }
                case 5 -> customerLendItem(Library_customers, storedItems);
                case 6 ->{exit = true;
                          System.out.println("Exiting Library System...");
                }
                default -> System.out.println("Wrong choice on Menu. Please pick again(1-5).");
            }
            
        }
        
        
    }
    
    static void addNewItem(Stored_Items storedItems, int stored_items_num, int[] last_stored_bookid, int[] last_stored_magazineid){
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("\tSTORING A NEW ITEM IN LIBRARY");
        System.out.println("**********************************************");
        System.out.println();
        System.out.print("Press 1.to store a Book, 2.to store a Magazine, 3.to cancel proedure : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch(choice){
            case 1 -> addNewBook(storedItems, stored_items_num, last_stored_bookid);
            case 2 -> addNewMagazine(storedItems, stored_items_num, last_stored_magazineid);
            case 3 -> System.out.println("Cancel storing new Item procedure.");
            default -> System.out.println("Wrong choice on Menu.");
        }
    }
    
    static void addNewBook(Stored_Items storedItems, int stored_items_num, int[] last_stored_bookid){
        //Updating Last Book ID
        last_stored_bookid[0]++;
        
        System.out.println("**********************************************");
        System.out.println("\tSTORING A NEW BOOK IN LIBRARY");
        System.out.println("**********************************************");
        System.out.println("Item's ID will be automatically generated.");
        System.out.print("Please enter new Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Please enter new Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Please enter new Book Version: ");
        String version = scanner.nextLine();
        
        //Checking if book about to store is already stored
        if(checkAlreadyStored(title,storedItems)){
            System.out.println("Book already stored.");
        }else{
            //Storing the new Book
            storedItems.stored_items[stored_items_num] = new Book(last_stored_bookid[0],title,author,version);
        }
    }
    
    static void addNewMagazine(Stored_Items storedItems, int stored_items_num, int[] last_stored_magazineid){
        //Updating Last Magazine ID
        last_stored_magazineid[0]++;
        
        System.out.println("**********************************************");
        System.out.println("\tSTORING A NEW MAGAZINE IN LIBRARY");
        System.out.println("**********************************************");
        System.out.println("Item's ID will be automatically generated.");
        System.out.print("Please enter new Magazine Title: ");
        String title = scanner.nextLine();
        System.out.print("Please enter new Magazine Author: ");
        String author = scanner.nextLine();
        System.out.print("Please enter new Magazine Version: ");
        String version = scanner.nextLine();
        
        //Checking if magazine about to store is already stored
        if(checkAlreadyStored(title,storedItems)){
            System.out.println("Magazine already stored.");
        }else{
            //Storing the new Book
            storedItems.stored_items[stored_items_num] = new Magazine(last_stored_magazineid[0],title,author,version);
        }   
    }
    
    static void showStoredItems(Stored_Items storedItems){
        System.out.println("************************************");
        System.out.println("\tSTORED ITEMS");
        System.out.println("************************************");
        for(int i=0;i<100;i++){
            if(storedItems.stored_items[i] == null){
                break;
            }else{
                System.out.printf("[%d] ID: %s\t|| Title: %s\t|| Author: %s\t|| Version: %s\n", i+1, storedItems.stored_items[i].getItemId(),
                        storedItems.stored_items[i].getTitle(), storedItems.stored_items[i].getAuthor(), storedItems.stored_items[i].getVersion());
            }
        }     
    }
    
    
    static boolean checkAlreadyStored(String title, Stored_Items storedItems){
        for(Item item:storedItems.stored_items){
            if(item==null){
                break;
            }else{
                if(item.getTitle().equals(title)){
                    return true;
                }
            }
        }
        return false;
    }
 
    static void showCustomers(Customer_System Library_customers){
        int count = 0;
        System.out.println("************************************");
        System.out.println("\tLIBRARY CUSTOMERS");
        System.out.println("************************************");
        for(Customer customer:Library_customers.customers){
            if(customer==null){
                break;
            }else{
                System.out.printf("Customer[%d] Name: %s || Phone: %s\n",count+1,customer.getCustomerName(),customer.getCustomerPhone());
                count++;
            }
            
        }
        
        System.out.println("************************************");
        System.out.print("Would you like to see Customer's lended Items? Type [y/n]: ");
        String choice = scanner.nextLine();
        
        switch(choice){
            case "y" ->{System.out.print("Please pick which customer(1-" + count + "): ");
                        int customer_picked = scanner.nextInt();
                        scanner.nextLine();
                        showCustomerLendedItems(Library_customers, customer_picked-1);}
            case "n" -> System.out.println("Continue..");
            default -> System.out.println("Wrong choice on Menu. Please pick (1-2).");
        }
    }
    
    static void showCustomerLendedItems(Customer_System Library_customers, int customer_picked){
        System.out.println("******************************************************************");
        System.out.println("Customer's " + Library_customers.customers[customer_picked].getCustomerName() + 
                " lended Items: ");
        System.out.println("******************************************************************");
        
        Item[] customer_lended_items =  Library_customers.customers[customer_picked].getCustomerItems();
        int count = 1;
        for(Item item:customer_lended_items){
            if(item == null){
                break;
            }else{
                System.out.printf("Item [%d] || Item ID: %s || Title: %s\n",count, item.getItemId(), item.getTitle());
            }
            count++;
        }
    }
    
    static void addNewCustomer(Customer_System Library_customers, int stored_customers_till_now){
        System.out.println("***************************************************************");
        System.out.println("\tADDING NEW LIBRARY CUSTOMER");
        System.out.println("***************************************************************");
        System.out.print("Please enter new Customer name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter new Customer phone: ");
        String phone = scanner.nextLine();
        Library_customers.customers[stored_customers_till_now] = new Customer(name,phone);
        
    }
    
    
    static void customerLendItem(Customer_System Library_customers, Stored_Items storedItems){
        //Showing stored Items
        showStoredItems(storedItems);
        System.out.print("Please pick the item about to lend: ");
        int item_picked = scanner.nextInt();
        

        
        //showing Library Customers
        showCustomers(Library_customers);
        System.out.println();
        System.out.print("Please pick customer that the item will be lend: ");
        int customer_picked = scanner.nextInt();
        scanner.nextLine();
        
        //storing the picked item to the picked Customer's lended items
        //First we need to get the next null element in Customer's lended_items array
        int pos = Library_customers.customers[customer_picked-1].getNextNullElementInLendedItems();
        Library_customers.customers[customer_picked-1].items_lended[pos] = storedItems.stored_items[item_picked-1];
        
    }
}
