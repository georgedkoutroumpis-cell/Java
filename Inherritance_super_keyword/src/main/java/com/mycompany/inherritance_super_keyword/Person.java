/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inherritance_super_keyword;

/**
 *
 * @author admin
 */
public class Person {
    //attributes
    String firstname;
    String lastname;
    
    //constructor
    Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    //methods
    void showName(){
        System.out.println(this.firstname + " " + this.lastname);
    }
}
