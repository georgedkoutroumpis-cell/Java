/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylists;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {

    public static void main(String[] args) {
        //Arraylist = is a resizable array that stores objects(autoboxing).
        //            Arrays are fixed in size, but Arraylists can change.
        
        
        //declaring an Arraylist Object
        ArrayList<String> foods = new ArrayList<>();
        
        //adding elements by using add() method
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Taco");
        
        //we can use the add() method with 2 arguments, the first for the position and the second for the element
        foods.add(3,"Club Sandwich");
        
        //.set(index, element) method - changing the element in index-position
        foods.set(0, "Fish n' Chips"); //position 0 Pizza --> Fish n' Chips
        System.out.println(foods);
        
        //.get(index) - retrieving the element that is in index-position
        System.out.println(foods.get(0));
        
        //arraylist.size() -- returning the size of arraylist
        System.out.println("The size of ArrayList foods is: " + foods.size());
        
        System.out.println("Before removing element " + foods);
        //.remove(index) -- removing the element that refers to index
        foods.remove(0);
        System.out.println("After removing element " + foods);
        //We can remove a number of elements by using the removerange(start_index,end_index) (start till end)
        //foods.removerange(0,2);
        //System.out.println(foods);
        
        
        //We can sort an array by using the method .sort(ArrayList_name) of Framework Collections
        Collections.sort(foods);
        System.out.println(foods);
        
        //We can print ArrayList elements by using a for...each loop or a regular for loop
        //or using just: System.out.println(ArrayList_name)
    }
}
