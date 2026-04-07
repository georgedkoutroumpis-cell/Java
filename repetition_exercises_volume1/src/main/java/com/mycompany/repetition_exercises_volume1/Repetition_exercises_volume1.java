/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetition_exercises_volume1;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.Arrays;

public class Repetition_exercises_volume1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0.0;
        double gpa;
        int courses_num;
        double min=10,max=-1;
        System.out.print("Please enter the number of courses: ");
        courses_num = scanner.nextInt();
        System.out.println("========================================");
        
        //creating array of grades
        double[] grades=new double[courses_num];
        //filling array with zeros
        Arrays.fill(grades,0);
        
        for(int i=0 ; i<courses_num ; i++){
            System.out.print("Please enter the grade " + (i+1) + "of" + courses_num + " courses: ");
            grades[i] = scanner.nextDouble();
            //control point about grade: must be >=0 AND <=10
            while(grades[i]<0.0 || grades[i]>10.0){
                System.out.println("The grade must be between 0-10.");
                System.out.print("Please enter the grade " + (i+1) + "of" + courses_num + " courses: ");
                grades[i] = scanner.nextDouble();
            }
            sum +=grades[i];
        }
        
        System.out.println("========================================");
        System.out.println("Your grades: ");
        for(double grade:grades){
            System.out.println("Grade: " + grade);
            //find max and min
            if(grade>max){
                max = grade;
            }else if(grade<min){
                min = grade;
            }
        }
        
        gpa = sum / courses_num;
        System.out.println("========================================");
        System.out.println("Your GPA: " + gpa);
        System.out.println("========================================");
        System.out.println("Your greater grade: " + max);
        System.out.println("========================================");
        System.out.println("You smaller grade: " + min );
        System.out.println("========================================");
        scanner.close();
    }
}
