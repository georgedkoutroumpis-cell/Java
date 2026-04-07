/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getters_setters;

/**
 *
 * @author admin
 */
public class Person {
    private final String name;
    private int age;
    
    //constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //getters
    String getName(){
        return this.name;
    }
    
    int getAge(){
        return this.age;
    }
    
    //setter
    void setAge(int age){
        this.age = age;
    }
}
