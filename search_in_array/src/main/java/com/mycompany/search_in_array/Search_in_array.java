/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.search_in_array;

/**
 *
 * @author admin
 */
import java.util.Random;


public class Search_in_array {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int target = 2;
        int count=0;
        
        System.out.print("[ ");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(1,11);
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        
        //Linear search
        System.out.println("LINEAR SEARCH");
        for(int i=0; i<numbers.length ; i++){
            count++;
            if(target==numbers[i]){
                System.out.println("The " + target + " found in index: " + i + " || Total loops till find target: " + count);
                break;
            }
        }
        
        int temp;
        //sorting array ascending sort
        for(int i=0;i<numbers.length-1;i++){
            for(int j=1;j<numbers.length;j++){
                if(numbers[j]<numbers[j-1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }
        
        //printing sorting array
        System.out.print("[ ");
        for(int number:numbers){
            System.out.print(number + " ");
        }
        System.out.print("]");
    }
}
