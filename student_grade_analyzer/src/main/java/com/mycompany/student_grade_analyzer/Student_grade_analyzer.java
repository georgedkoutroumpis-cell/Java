/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_grade_analyzer;

/**
 *
 * @author admin
 */
import java.util.Scanner;



public class Student_grade_analyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the number of students: ");
        int num_students = scanner.nextInt();
        scanner.nextLine();
        
        int[][] grades = new int[num_students][];
        double[] avg_grades = new double[num_students];
        int sum=0;
        int count=0;
        
        for(int i=0;i<num_students;i++){
            System.out.print("Please enter the number of courses of student " + (i+1) + ": ");
            grades[i] = new int[scanner.nextInt()];
            scanner.nextLine();
        }
        //insert grades for each student
        for(int i=0;i<num_students;i++){
            System.out.println("**************************************");
            System.out.println("Student " + (i+1) + " Grades:");
            System.out.println("**************************************");
            for(int j=0;j<grades[i].length;j++){
                System.out.print("Please enter grade " + (j+1) + " of " + (grades[i].length) + " for student " +(i+1) + ": ");
                grades[i][j] = scanner.nextInt();
                sum += grades[i][j];
            }
            avg_grades[i] = sum/grades[i].length;  //average of grades for each student
            sum=0;
        }
        
        System.out.println("**************************************");
        System.out.println("\t\tGRADES");
        System.out.println("**************************************");
        for(int i=0;i<num_students;i++){
            System.out.printf("Student [%d]: [ ",i+1);
            for(int j=0;j<grades[i].length;j++){
                System.out.printf("%d ",grades[i][j]);
            }
            System.out.printf(" || GPA: %.2f",avg_grades[i]);
            System.out.printf("]\n");
        }
        
        for(double avg:avg_grades){
            if(avg>=5.0){
                count++;
            }
        }
        System.out.println("Number of Students that have GPA>5.0: " + count);
        
        scanner.close();
    }
}
