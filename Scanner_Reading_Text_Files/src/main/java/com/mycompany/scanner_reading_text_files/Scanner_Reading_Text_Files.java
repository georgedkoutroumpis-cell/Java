/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scanner_reading_text_files;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.io.*;

public class Scanner_Reading_Text_Files {

    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("C:\\Users\\admin\\Documents\\NetBeansProjects\\Scanner_Reading_Text_Files\\Data_Scanner_Read.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        
        scanner.close();
    }
}
