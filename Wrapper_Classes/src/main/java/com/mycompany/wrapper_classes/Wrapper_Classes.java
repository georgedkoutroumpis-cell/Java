/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wrapper_classes;

/**
 *
 * @author admin
 */
public class Wrapper_Classes {

    public static void main(String[] args) {
        //Wrapper classes = Allow primitive values(int, double, char, boolean etc)
        //                  to be used as object. "Wrap them in an object".
        //                  Generally, don't wrap primitives unless you nees an object.
        //                  Allows use of Collections Framework and static Utility Methods.
        
        //Autoboxing - Creating a Wrapper Class Object
        Integer a = 123;
        Double b = 3.14;
        
        //Unboxing - Wrapper Class Object to Premitive Data Type
        int a_int = a;
        double b_double = b;
        
        //Let's try to print them
        System.out.println("Wrapper Class Integer Object: " + a + " || Primitive Data Type(int): " + a_int);
        System.out.println("Wrapper Class Double Object: " + b + " || Primitive Data Type(double): " + b_double);
        
        
        //Wrapper Classes have some Utility Methods
        
        //UTILITY METHOD TOSTRING() -- If we want to convert a Wrapper Class(primitive) data type to a String we can use the toString() method
        // String var_name = Wrapper_Class.toString(value); --> the value must be same data type as Wrapper Class
        String a_str = Integer.toString(123);
        String b_str = Double.toString(3.14);
        String c_str = Character.toString('@');
        String d_str = Boolean.toString(true);
        
        //Let's try to print them
        System.out.println(a_str + " " + b_str + " " + c_str + " " + d_str);
        
        
        //Utility method parse_() -- if we want to convert a String to a primitive data type
        int aa = Integer.parseInt("123");
        double bb = Double.parseDouble("3.14");
        boolean dd = Boolean.parseBoolean("true");
        //for converting to char we don't have a parse_ method
        //We use the charAt(index) method, which returns the character that refers to index value
        char cc = "Pizza".charAt(0);
        
        System.out.println("aa: " + aa + "|| bb: " + bb + "|| cc: " + cc + "|| dd: " + dd);
        
        
        //Utility methods for Character Wrapper class
        char ch1 = 'B';
        char ch2 = '@';
        
        //isLetter(arg) - checking if argument(char) is letter/ returns true/false
        if(!Character.isLetter(ch2)){
            System.out.println("THe chaeracter ch2 is not a letter.");
        }
        
        //isUpperCase(arg) - checking if argument(char) is Uppercase or not / returns true/false
        if(Character.isUpperCase(ch1)){
            System.out.println("the character ch1 is UpperCase");
        }
    }
}
