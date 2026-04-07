/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_class;

/**
 *
 * @author admin
 */
public class Triangle extends Shape{
    int base;
    int height;
    
    //constructor
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    
    //Overriding the abstract method area()
    @Override
    double area(){
        return 0.5 * this.base * this.height;
    }
}
