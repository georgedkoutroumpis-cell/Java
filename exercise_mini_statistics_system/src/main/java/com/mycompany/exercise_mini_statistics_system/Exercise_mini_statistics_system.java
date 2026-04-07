/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise_mini_statistics_system;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Exercise_mini_statistics_system {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        double avg;
        int temp;
        double median;
        int count=0;
        
        System.out.print("Please enter number of elements: ");
        int num_elements = scanner.nextInt();
        
        int[] array = new int[num_elements];
        
        for(int i=0 ; i<num_elements ; i++){
            System.out.print("Please enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        avg = sum / num_elements;
        System.out.println("The average is: " + avg);
        
        //sorting ascending to find the median
        for(int i=0 ; i<num_elements-1 ; i++){
            for(int j=1 ; j<num_elements ; j++){
                if(array[j]<array[j-1]){
                   temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array to find the median:");
        System.out.print("[ ");
        for(int arr:array){
            System.out.print(arr + " ");
        }
        System.out.print("]");
        System.out.println("");
        
        //checking if number of elements is odd or even
        if(num_elements%2==0){
            median = (array[num_elements/2-1] + array[(num_elements/2)])/2;
        }else{
            median = array[(num_elements/2)];
        }
        
        System.out.printf("The median is: %.1f\n",median);
        
        for(int arr:array){
            if(arr>avg){
                count++;
            }
        }
        
        System.out.println("Number of elements greater than average: " + count);
        
        scanner.close();
    }
}
