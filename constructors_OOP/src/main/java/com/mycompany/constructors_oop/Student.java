/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructors_oop;

/**
 *
 * @author admin
 */
public class Student {
    String name;
    String id;
    int age;
    double gpa;
    boolean isEnrolled;
    
    //Constructor
    //name_of_the_Class(arguments){......}
    //the arguments are the values that we put in as we create the current object.
    //So if we would like to create an object of class Student and also would like to initialize it with
    //the values of name,age,gpa, we must include them with their data_type in our constructor declaration
    //such as in the following constructor.
    Student(String name,int age,double gpa,String id){
        //we pass the input arguments of the costructor to current object
        //by using this. keyword
        //is like using object_name.name = name when we construct an object
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.id = id;
    }
    //keyword THIS refers tto the object we are currently working with
    
    //methods
    void isStudying(){
        System.out.println(this.name + " is studying.");
    }
    
    //OVERLOADED CONSTRUCTORS = allow a class to have multiple constructors
    //                          with different parameter lists.(much like overloaded methods)
    //                          Enable objects to be initialized in varius ways
    //So depending the parameters we put as arguments while we create an object,
    //the program will use the corresponding constructor
    
    //Let's see an example
    Student(String name){   //less arguments than first constructor
        this.name = name;
        this.age = 0;
        this.gpa = 0.0;
        this.id = "";
    }
    //So if we try to create an object of the class Student with only the argument "name"
    //the value of age will set as age=0 and the value of gpa will set as gpa=0.0
    
    //Let's see another example
    Student(String name,int age){   //less arguments than first constructor
        this.name = name;
        this.age = age;
        this.gpa=0.0;
        this.id="";
        
    }
}
