/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstract_class;

/**
 *
 * @author admin
 */
public class Abstract_class {

    public static void main(String[] args) {
        // ABSTRACT = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features.
        //            Abstract classes CANT'T be instantiated directly.
        //            Can contain 'abstract' methods (which must be implemented || @Override)
        //            Can contain 'concrete' methods (which are inherited)
        
        
        //Shape shape = new Shape(); || We can't create an object of Class Shape cause it's an ABSTRACT CLASS
        
        //Let's create some Circle objects
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);
        
        //Let's create some Triangle objects
        Triangle triangle1 = new Triangle(2,3);
        Triangle triangle2 = new Triangle(4,3);
        
        //Let's create some rectagnle objects
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,6);
        
        
        //Using the override method area() for Circle objects
        System.out.println("The area of circle 1: " + circle1.area());
        System.out.println("The area of circle 2: " + circle2.area());
        
        //Using the override method area() for Triangle objects
        System.out.println("The area of triangle 1: " + triangle1.area());
        System.out.println("The area of triangle 2 " + triangle2.area());
        
        //Using the override method area() for Rectangle objects
        System.out.println("The area of rectangle 1 " + rectangle1.area());
        System.out.println("The area of rectangle 2 " + rectangle2.area());
        
        
        //Using the inherited method display()
        circle1.display();
        circle2.display();
        triangle1.display();
        triangle2.display();
        rectangle1.display();
        rectangle2.display();
    }
}
