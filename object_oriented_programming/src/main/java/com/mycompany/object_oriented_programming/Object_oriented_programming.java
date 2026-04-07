/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.object_oriented_programming;

/**
 *
 * @author admin
 */
public class Object_oriented_programming {

    public static void main(String[] args) {
        
        //object = an entity that holds data(attributes)
        //         and can also perform actions(methods)
        //         It is a reference data type
        
        //we have create an extra class(Car), we will create objects of this class
        Car car1 = new Car();
        
        //we have access in an object's attributes by using => object_name.attribute
        System.out.println(car1.manufacter);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.engine + "cc");
        
        //we can also have access in an object's method by using => object_name.method()
        car1.isRunning();
        car1.drive();
    }
}
