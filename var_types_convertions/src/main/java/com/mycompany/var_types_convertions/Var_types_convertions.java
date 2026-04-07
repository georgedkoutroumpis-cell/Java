/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.var_types_convertions;

/**
 *
 * @author admin
 */
public class Var_types_convertions {

    public static void main(String[] args) {
        int i;
        short s=25;
        byte b;
        float f=0.01f;
        double d;
        
        //converting short to integer cause short(BYTES) < integer(bytes)
        //this method includes all data types
        i = s;
        System.out.println(i);
        
        //if we would like to convert integer to short it must be like [ in case that the type that we want to convert is smaller(bytes) than the the type our variable is ]:
        //this method includes all data types
        //s = (short)i;
       
        b = (byte)s;    //byte<short so we use the method: (type) val
        System.out.println(b);
        
        
        
        //double-float example
        d = f;  //double>float
        System.out.println(d);
        
        //integer-double example
        i = (int)d;
        System.out.println(i);
    }
}
