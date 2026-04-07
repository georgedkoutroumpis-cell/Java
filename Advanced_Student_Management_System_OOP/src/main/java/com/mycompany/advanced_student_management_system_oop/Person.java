/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanced_student_management_system_oop;

/**
 *
 * @author admin
 */
public abstract class Person {
    private String name;
    private int age;
    
    //CONCRETE methods
    /*@Override
    public String toString(){
        return "";
    }
    */
    
    void setGrades(double[] grades){
        
    }
    
    void getGrades(){
        
    }
    
    
    //setter
    void setName(String name){
        this.name = name;
    }
    
    void setAge(int age){
        this.age = age;
    }
    
    //getters
    String getName(){
        return this.name;
    }
    
    int getAge(){
        return this.age;
    }
    
}
