/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inherritance_method_overriding;

/**
 *
 * @author admin
 */
public class Fish extends Animal{
    //overriding move() method
    //We override a method from the superclass so we can have a specific implementation of this method for subclass objects
    //In our case we override move() method from Class Animal so we can print a different message.
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}
