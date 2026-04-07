/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise_inverting_array_elements;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Exercise_inverting_array_elements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Invert the elements of an array (DESCENDING SORT)
        //[1,2,3,4] => [4,3,2,1]
        int num_elements;
        int temp;
        int loops=0;
        
        System.out.print("Please enter the number of elements of array: ");
        num_elements = scanner.nextInt();
        
        //creating the array
        int[] array = new int[num_elements];
        
        System.out.println("=====================================");
        for(int i=0 ; i<num_elements ; i++){
            System.out.print("Please enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.println("=====================================");
        System.out.print("Given array: [");
        for(int arr:array){
            System.out.print(arr+" ");
        }
        System.out.print("]");
        System.out.println();
        
        //inverting(sorting descending)
        for(int i=0 ; i<num_elements-1 ; i++){
            for(int j=1 ; j<num_elements ; j++){
                if(array[j]>array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1]; 
                    array[j-1] = temp;
                    loops++;
                }
            }
            
        }
        
        System.out.print("Inverted array: [");
        for(int arr:array){
            System.out.print(arr+" ");
        }
        System.out.print("]\n");
        System.out.println("Total loops: " + loops);
        
        scanner.close();
    }
}
