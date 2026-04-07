/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number_guessing_game;

/**
 *
 * @author admin
 */
import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {

    public static void main(String[] args) {
        System.out.println("\t--WELCOME TO GUESSING A NUMBER GAME--");
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int rand_num;
        int given_num;
        int chances = 1;
        
        rand_num = random.nextInt(1,11);
        
        System.out.printf("--Chances %d of 5--\n",chances);
        System.out.print("Please enter a number: ");
        given_num = scanner.nextInt();
        
        while(given_num != rand_num && chances<=5){
            if(given_num < rand_num){
                System.out.println("You must enter a greater number.");
            }else if(given_num > rand_num){
                System.out.println("You must enter a smaller number.");
            }
            if(chances==5){
                break;
            }
            chances++;
            System.out.printf("--Chances %d of 5--\n",chances);
            System.out.print("Please enter a number: ");
            given_num = scanner.nextInt();
        }
        if(chances<5){
            System.out.println("You guessed right! The number is: " + rand_num);
        }else{
            System.out.println("GAME OVER. YOU RAN OUT OF CHANCES.");
        }
        
        
        scanner.close();
    }
}
