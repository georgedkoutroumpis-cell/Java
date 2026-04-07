/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.substring;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        String email = "test123@gmail.com";
        String username = email.substring(0,7);
        String domain = email.substring(8,17);
        
        System.out.printf("Your email is: %s\n",email);
        System.out.printf("Your username is: %s\n",username);
        System.out.printf("The domain is: %s\n",domain);
        
        
        //second way with use of .indexOf() method
        //using user's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter your email address: ");
        String email2 = scanner.nextLine();
        
        if(email2.contains("@")){
            String username2 = email2.substring(0,email2.indexOf("@"));
            String domain2 = email2.substring(email2.indexOf("@")+1);
            System.out.println("Your email is: " + email2);
            System.out.println("Your username is: " + username2);
            System.out.println("Your emails domain is: " + domain2);
        }else{
            System.out.println("Email must contain @.");
        }
        
        
        
        scanner.close();
    }
}
