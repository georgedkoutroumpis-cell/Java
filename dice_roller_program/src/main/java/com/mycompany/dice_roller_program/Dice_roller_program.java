/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dice_roller_program;

/**
 *
 * @author admin
 */
import java.util.Random;
import java.util.Scanner;


public class Dice_roller_program {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int dice_num;
        int rolled;
        int total=0;
        
        System.out.print("Please enter the number of dice about to roll: ");
        dice_num = scanner.nextInt();
        
        for(int i=0;i<dice_num;i++){
            rolled = random.nextInt(1,7);
            printDice(rolled);
            System.out.printf("You rolled: %d\n", rolled);
            total+=rolled;
        }
        
        System.out.printf("You rolled total; %d",total);
        
        scanner.close();
    }
    
    static void printDice(int rolled){
        //We use multi-line strings (String var_name = """.....""";)
      
        switch(rolled){
            case 1 -> {String dice1 = """
                        
                              
                           ●   
                              
                        
                       """;
                       System.out.println(dice1);
            }
            case 2 -> {String dice2 = """
                        
                        ●      
                               
                              ●
                        
                       """;
                       System.out.println(dice2);
            }
            case 3 -> {String dice3 = """
                        
                        ●      
                           ●   
                              ●
                        
                       """;
                       System.out.println(dice3);
            }
            case 4 -> {String dice4 = """
                        
                        ●     ●
                               
                        ●     ●
                        
                       """;
                       System.out.println(dice4);
            }
            case 5 ->{String dice5 = """
                        
                        ●     ●
                           ●   
                        ●     ●
                        
                       """;
                       System.out.println(dice5);
            }
            case 6 ->{String dice6 = """
                        
                        ●     ●
                        ●     ●
                        ●     ●
                   
                       """;
                       System.out.println(dice6);
            }
            
        }
    }
}
