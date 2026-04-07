/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tostring_method_overriding;

/**
 *
 * @author admin
 */
public class Car {
    String manufacter;
    String model;
    int year;
    String color;
    
    //constructor
    Car(String manufacter, String model, int year, String color){
        this.manufacter = manufacter;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    
    @Override
    public String toString(){
        return this.manufacter + " " + this.model + " " + this.year + " " + this.color;
    }
}
