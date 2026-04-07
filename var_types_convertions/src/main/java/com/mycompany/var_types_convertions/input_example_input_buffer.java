/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.var_types_convertions;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class input_example_input_buffer {
    public static void main(String[] args){
        
        //this is an example about the clearance of input buffer after inserting data except of Strings


        //creating Scanner object
        Scanner scanner = new Scanner(System.in);
        
        //inserting an integer
        System.out.println("Please give your age:");
        int age = scanner.nextInt();
        
        //cleaning input buffer
        scanner.nextLine();
        
        //inserting a String without proble
        System.out.print("Give your name: ");   //System.out.print(...) --> Reads from keyboard at the same lime as the String inside the print
        String name = scanner.nextLine();
        
       System.out.println("\t-- Record --");
       System.out.println("Name: "+name +" | Age: "+age);
        //closing Scanner object
        scanner.close();
    }
}
