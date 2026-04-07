/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperature_converter;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Temperature_converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unit;
        double temp;
        double new_temp;
        
        System.out.println("\t--TEMPERATURE CONVERTER--");
        
        System.out.print("Please give the temperature: ");
        temp = scanner.nextDouble();
        
        System.out.print("Please pick in what type would you like to convert: C. Fahrenheit to Celsius || F. Celsius to Fahrenheit :: ");
        unit = scanner.next().toUpperCase();
     
        //ternary operator -- (condition) ? true_value : false_value
        new_temp = (unit.equals("C")) ? (temp - 32)*5/9 : (temp *9/5) + 32;
        
        System.out.printf("The temperature is: %.2f %s",new_temp,unit);
        
        
        scanner.close();
    }
}
