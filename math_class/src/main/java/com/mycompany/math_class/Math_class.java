/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.math_class;

/**
 *
 * @author admin
 */
public class Math_class {

    public static void main(String[] args) {
        //using known math constrants e.g. PI and e
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        //using Math class for known methods
        double result;
        
        result = Math.pow(2, 3);   //power of 2
        result = Math.abs(-5);  //absolute value of -5
        result = Math.sqrt(9);  //square root of 9
        result = Math.round(3.99);
        result = Math.ceil(3.14);   //upper closest integer
        result = Math.floor(3.14);  //lower closest integer
        result = Math.max(10,20);   //find max between 10 and 20
        result = Math.min(10,20);   //find min between 10 and 20
        
        System.out.println(result);
    }
}
