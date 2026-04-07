/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usersinput;

import java.util.Scanner;

public class Usersinput{
    
    public static void main(String[] args){
        
        //creating a new Scanner object
        Scanner scanner = new Scanner(System.in);
        
        
        //STRING INPUT FROM USER WITH METHODS .next() OR .nextLine();
        System.out.print("Please give a name: ");
        //input to variable name(String)
        String name = scanner.nextLine();//.nextLine reads string with spaces
        
        /*
            .next (reads string till space)
        */
        //String name = scanner.next();   //if the given name(string) is "Alex Ferguson", the program will print to screen " Hello Alex" without "Ferguson"
        
        
        //INTEGER INPUT FROM USER WITH METHOD .nextInt()
        System.out.print("Please give age: ");
        int age = scanner.nextInt();

        
        //DOUBLE INPUT FROM USER WITH METHOD .nextDouble()
        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        
        //BOOLEAN INPUT FROM USER WITH METHOD .nextBoolean()
        System.out.print("Are you a student? (true/false) : ");
        boolean isStudent = scanner.nextBoolean();
        
        //printing
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);
        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }
        
        //closing Scanner object
        scanner.close();
    }
}
