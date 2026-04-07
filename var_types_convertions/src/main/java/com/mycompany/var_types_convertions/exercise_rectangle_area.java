/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.var_types_convertions;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class exercise_rectangle_area {
    public static void main(String[] args){
        double width=0;
        double height = 0;
        double area=0;
        
        //creating scanner object
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please give the width: ");
        width = scanner.nextDouble();
        
        System.out.print("Please give the height: ");
        height = scanner.nextDouble();
        
        area = width * height;
        System.out.println("The area is: " + area +" cm^2");
        
        
        //closing scanner object
        scanner.close();
    }
}
