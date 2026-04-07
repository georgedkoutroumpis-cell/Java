/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.advanced_student_management_system_oop;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Advanced_Student_Management_System_OOP {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
       // Student student1 = new Student("George Koutroumpis", 29);
       boolean exit = false;
       int count_register = 0;
       
       //creating an array of 10 Person objects(students and teachers)
       Person[] persons = new Person[10];
       
       System.out.println("**********************************************");
       System.out.println("\tSTUDENT MANAGEMENT SYSTEM");
       System.out.println("**********************************************");
       
        while(!exit){
            System.out.println("======================");
            System.out.println("\tMENU");
            System.out.println("======================");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Show Register");
            System.out.println("4. Show Student's Grades");
            System.out.println("5. Exit");
            System.out.println("======================");
            System.out.print("Please enter a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> {addStudent(persons, count_register);
                           count_register++;
                }
                case 2 -> { addTeacher(persons, count_register);
                            count_register++;
                }
                case 3 -> showRegister(persons);
                case 4 -> showStudentGrades(persons);
                case 5 ->{ exit = true;
                           System.out.println("Exiting Program...");
                }
                default -> System.out.println("Wrong choice on menu. Please pick again(1-4).");
            }
            
        }
       
        scanner.close();
    }
    
    static void addStudent(Person[] persons, int register_id){
        System.out.println("*******************************");
        System.out.println("\tAdd student registration.");
        System.out.println("*******************************");
        
        System.out.print("Please enter name of student: ");
        String name = scanner.nextLine();
        System.out.print("Please enter age of student: ");
        int age = scanner.nextInt();
        System.out.print("Please enter number of grades that this student have: ");
        int grades_num = scanner.nextInt();
        
        double[] grades = new double[grades_num];
        System.out.println("Entering grades: ");
        for(int i=0;i<grades_num;i++){
            System.out.print("Please enter grade " + (i+1) + " of " + grades_num + ": ");
            grades[i] = scanner.nextDouble();
        }
        scanner.nextLine();
        persons[register_id] = new Student(name,age);
        persons[register_id].setGrades(grades);
    }
    
    static void showStudentGrades(Person[] persons){
        showRegister(persons);
        System.out.println("\t**********************************************");
        System.out.print("\tPlease enter student's id: ");        
        int id = scanner.nextInt();
        System.out.println("\t**********************************************");
        persons[id-1].getGrades();
    }
    
    static void addTeacher(Person[] persons, int register_id){
        System.out.println("*******************************");
        System.out.println("\tAdd Teacher registration.");
        System.out.println("*******************************");
        
        System.out.print("Please enter name of teacher: ");
        String name = scanner.nextLine();
        System.out.print("Please enter age of teacher: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter salary of teacher: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        
        persons[register_id] = new Teacher(name,age,salary);
    }
    
    static void showRegister(Person[] persons){
        System.out.println("\t**********************************************");
        System.out.println("\t\t\t  REGISTER");
        System.out.println("\t**********************************************");
        for(int i=0;i<persons.length;i++){
            if(persons[i]!=null){
                System.out.println("\t[" + (i+1) + "] " + persons[i].toString());
            }else{
                break;
            }
        }
    }
    
}
