/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.the_static_keyword;

/**
 *
 * @author admin
 */
public class Car {
    static int count_cars;  //static variable
    String model;
    
    Car(String model){
        this.model = model;
        count_cars++;
    }
    
    //static method
    static void showNumOfCars(){
        System.out.println("You have " + count_cars + " total cars.");
    }
}
