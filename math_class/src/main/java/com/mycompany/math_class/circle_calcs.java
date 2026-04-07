/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.math_class;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class circle_calcs {
    public static void main(String[] args){
        //circle calculations
        //circle perimeter: 2*Math.PI*radius
        //circle area: Math.PI*Math.pow(radius,2)
        //shpere volume: (4/3)*Math.PI*Math.pow(radius,3)
        double radius;
        double perimeter;
        double area;
        double volume;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t--WELCOME TO CIRCLE CALCULATIONS--");
        
        System.out.print("Please give the radius of the circle: ");
        radius = scanner.nextDouble();
        
        perimeter = 2*Math.PI*radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        
        System.out.println("The circle perimeter is : " + perimeter);
        System.out.println("The circle area is: " + area);
        System.out.println("The volume of the sphere is: " + volume);
        
        
        scanner.close();
    }
}
