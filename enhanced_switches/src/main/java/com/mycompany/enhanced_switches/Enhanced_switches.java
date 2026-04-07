/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enhanced_switches;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Enhanced_switches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();
        
        switch(day){
            case "Monday" -> System.out.println("It is a weekday.");
            case "Tuesday" -> System.out.println("It is a weekday.");
            case "Wednesday" -> System.out.println("It is a weekday.");
            case "Thursday" -> System.out.println("it is a week day");
            case "Friday" -> System.out.println("It is a weekday.");
            case "Saturday","Sunday" -> System.out.println("It is weekend.");
            default -> System.out.println(day + " is not a day.");
        }
        
        
        scanner.close();
    }
}
