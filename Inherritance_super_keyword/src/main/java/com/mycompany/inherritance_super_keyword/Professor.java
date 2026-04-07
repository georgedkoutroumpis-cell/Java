/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inherritance_super_keyword;

/**
 *
 * @author admin
 */
public class Professor extends Person{
    //attributes
    double salary;
    
    //constructor
    Professor(String firstname, String lastname, double salary){
        super(firstname,lastname);  //calling the superclass (Person) constructor
        this.salary = salary;
    }
    
    //methods
    void showSalary(){
        System.out.println("Professor's " + this.firstname + " " +this.lastname + " salary is " + this.salary);
    }
    
}
