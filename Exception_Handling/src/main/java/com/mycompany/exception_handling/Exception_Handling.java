/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception_handling;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Exception_Handling {

    public static void main(String[] args) {
        
        //Exception = An event that interrupts the normal flow of a program
        //            (Dividing by zero / file not found / mismatch input type)
        //            Surround any dangerous code with try{} block
        //            try{}, catch{}, finally{}
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE A NUMBER BY ZERO!");
        }
        finally{
            System.out.println("This always executes");
            System.out.println("But you can divide by any other number.");
            scanner.close();
        }
        
    }
}
