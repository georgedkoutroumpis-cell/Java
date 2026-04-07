/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructors_oop;

/**
 *
 * @author admin
 */
public class Constructors_OOP {

    public static void main(String[] args) {
        //constructor = a special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial values
        
        //creating objects of Class Student
        //if we want to create objects with unique attributes we have to create a constructor in our Class Student.
        //We are using the constructor Student(String name,int age,double gpa){...}
        Student student1 = new Student("George Koutroumpis", 29, 6.48,"171100");    //We use the first constructor
        Student student2 = new Student("Maria Theodorou");  //we use the second construtor
        Student student3 = new Student("Lefteris ioannou",30); //we use the third constructor
        //                 new Student() => this is the constructor
        //                 and called automatically when we create an object
        
        //As we create the 3 Student objects with arguments, we can display them as we learn previously
        
       //Using the first constructor
       System.out.println("Name: " + student1.name);
       System.out.println("Age: " + student1.age);
       System.out.println("GPA: " + student1.gpa);
       System.out.println("Student ID: " + student1.id);
       student1.isStudying();
       
       //Using the second constructor
       System.out.println("Name: " + student2.name);
       System.out.println("Age: " + student2.age);
       System.out.println("GPA: " + student2.gpa);
       System.out.println("Student ID: " + student2.id);
       student2.isStudying();
       
       //Using the third constructor
       System.out.println("Name: " + student3.name);
       System.out.println("Age: " + student3.age);
       System.out.println("GPA: " + student3.gpa);
       System.out.println("Student ID: " + student3.id);
       student3.isStudying();
        
        
        
        
    }
}
