/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ternary_operator;

/**
 *
 * @author admin
 */
public class Ternary_operator {

    public static void main(String[] args) {
        //example 1
        int score = 70;
        String passorfail = (score>=60) ? "PASS" : "FAIL";
        System.out.println(passorfail);
        
        //example 2
        int income=30000;
        double tax_rate = (income>=40000) ? 0.25 : 0.15;
        System.out.println("Your tax rate is: " + tax_rate);
    }
}
