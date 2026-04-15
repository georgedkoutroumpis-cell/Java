/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_system_using_files;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    
    private boolean locked = false;
    
    public void checkLogin(){
        int count = 0;
        boolean found = false;
        while(count!=3){
            System.out.println("=================================");
            System.out.println("\t- LOGIN FORM -");
            System.out.println("=================================");
            System.out.println("Effort " + (count+1) + " of 3");
            System.out.println("=================================");
            System.out.print("Please enter username: ");
            String username = scanner.nextLine();
            System.out.print("Please enter password: ");
            String password = scanner.nextLine();
            try{
                FileReader fr = new FileReader("Credentials.txt");
                BufferedReader br = new BufferedReader(fr);
            
                String line = br.readLine();
                while(line!=null){
                    String[] line_parts = line.split(",");
                    if(line_parts[0].equals(username) && line_parts[1].equals(password)){
                        found = true;
                        System.out.println("Successfull Login!");
                        break;
                    }
                    line = br.readLine();
                }
                if(found){
                    break;
                }else{
                    count++;
                }
                
                br.close();
            }catch(IOException ioe){
                System.out.println("Error: " + ioe);
            }
            if(count==3){
                setLocked(true);
                System.out.println("Your Account that refers to username: " + username +  " has been locked.");
            }
        }
    }
    
    void setLocked(boolean lock){
        this.locked = lock;
    }
    
    
    
    
}

