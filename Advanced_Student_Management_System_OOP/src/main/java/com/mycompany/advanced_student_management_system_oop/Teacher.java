/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanced_student_management_system_oop;

/**
 *
 * @author admin
 */
public class Teacher extends Person{
    int salary;
    
    //constructor
    Teacher(String name, int age, int salary){
        this.setName(name);
        this.setAge(age);
        this.salary = salary;
    }
    
    
    @Override
    public String toString(){
        return "Teacher: " + this.getName() + " || Age: " + this.getAge() + " || Salary: " + this.salary;
    }
}
