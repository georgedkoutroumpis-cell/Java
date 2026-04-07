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


public class mad_libs_gmae {
    public static void main(String[] args){
        
        //CREATING A MAD LIBS GAME
        
        Scanner scanner = new Scanner(System.in);
        
        String adjective1;
        String adjective2;
        String adjective3;
        String noun;
        String verb;
        
        
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(person or animal): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ends with -ing: ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();
        
        
        //the story
        System.out.println("The story:");
        System.out.println("\nI went to a " +adjective1 + " zoo." );
        System.out.println("In an excibit i saw " + noun +".");
        System.out.println(noun + " was " +adjective2 + " and " + verb +"!");
        System.out.println("I was " + adjective3 +"!");
        
        
        scanner.close();
    }
}
