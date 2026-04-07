/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.writing_text_files_using_buffer;

/**
 *
 * @author admin
 */
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Writing_Text_Files_Using_Buffer {

    public static void main(String[] args) throws IOException{
        //Creating FileWriter object
        FileWriter fw = new FileWriter("C:\\Users\\admin\\Documents\\NetBeansProjects\\Writing_Text_Files_Using_Buffer\\Data2.txt",true);
        
        
        //Creating BufferedWriter object
        BufferedWriter bw = new BufferedWriter(fw);
        
        //Creating printWriter object
        PrintWriter pw = new PrintWriter(bw);
        
        pw.println("This is a text file.");
        pw.close();
        
        //Creating path
        Path path = Paths.get("C:\\Users\\admin\\Documents\\NetBeansProjects\\Writing_Text_Files_Using_Buffer\\Data2.txt");
        //BasicFileAttributes
        BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
        //Printing some file attributes
        System.out.println("File " + path.getFileName() + " || Size: " + bfa.size());
        System.out.println("File " + path.getFileName() + " || Created: " + bfa.creationTime());
        System.out.println("File " + path.getFileName() + " || Last Modification: " + bfa.lastModifiedTime());
    }
}
