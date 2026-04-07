/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.variable_scope;

/**
 *
 * @author admin
 */
public class Variable_scope {
    static int x = 3; //CLASS
    public static void main(String[] args) {
        //variable scope = where a variable can be accessed
        
        //CASE 1: only local variables
        //a LOCAL variable can be accessed only by the method that belongs
        //So the the first System.out.println(x); in main() method will print on screen 1, that is the local variable x of this method
        //And the second System.out.println(x); in doSomething() method will print on screen 2, that is the local variable x of this method
        
        int x = 1;  //LOCAL
        System.out.println(x);
        doSomething();
        
        //CASE 2: only CLASS variable
        //A CLASS variable can declared inside a class and can be accessed by everything that contained in a class
        //If we have a CLASS variable e.g. x = 3;, and there are no other local variables with name x in the main() and doSomething() methods
        //then the methods will use(access) the CLASS variable x=3;.
        //So in this case, the first System.out.println(x); in main() method will print on screen the value 3 
        //and the second System.out.println(x); in method doSomething() will print on screen also the value 3.
        
        
        //CASE 3: CLASS and LOCAL variables with the same name(e.g. x)
        //In this case, Java prefers to use first the LOCAL variables x.
        //So the first System.out.println(x); in method main() will print on screen the value 1(LOCAL variable of this method), 
        //and the second System.out.println(x); in the doSomething() method will print on screen the value 2(LOCAL variable of this method)
    }
    
    static void doSomething(){
        int x = 2;  //LOCAL
        System.out.println(x);
    }
}
