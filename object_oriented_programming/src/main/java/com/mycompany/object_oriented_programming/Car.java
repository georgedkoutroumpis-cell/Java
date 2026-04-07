/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.object_oriented_programming;

/**
 *
 * @author admin
 */
public class Car {
    //atributes
    String manufacter = "Toyota";
    String model = "Corolla-AE86";
    int year =1986;
    int engine = 1600;
    
    //methods
    void isRunning(){
        System.out.println("The " + this.model +" is running perfectly.");
        //this keyword is like using object_name.model
        //in our example is like using car1.model
    }
    
    void drive(){
        System.out.println("You drive " + model);
    }
}
