/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.math_class;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        
        //HYPOTENUSE    c = Math.sqrt(a^2 + b^2)
        double legA;
        double legB;
        double legC;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t-- HYPOTENUSE CALCULATOR --");
        System.out.print("Please give leg a: ");
        legA = scanner.nextDouble();
        
        System.out.print("Please give leg b: ");
        legB = scanner.nextDouble();
        
        legC = Math.sqrt( Math.pow(legA,2) + Math.pow(legB,2) );
        
        System.out.println("The hypotenuse (c) of triangle is: " + legC);
        
        
        scanner.close();
    }
}
