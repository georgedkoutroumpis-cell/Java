/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        
        //method = a block of reusable code that is executed when is called
        
        Scanner scanner = new Scanner(System.in);
        
        String name;
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        
        //example 1 - no returning value
        happybirthday(name);
        
        
        //example 2 - return value(RETURN)
        //we have a method e.g. square() that returns the squared value of an argument
        double num;
        double square_of_a_num;
        System.out.print("Enter a number so you can calculate the square of it: ");
        num = scanner.nextDouble();
        square_of_a_num = square(num);
        System.out.printf("The square of given number %.1f is %.1f",num,square_of_a_num);
        
        scanner.close();
    }
    
    static void happybirthday(String name){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.println("Happy birthday to you!");
    }
    
    static double square(double num){
        return num*num;
    }
}
