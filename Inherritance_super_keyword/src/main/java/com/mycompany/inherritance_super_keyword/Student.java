/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inherritance_super_keyword;

/**
 *
 * @author admin
 */
public class Student extends Person{
    //attributes
    double gpa;
    
    //constructor
    Student(String firstname, String lastname, double gpa){
        super(firstname,lastname);  //calling the superclass(Person) constructor
        this.gpa = gpa;
    }
    
    //methods
    void showGpa(){
        System.out.println("Student's " + this.firstname + " " + this.lastname + " gpa is " + this.gpa);
    }
}
