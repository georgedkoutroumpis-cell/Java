/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.d_arrays;

/**
 *
 * @author admin
 */
public class App {

    public static void main(String[] args) {
        //2d array = an array where each element is an array
        //           Useful for storing matrix data
        
        
        //2d array declaration
        //for example lets declare an 2D array of integers
        //we can declare an array: 1) by using the name of pre-declared arrays
        //                         2) by giving values
        
        //1) By using the name of pre-declared arrays
        int[] oneToThree = {1,2,3};
        int[] fourToSix = {4,5,6};
        int[] sevenToNine = {7,8,9};
        int[][] numbers = {oneToThree,fourToSix,sevenToNine};
        
        //lets print our 2D-array
        for(int[] array:numbers){
            for(int number:array){
                System.out.print(number + " ");
            }
            System.out.println();
        }
        
        //2) by giving values
        int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
        //lets print our 2d array
        System.out.println();
        for(int[] array:array2){
            for(int num:array){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        //access to an 2d-array element
        //we must use 2 indexes to access an element
        array2[0][1] = 10; //in our array2[][] we change the value of element in row:1(index=0) and column:2(index=1)
        System.out.println();
        for(int[] array:array2){
            for(int num:array){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
