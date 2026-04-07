/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author admin
 */
public class Interfaces {

    public static void main(String[] args) {
        
        //Interface = a blueprint for a class that specifies a set of abstract methods
        //            that implementing classes MUST define.
        //            Supports multiple inheritance-like behavior.
        
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
