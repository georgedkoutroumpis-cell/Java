/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_loops;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class While_loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String response="";
        
        while(!response.equals("Q")){
            System.out.println("You are playing a game.");
            System.out.println("Press Q to exit.");
            response = scanner.next().toUpperCase();
        }
        
        System.out.println("Exiting game....");
        
        
        //example 2
        int age;
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        
        while(age<0){
            System.out.println("Your age can't be negative.");
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old.");
        
        
        //example 3 do...while
        int number;
        
        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }while(number <1 || number >10);
        
        System.out.println("You picked number " + number);
        
        scanner.close();
    }
}
