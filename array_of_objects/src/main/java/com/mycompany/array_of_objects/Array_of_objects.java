/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array_of_objects;

/**
 *
 * @author admin
 */
public class Array_of_objects {

    public static void main(String[] args) {
        //creating some Car objects
        Car car1 = new Car("AE-86","red");
        Car car2 = new Car("205 GTI" ,"white");
        Car car3 = new Car("306 Maxi","black");
        
        //using driving() method
        car1.driving();
        car2.driving();
        car3.driving();
        
        //We can create an array of objects as we learn previously
        //data_type[]([][]-optional for 2D arrays) array_name
        //Car[] cars = new Car[3]; => we choose to create 3-elements array
        
        //But we can also create an array by using the names of the created objects that is same data_type as our array of objects
        Car[] cars = {car1,car2,car3};
        
        //we can also initialize our array by using the constructor
        //Car[] cars = {new Car("AE-86","red"),new Car("205 GTI" ,"white"),new Car("306 Maxi","black")};
        //Constructing a new object without giving it a unique identifier like car1,car2 or car3
        //these call anonymous objects
        
        //Using a for each loop for using the method driving() for each object in our array
        for(Car car:cars){
            car.driving();
        }
    }
}
