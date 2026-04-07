/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.string_methods;

/**
 *
 * @author admin
 */
public class String_methods {

    public static void main(String[] args) {
        String name="George";
        //.length() method
        int length = name.length();
        System.out.println(length);
        
        //.charAt() method
        char c;
        c = name.charAt(0);
        System.out.println(c);
        
        //.indexOf()
        int pos;
        pos = name.indexOf("e");
        System.out.println(pos);
        
        //.lastIndexOf()
        pos = name.lastIndexOf("e");
        System.out.println(pos);
        
        //.toUpperCase()
        name = name.toUpperCase();
        System.out.println(name);
        
        //.toLowerCase()
        name = name.toLowerCase();
        System.out.println(name);
        
        //.trim()
        String test="   Let's Go!   ";
        System.out.println(test);
        test = test.trim();
        System.out.println(test);
        
        //.replace()
        //name = name.replace("e","t");
        System.out.println(name);
        
        //.isEmpty()
        String empty="";
        System.out.println("Is the string name empty? " + name.isEmpty());
        System.out.println("Is the string empty empty? " + empty.isEmpty());
        
        //.contains()
        if(name.contains("g")){
            System.out.println("Your name contains g character.");
        }else{
            System.out.println("Your name DOESN'T contain g character.");
        }
        
        //.equals()
        if(name.equals("george")){
            System.out.println("Your name matches.");
        }else{
            System.out.println("You gave wrong name.");
        }
        
        
        //.equalsIgnoreCase()
        if(name.equalsIgnoreCase("GEORGE")){
            System.out.println("Your name matches.");
        }else{
            System.out.println("Your name doesnt match.");
        }
    }
}
