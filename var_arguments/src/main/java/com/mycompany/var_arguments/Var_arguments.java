/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.var_arguments;

/**
 *
 * @author admin
 */
public class Var_arguments {

    public static void main(String[] args) {
        //var arguments or varargs = allows a method to accept a varying number of arguments(parameters),
        //                           makes methods more flexible, no nedd for overloaded methods,
        //                           java will pack the arguments into an array (data_type... array_name) (ellipsis)
        
        //So lets try to add some numbers and get the sum os them
        //we call our method add()
        System.out.println("The sum of inserted elements: " + add(1,2,3)); 
        //we can call our method add() with a variety of arguments
        //these arguments save as elements of an array, its data_type must be same as the data_type of arguments
    }
    
    static int add(int... numbers){
        int sum=0;
        for(int number:numbers){
            sum +=number;
        }
        System.out.println("Elements that inserted in our method: " + numbers.length);
        return sum;
    }
}
