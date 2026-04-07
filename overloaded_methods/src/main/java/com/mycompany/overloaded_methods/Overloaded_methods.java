/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overloaded_methods;

/**
 *
 * @author admin
 */

public class Overloaded_methods {

    public static void main(String[] args) {
        
        //overloaded methods = are methods that share the same name
        //                     but they have different paramaters
        //                     signature = name + parameters
        
        //example 1 - overloaded methods
        double result;
        double num_a = 3;
        double num_b = 4;
        double num_c = 1;
        
        result = add(num_a,num_b);
        
        //if we want to use result = add(num_a, num_b,num_c);
        //the compiler will complain
        //So one solution is to create a second method add() with 3 parameters
        //these methods will call overloaded methods
        
        result = add(num_a,num_b,num_c);
        
        System.out.println(result);
    }
    
    static double add(double a, double b){
        return a+b;
    }
    
    static double add(double a,double b,double c){
        return a+b+c;
    }
}
