/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login_system_using_files;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Login_System_Using_Files {
    
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        boolean exit = false;
        //Welcome message
        
        Login login = new Login();
        
        Register register = new Register();
        
        while(!exit){
            System.out.println("\t- MENU -");
            System.out.println("=========================");
            System.out.println("1. User Login");
            System.out.println("2. Register");
            System.out.println("3. Exit Program");
            System.out.println("=========================");
            System.out.print("Please enter a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 ->{
                            login.checkLogin();
                }
                case 2 ->{
                            register.newRegister();
                }
                case 3 ->{
                            exit = true;
                            System.out.println("Exiting program...");
                }
                default -> System.out.println("Wrong choice on menu. Please pick again(1-3).");
            }
            
        }
        
        scanner.close();
    }
}
