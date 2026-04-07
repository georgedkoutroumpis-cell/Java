/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weight_converter;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Weight_converter {

    public static void main(String[] args) {
        double weight_lb;
        double weight_kg;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t--WEIGHT CONVERTER--");
        System.out.print("Please pick what type to convert: 1.Kgs || 2.lbs :: ");
        int pick = scanner.nextInt();
        
        if(pick==1){
            System.out.print("Please give the weight in lbs: ");
            weight_lb = scanner.nextDouble();
            weight_kg = weight_lb * 0.45359237;
            System.out.printf("The weight in kilograms(kgs) is: %.2f",weight_kg);
        }else if(pick==2){
            System.out.print("Please give the weight in kgs: ");
            weight_kg = scanner.nextDouble();
            weight_lb = weight_kg / 0.45359237;
            System.out.printf("The weight in pounds(lbs) is: %.2f",weight_lb);
        }else{
            System.out.println("Wrong type!");
        }
        
        scanner.close();
    }
}
