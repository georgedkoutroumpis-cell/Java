/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array_s;

/**
 *
 * @author admin
 */
import java.util.Arrays;

public class Array_s {

    public static void main(String[] args) {
        //SOME BASIC THINGS ABOUT ARRAYS
        
        //Array declaration
        String[] fruits = {"banana", "apple","pineapple","orange","coconut"};
        //so we have declare a String data type array "fruits" which contains some values(fruit name).
        
        //Numbering of elements
        //The numbering of array's elements starts from index=0, so if we have an array of N elements,
        //the numbering for first element will be 0 and for the last will be N-1
        
        //Access to an array's element
        //We can access an array element by using array's name followed by element's index inside []
        //Let's try to change element's 1 value(index=0)
        fruits[0]="melon";
        System.out.println(fruits[0]);  //it prints "melon" instead of "banana" that was the initial value
        
        //Length of an array - using property .length
        int length = fruits.length;
        System.out.println(length); //it prints the value 5, which is the number of elements in array fruits
        
        //Printing all the elements of the array
        //We can use the simple for loop as we know
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        
        //Or we can use an enhanced for loop, also known as FOR EACH LOOP
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        
        //Array processing
        //We can process an array by using preconstructed methods of the Class Arrays.
        //Before using any method of Class Arrays, we must import Class Arrays in our program.
        
        //Sorting an array - using sort() method from Class Arrays
        Arrays.sort(fruits); //this promt will sort the elements in alphabetical order because the data type of fruits array is String
        //If we have an int data type array, the sort() method will sort the elements in ascending order 
        //So let's try to print the array's elements by using an enhanced for loop
        System.out.println("Sorted array.");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        
        //Filling an array - using fill()method from Class Arrays
        //This method will fill each element with the same value that we put as argument in fill(argument) method.
        System.out.println("Filling array with the same value.");
        Arrays.fill(fruits, "apple");
        //So if we try to print fruits array, we will see on screen that each element has the same value("apple") 
        //as we put as the second argument in fill() method
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        
        
    }
}
