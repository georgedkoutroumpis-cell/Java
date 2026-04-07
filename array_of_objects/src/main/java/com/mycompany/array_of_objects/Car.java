/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array_of_objects;

/**
 *
 * @author admin
 */
public class Car {
    //attributes
    String model;
    String color;
    
    //constructor
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    
    //methods
    void driving(){
        System.out.println("You are driving a " + this.color + " " + this.model);
    }
}
