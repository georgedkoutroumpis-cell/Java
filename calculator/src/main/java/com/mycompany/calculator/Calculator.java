/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        char operator;
        
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        
        
        switch(operator){
            case '+' ->{
                result = num1 + num2;
                System.out.println("Result: " + result);
            }
            case '-' ->{
                result = num1 - num2;
                System.out.println("Result: " + result);
            }
            case '*' ->{
                result = num1 * num2;
                System.out.println("Result: " + result);
            }
            case '/' ->{
                if(num2==0){
                    System.out.println("Cannot divide by zero!");
                }else{
                    result = num1 / num2;
                    System.out.println("Result: " + result);   
                }
            }
            case '^' ->{
                result = Math.pow(num1,num2);
                System.out.println("Result: " + result);
            }
            default -> System.out.println("Wrong operator input.");
        }
        
        
        
        scanner.close();
    }
}
