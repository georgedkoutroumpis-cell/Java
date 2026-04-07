/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.the_static_keyword;

/**
 *
 * @author admin
 */
public class The_static_keyword {

    public static void main(String[] args) {
        //static = makes a variable or method belong to a class rather than ton an object
        //Commonly used for utility methods or shared resources between objects of the same class.
        
        
        Car car1 = new Car("S2000");
        Car car2 = new Car("Mustang");
        Car car3 = new Car("Corvette");
        Car car4 = new Car("Chevelle");
        
        //access to a static variable
        System.out.println("Total car objects " + Car.count_cars);
        
        //access to a static method
        Car.showNumOfCars();
        
    }
}
