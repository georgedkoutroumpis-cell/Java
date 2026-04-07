/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logical_operators;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Logical_operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //username must be 4-12 characters
        //username could not contain spaces or underscores
        
        String username;
        boolean userOk = true;
        
        System.out.print("Enter the username: ");
        username = scanner.nextLine();
        
        if(username.length()<4 && username.length()>12){
            System.out.println("The username name must be 4-12 characters.");
            userOk = false;
        }
        if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain spaces or underscores.");
            userOk = false;
        }
        
        if(userOk){
            System.out.println("Your username: " + username + " is OK.");
        }
        
        scanner.close();
    }
}
