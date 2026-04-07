/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management_system_oop;

/**
 *
 * @author admin
 */
public class Student {
    //attributes
    String name;
    double[] grades;
    double gpa;
    
    //constructor
    Student(String name,double[] grades){
        this.name = name;
        this.grades = grades;
    }
    
    //methods
    void showStudents(){
        System.out.println("Name: " + this.name);
        System.out.print("Grades: [ ");
        for(int i=0;i<this.grades.length;i++){
            System.out.print(grades[i] + " ");
        }
        System.out.print("]\n");
        System.out.println("GPA: " + this.gpa);
    }
    
    void gpaCalc(){
        double sum=0;
        for(int i=0;i<this.grades.length;i++){
            sum += this.grades[i];
        }
        this.gpa = sum / this.grades.length;
        System.out.println("GPA: " + this.gpa);
    }
}
