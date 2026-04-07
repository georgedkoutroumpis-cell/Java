/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.writing_text_files;

/**
 *
 * @author admin
 */
import java.io.*;

public class Writing_Text_Files {

    public static void main(String[] args) throws IOException{
        //Writing into a text file without buffer
        
        //Creating the FileWriter object for the connection between the output stream and the file
        FileWriter fw = new FileWriter("C:\\Users\\admin\\Documents\\NetBeansProjects\\Writing_Text_Files\\Data1.txt", true);
        
        //Creating the PrintWriter object for writing the data in the output stream
        PrintWriter pw = new PrintWriter(fw);
        
        //Writing the data we want
        pw.print("Hello ");
        pw.print("George!!!\n");
        pw.println(60);
        pw.println(true);
        pw.close();
    }
}
