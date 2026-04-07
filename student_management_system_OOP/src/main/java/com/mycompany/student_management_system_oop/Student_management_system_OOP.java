/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_management_system_oop;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Student_management_system_OOP {
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        boolean exit=false;
        int count=0;
        
        System.out.println("***************************************************");
        System.out.println("\tWELCOME TO STUDENTS MANAGEMENT SYSTEM");
        System.out.println("***************************************************");
        
        System.out.print("How many students would you like to add: ");
        int num = scanner.nextInt();
        Student[] student_system = new Student[num];
        
        while(!exit){
            System.out.println("\t====================");
            System.out.println("\t\tMENU");
            System.out.println("\t====================");
            System.out.println("\t1. Add student");
            System.out.println("\t2. GPA Calculation");
            System.out.println("\t3. Top Student");
            System.out.println("\t4. Search a student(by name)");
            System.out.println("\t5. Show Catalog");
            System.out.println("\t6. Exit");
            System.out.println();
            System.out.print("Please pick a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> { addStudent(student_system,count);
                            count++;}
                case 2 -> gpaCalculation(student_system,count);
                case 3 -> findTopStudent(student_system);
                case 4 -> searchStudent(student_system);
                case 5 -> showCatalog(student_system,count);
                case 6 -> exit=true;
                default -> System.out.println("Wrong choice on menu. Please pick again(1-5).");
            }
        }
        
        
        scanner.close();
    }
    
    static void addStudent(Student[] student_system,int student_id){
        System.out.print("Please enter the name of the student: ");
        String name = scanner.nextLine();
        System.out.print("How many grades would you like to add: ");
        int grades_num = scanner.nextInt();
        scanner.nextLine();
        
        //inserting grades
        double[] grades = new double[grades_num];
        
        for(int i=0;i<grades_num;i++){
            System.out.print("Please enter grade " + (i+1) + " of " + grades_num + ": ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        //creating new object
        student_system[student_id] = new Student(name,grades);
        
        
    }
    
    static void showCatalog(Student[] student_system, int student_id){
        for(int i=0;i<student_id;i++){
            student_system[i].showStudents();
        }
    }
    
    static void gpaCalculation(Student[] student_system, int student_id){
        for(int i=0;i<student_id;i++){
            student_system[i].gpaCalc();
        }
    }
    
    static void findTopStudent(Student[] student_system){
        double top =-0.1;
        int found = 0;
        for(int i=0;i<student_system.length;i++){
            if(student_system[i].gpa>top){
                top = student_system[i].gpa;
                found = i;
            }
        }
        System.out.println("The Top student is: " + student_system[found].name + " with GPA: " + top);
    }
    
    static void searchStudent(Student[] student_system){
        System.out.println("SEARCHING A STUDENT");
        System.out.print("Please enter the name: ");
        String name = scanner.nextLine();
        for(Student student:student_system){
            if(name.equals(student.name)){
                System.out.println("Student found: Name: " + student.name + " || GPA: " + student.gpa);
            }
        }
    }
    
}
