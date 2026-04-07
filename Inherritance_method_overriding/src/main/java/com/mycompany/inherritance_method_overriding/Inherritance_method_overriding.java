/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inherritance_method_overriding;

/**
 *
 * @author admin
 */
public class Inherritance_method_overriding {

    public static void main(String[] args) {
        
        //Method overriding = when a subclass provides its own implementation  of a method that is already defined in superclass.
        //Allows for code reusability and give specific implementations
        
        //Let's create some objects
        Dog dog = new Dog();
        Fish fish = new Fish();
        
        //Now, let's try to call method move() from superclass
        dog.move();
        fish.move();
        //it will print on our screen "This animal is running" for the dog and fish objects
        //But if we override move() method for the Fish class
        //it will print on screen "This animal is running" for dog object
        //and "This animal is swimming" for fish object
        
    }
}
