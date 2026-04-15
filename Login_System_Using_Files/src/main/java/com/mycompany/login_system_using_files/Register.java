/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_system_using_files;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.io.*;

public class Register {
    Scanner scanner = new Scanner(System.in);
    
    void newRegister(){
        System.out.println("\t- REGISTER FORM -");
        System.out.println("==============================");
        System.out.print("Please enter username: ");
        String username = scanner.nextLine();
        //checking if username already exists
        while(checkIfRegistered(username,0)){
            System.out.println("Username already used. Try another one.");
            System.out.print("Please enter username: ");
            username = scanner.nextLine();
        }
        System.out.print("Please enter password: ");
        String password = scanner.nextLine();
        //checking if password already  exists
        while(checkIfRegistered(password,1)){
            System.out.println("Password already used. Try another one.");
            System.out.print("Please enter password: ");
            password = scanner.nextLine();
        }
        //adding the new Register in Credentials.txt file
        addNewRegister(username,password);
    }
    
    
    boolean checkIfRegistered(String str, int index){
        try{
            FileReader fr = new FileReader("Credentials.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                String[] line_parts = line.split(",");
                if(line_parts[index].equals(str)){
                    return true;
                }
                line = br.readLine();
            }
            
            br.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
        return false;
    }
    
    void addNewRegister(String username, String password){
        try{
            FileWriter fw = new FileWriter("Credentials.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(username + "," + password);
            
            pw.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
}
