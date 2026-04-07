/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usersinput;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args){
        
        //CREATING A SHOPPING CART PROGRAM
        
        Scanner scanner = new Scanner(System.in);
        
        String item;
        double price;
        int quantity;
        char currency='$';
        double total;
        
        System.out.print("What item would you like to buy? : ");
        item = scanner.nextLine();
        System.out.print("What is the price? : ");
        price = scanner.nextDouble();
        System.out.print("How many of this item would you like to buy? : ");
        quantity = scanner.nextInt();
        
        total = quantity * price;
        
        System.out.println("\nYou choose to buy " + quantity + " " + item + "/s");
        System.out.println("Your total is: " + currency + total);
        
        scanner.close();
    }
}
