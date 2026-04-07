/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise_counting_input_numbers;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Exercise_counting_input_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean exit=false;
        int count_1=0;
        int count_2=0;
        int count_3=0;
        int count_4=0;
        int count_5=0;
        
        while(!exit){
            System.out.println("To continue enter a number(1-5). || To exit enter 'e'.");
            System.out.print("Please enter a choice: ");
            String choice = scanner.next();
            
            switch(choice){
                case "e" -> exit = true;
                default -> {
                    if(choice.equals("1")){
                        count_1++;
                    }else if(choice.equals("2")){
                        count_2++;
                    }else if(choice.equals("3")){
                        count_3++;
                    }else if(choice.equals("4")){
                        count_4++;
                    }else if(choice.equals("5")){
                        count_5++;
                    }
                }
            }
        }
        
        System.out.println("You gave number 1 times (x): " + count_1);
        System.out.println("You gave number 2 times (x): " + count_2);
        System.out.println("You gave number 3 times (x): " + count_3);
        System.out.println("You gave number 4 times (x): " + count_4);
        System.out.println("You gave number 5 times (x): " + count_5);
        
        scanner.close();
    }
}
