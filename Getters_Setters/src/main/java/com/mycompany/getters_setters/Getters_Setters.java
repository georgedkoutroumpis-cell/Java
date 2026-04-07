/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.getters_setters;

/**
 *
 * @author admin
 */
public class Getters_Setters {

    public static void main(String[] args) {
        
        Person person = new Person("George", 29);
        
        //We initialze person's age by value 29
        //We are changing person's age by using setter method to value 30
        //So when we display person's attributes, it will print on screen value 30
        person.setAge(30);
        
        //printing Person object person's attributes by using gettter methods
        System.out.println(person.getName() + " is " + person.getAge() + " years old");
    }
}
