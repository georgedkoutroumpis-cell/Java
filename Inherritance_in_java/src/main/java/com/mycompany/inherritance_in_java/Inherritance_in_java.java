/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inherritance_in_java;

/**
 *
 * @author admin
 */
public class Inherritance_in_java {

    public static void main(String[] args) {
        
        //inherritance = One class inherits the attributes and methods from another class.
        // class Child <- class Parent <- class Grandparent
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();
        
        //access to an inherritanced attribute
        System.out.println("Is the dog alive? Answer: " + dog.isAlive);
        System.out.println("Is the cat alive? Answer: " + cat.isAlive);
        //access to an inherritanced method
        dog.eat();
        cat.eat();
        
        plant.photosynthesize();
        System.out.println("Is plant alive? Answer: " + plant.isAlive);
        
        //If we see each class is like creating a tree
        /*
                                Organism    (isAlive attribute)
                                    |
                                    |
                                __________                                              |
                               |          |                                             |
                             Plant      Animal      (isAlive attribute)                 |   (Inherritance)
               (isAlive attribute)        |         (eat() method)                      |   Top to bottom
               (photosynthsize())         |                                             |
                                    ______________                                      |
                                   |              |                                     
                                   |              |
                                  Dog            Cat
                      (isAlive attribute)    (isAlive attribute)
                      (eat() method)         (eat() method)
        
        */
        
    }
}
