/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.print_f;

/**
 *
 * @author admin
 */
public class Print_f {

    public static void main(String[] args) {
        String name="George";
        int age=29;
        double gpa=6.48;
        double price = -54.01;
        double price2= 10000;
        boolean is_student=true;
        
        //printf() is a method used to format output
        
        //%[flags][width][.precision][specifier-character]
        
        
        //%[specifier-character] examples
        System.out.println();
        System.out.println("These are %[specifier-charater] examples");
        System.out.printf("Hello %s\n",name);
        System.out.printf("You are %d years old.\n",age);
        System.out.printf("Your gpa is %.2f\n",gpa);
        System.out.printf("Student activity: %b\n",is_student);
        
        System.out.printf("%s is %d years old.\n",name,age);
        
        //%[.precision] examples - the amount of decimal digits that shown on screen
        System.out.println("\nThese are %[.precision examples].");
        System.out.printf("%.1f\n",gpa); //gpa=6.48, we put 1decimal digit, so we round up the decimal section of number
        System.out.printf("%.2f\n",gpa); //gpa=6.48, we put 2-decimal digits precision, number as it be
        System.out.printf("%.3f\n",gpa); //gpa=6.48, we put 3-decimal digits precision, number on screen: 6.480
        
        
        //%[flags] examples
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers enclosed in ()
        // space = display a minus if negative, space if positive
        System.out.println();
        System.out.println("These are %[flags] examples.");
        System.out.printf("+ flag:: %+.2f\n",gpa);
        System.out.printf(", flag:: %,.2f\n",price2);
        System.out.printf("( flag:: %(.2f\n",price);
        System.out.printf("space flag(positive-space):: % .2f\n",gpa);
        System.out.printf("space flag(negative-minus):: % .2f\n",price);
        
        
        //%[width] examples
        //0 = zero padding
        //positive number = right justified padding
        //negative number = left justified padding
        System.out.println();
        System.out.println("These are %[width] examples");
        int num1 = 1;
        int num2 = 23;
        int num3 = 456;
        int num4 = 7890;
        System.out.println("%0pos-num :: (zero) padding example:");
        System.out.printf("%04d\n",num1);
        System.out.printf("%04d\n", num2);
        System.out.printf("%04d\n", num3);
        System.out.printf("%04d\n",num4);
        
        System.out.println("%pos-num d :: right justified padding: ");
        System.out.printf("%4d\n",num1);
        System.out.printf("%4d\n",num2);
        System.out.printf("%4d\n",num3);
        System.out.printf("%4d\n",num4);
        
        
        System.out.println();
        System.out.println("%neg-num :: left justified padding:");
        System.out.printf("%-4d\n",num1);
        System.out.printf("%-4d\n",num2);
        System.out.printf("%-4d\n",num3);
        System.out.printf("%-4d\n",num4);
    }
}
