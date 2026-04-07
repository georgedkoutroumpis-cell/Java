/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.var_types_convertions;

/**
 *
 * @author admin
 */
public class exercise2 {
    public static void main(String[] args){
        byte b1=1;
        byte b2=2;
        int b3;
        long l=12;
        double d=1.111;
        
        //if thre are types like byte,short,char the calculated value needs int type
        //example
        b3 = b1+b2;     
        System.out.println(b3);
        //we can also do the following
        //byte b3;
        //b3 = (byte)b1+b2;
        //this also warks fine
        
        
        //if there is a long type, then the calculated value needs long type
        //example
        l = l +b3;
        System.out.println(l);
        
        //if the is a double type, then the calculated value needs double type
        //example
        d = d + l;
        System.out.println(d);
    }
}
