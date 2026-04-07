/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compound_interest_calculator;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Compound_interest_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double principal_amount;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        
        System.out.print("Enter the principal amount: ");
        principal_amount = scanner.nextDouble();
        
        System.out.print("Enter the interest rate in %: ");
        rate = scanner.nextDouble() / 100;
        
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded= scanner.nextInt();
        
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        
        amount = principal_amount * Math.pow((1 +(rate/timesCompounded)),timesCompounded*years);
        
        System.out.println("The amount after " + years + " is: $" + amount);
        
        scanner.close();
    }
}
