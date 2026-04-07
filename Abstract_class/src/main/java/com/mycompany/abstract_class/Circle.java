/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_class;

/**
 *
 * @author admin
 */
public class Circle extends Shape{
    
    double radius;
    
    //constructor
    Circle(double radius){
        this.radius = radius;
    }
    
    //Overriding the abstract method area()
    @Override
    double area(){
        return Math.PI * this.radius * this.radius;
    }
}
