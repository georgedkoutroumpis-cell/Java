/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_class;

/**
 *
 * @author admin
 */
public class Rectangle extends Shape{
    int length;
    int width;
    
    //constructor
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    //overriding abstract method area()
    @Override
    double area(){
        return this.length * this.width;
    }
}
