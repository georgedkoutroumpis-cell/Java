/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventory_system;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class Inventory_System {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        Item_System items = new Item_System();
        
        while(!exit){
            System.out.println("\t- WELCOME TO ITEM INVENTORY SYSTEM -");
            System.out.println("==================================================");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Print all Items");
            System.out.println("4. Save Items to File");
            System.out.println("5. Load Items from File");
            System.out.println("6. Exit Program");
            System.out.println("==================================================");
            System.out.print("Please enter a choice on Menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> addItem(items);
                case 2 -> removeItem(items);
                case 3 -> showAllItems(items);
                case 4 -> saveItemsToFile(items);
                case 5 -> loadItemsFromFile(items);
                case 6 -> {
                            exit = true;
                            System.out.println("Exiting program....");
                }
                default -> System.out.println("Wrong choice on Menu. Please pick again(1-6).");
            }
        }
        
        
        
        scanner.close();
    }
    
    static void addItem(Item_System items){
        System.out.println("==========================================");
        System.out.println("\t- ADDING NEW ITEM -");
        System.out.println("==========================================");
        System.out.print("Please enter new Item ID: ");
        String item_id = scanner.nextLine();
        System.out.print("Please enter new Item name: ");
        String item_name = scanner.nextLine();
        //adding new item to items arraylist (object of Item_System)
        items.addNewItem(item_id, item_name);
    }
    
    static void removeItem(Item_System items){
        showAllItems(items);
        System.out.println("===============================================");
        System.out.println("\t- REMOVING AN ITEM -");
        System.out.println("===============================================");
        System.out.print("Please select an Item ID from available items above: ");
        String item_id = scanner.nextLine();
        items.removeAnItem(item_id);
    }
    
    static void showAllItems(Item_System items){
        System.out.println("===============================================");
        System.out.println("\t- SHOWING ALL ITEMS -");
        System.out.println("===============================================");
        items.showItems();
    }
    
    static void saveItemsToFile(Item_System items){
        System.out.println("Saving Items to File....");
        try{
            FileWriter fw = new FileWriter("Items.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            int items_size = items.getItemsSize();
            for(int i=0; i<items_size;i++){
                pw.println(items.getCurrentItem(i));
            }
            
            pw.close();
        }catch(IOException ioe){
            System.out.println("Error " + ioe);
        }
        
    }
    
    static void loadItemsFromFile(Item_System items){
        System.out.println("Loading Items from File....");
        //clearing items for many loading sessions
        items.clearingForLoad();
        try{
            FileReader fr = new FileReader("Items.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                String[] line_parts = line.split(",");
                //creating a new Item from loaded item
                items.addNewItem(line_parts[0], line_parts[1]);
                line = br.readLine();
            }
            
        }catch(IOException ioe){
            System.out.println("Error " + ioe);
        }
    }
}
