/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reading_text_files_using_buffer;

/**
 *
 * @author admin
 */
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Reading_Text_Files_Using_Buffer {

    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter pw = null;
        
        try{
            FileReader fr = new FileReader("C:\\Users\\admin\\Documents\\NetBeansProjects\\Reading_Text_Files_Using_Buffer\\Data_Reading.txt");
            br = new BufferedReader(fr);
            
            Path path = Paths.get("C:\\Users\\admin\\Documents\\NetBeansProjects\\Reading_Text_Files_Using_Buffer\\Data_Reading.txt");
            BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
            
            //Copying first file Data_Reading.txt to a second file Data_Reading_2.txt
            FileWriter fw = new FileWriter("C:\\Users\\admin\\Documents\\NetBeansProjects\\Reading_Text_Files_Using_Buffer\\Data_Reading_2.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            
        
            System.out.println("Printing file: " + path.getFileName());
            System.out.println("------------------------------------------------------------------------");
            
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                pw.println(line);   //copying each line form Data_Reading.txt to Data_Reading_2.txt
                line = br.readLine();
            }
           
            System.out.println("------------------------------------------------------------------------");
            //Printing some file attributes
            System.out.println("File " + path.getFileName() + " || Size: " + bfa.size());
            System.out.println("File " + path.getFileName() + " || Created: " + bfa.creationTime());
            System.out.println("File " + path.getFileName() + " || Last Time Modified: " + bfa.lastModifiedTime());
            
        }
        catch(IOException ioe){
            System.out.println("Error " + ioe);
        }
        finally{
            pw.close();
            br.close();
        }
        
    }
}
