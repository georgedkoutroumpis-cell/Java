/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanced_student_management_system_oop;

/**
 *
 * @author admin
 */
public class Student extends Person{
    double[] grades;
    double gpa;
    
    //constructor
    Student(String name, int age){
        this.setName(name);
        this.setAge(age);
        this.gpa = 0.0;
    }
    
    //methods
    //getters
    @Override
    void getGrades(){
        int i=1;
        System.out.println("\tStudent's " + this.getName() + " grades: ");
        for(double grade:this.grades){
            System.out.println("\t\tGrade[" + i + "]: " + grade);
            i++;
        }
    }
    
    
    //setters
    @Override
    void setGrades(double[] grades){
        double sum =0.0;
        this.grades = grades;
        for(double grade:this.grades){
            sum += grade;
        }
        this.gpa = sum/this.grades.length;
    }
    
    @Override
    public String toString(){
        return "Student: " + this.getName() + " || Age: " + this.getAge() + " || GPA: " + this.gpa;
    }
}
