/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myfirstproject;

/**
 *
 * @author admin
 */
public class MyFirstProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I like pizza!");
        
        //variables - 1)declaration, 2)assignment
        /*
        Two types of variables:
            1)Primitive: int,double,char,boolean    simple values stored directly in memory(stack)
            
            2)Reference: string,array,object (memory addresses(stack) that point to heap)
        
        */
        //integers
        int age;    //declaration
        age = 20;   //assignment
        int year = 2026;
        //printing text with variable value
        System.out.println("Age: " + age);
        System.out.println("The year is " + year);
        
        //double
        double grade;
        grade =8.5;
        System.out.println("The grade is " + grade);
        
        //char
        char c;
        c = 'a';
        System.out.println("The character is " + c);
        
        //boolean
        boolean is_student = true;  //or false
        System.out.println("The fact that George is a student is " + is_student);
        
        if(is_student){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }
        
        //Strings
        String name="George Dimitriou";
        String surname="Koutroumpis";
        System.out.println("Hello " + name + " " + surname);
        
        //combining variables in single output
        System.out.println(name + "'s grade is " + grade);
        
        
    }
}
