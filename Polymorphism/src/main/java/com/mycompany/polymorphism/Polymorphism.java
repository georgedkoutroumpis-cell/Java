/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author admin
 */
public class Polymorphism {

    public static void main(String[] args) {
        
        //polymorphism = "POLY" = "MANY"
        //               "MORPH" = "SHAPES"
        //  Objects can identify as other objects.
        //  Objects can be treated as objects of a common superclass.
        //IN THIS EXAMPLE OF POLYMORPHISM WE USE AN ABSTRACT CLASS AS SUPERCLASS
        //THIS ALSO CAN WORK WITH THE USE OF INTERFACES 
        
        //creating objects of each class
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();
        
        //creating an array of vehicles, which element identifies as an object of its Class and also as a Vehicle object
        //This is polymorphism
        Vehicle[] vehicles = {car,boat,bike};
        
        for(Vehicle vehicle:vehicles){
            vehicle.go();
        }
        
    }
}
