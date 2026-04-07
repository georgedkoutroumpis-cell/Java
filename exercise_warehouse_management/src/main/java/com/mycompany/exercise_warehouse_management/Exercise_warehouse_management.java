/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise_warehouse_management;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Exercise_warehouse_management {
    static Scanner scanner = new Scanner(System.in);    //CLASS
    
    public static void main(String[] args) {
        
        boolean exit=false;
        
        int[] quantities = {15,20,10,30,23};
        
        
        while(!exit){
            System.out.println("==========================");
            System.out.println("\tMENU");
            System.out.println("==========================");
            System.out.println("1. Show Quantities");
            System.out.println("2. Add Quantity");
            System.out.println("3. Remove Quantity");
            System.out.println("4. Exit");
            System.out.println("==========================");
            System.out.print("Please enter a choice: ");
           int choice = scanner.nextInt();
           System.out.println("==========================");
           switch(choice){
               case 1 ->showQuantity(quantities,quantities.length);
               case 2 ->addQuantity(quantities);
               case 3 ->removeQuantity(quantities);
               case 4 -> exit=true;
               default -> System.out.println("Wrong input. Please choose a menu option again!");
           }
        }
        
        scanner.close();
    }
    static void showQuantity(int[] array,int length){
        
        for(int i=0 ; i<length ; i++){
            System.out.println("Quantity " + (i+1) + ": " + array[i]);
        }
    }
    
    static void addQuantity(int[] array){
        System.out.print("Please enter the quantity about to add: ");
        int quantity = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter Quantity Identifier: ");
        int identifier = scanner.nextInt();
        array[identifier-1] += quantity;
    }
    
    static void removeQuantity(int[] array){
        System.out.print("Please enter the quantity about to remove: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Quantity Identifier: ");
        int identifier = scanner.nextInt();
        array[identifier-1] -= quantity;
    }
}
