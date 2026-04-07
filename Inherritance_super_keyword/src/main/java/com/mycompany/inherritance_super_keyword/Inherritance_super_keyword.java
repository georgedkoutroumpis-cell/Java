/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inherritance_super_keyword;

/**
 *
 * @author admin
 */
public class Inherritance_super_keyword {

    public static void main(String[] args) {
        //super = refers to the parent class(known as superclass || child class also known as subclass)
        //        Used in constructors and method overriding
        //        Calls the parent(superclass) constructor to initialize attributes
        
        //creating 2 Student objects
        Student student1 = new Student("George","Koutroumpis",6.43);
        Student student2 = new Student("Maria","Iasonidou",7.54);
        
        //creating 1 Professor object
        Professor professor1 = new Professor("Kostas","Papakonstantinou",55000.00);
        
        //using methods for Person objects || Every student and professor is a Person object
        student1.showName();
        student2.showName();
        professor1.showName();
        
        //using methods for Student objects
        student1.showGpa();
        student2.showGpa();
        
        //using methods for Professor objects
        professor1.showSalary();
        
        
    }
}
