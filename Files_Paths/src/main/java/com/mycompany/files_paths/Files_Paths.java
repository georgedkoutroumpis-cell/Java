/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.files_paths;

/**
 *
 * @author admin
 */
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
import java.nio.file.attribute.*;

public class Files_Paths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creating Path with 2 methods
        //Method 1:
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("C:\\Users\\admin\\Documents\\NetBeansProjects\\Files_Paths");
        //Elements_names              0      1        2             3               4      
        //using them in methods gatNameCount() and getName(int)
        
        
        //Method 2:
        Path path1 = Paths.get("C:\\Users\\admin\\Documents\\NetBeansProjects\\Files_Paths\\A_file.txt");
        //Elements_names              0      1        2             3               4           5
        //using them in methods gatNameCount() and getName(int)
        
        //We can access to path infos with the following methods
        //  - String toString(): returns the path in String.
        //  - Path getFileName(): returns the last name of path list, 
        //                        usually this is the name of the file, but it can also be a folder name.
        //  - int getNameCount(): returns the number of elements that belong to the path.
        //  - Path getName(int): returns the element_name in path 
        //                       that refers to the int argument value(first refers to 0, last to size-1).
        
        //Let's try them
        String path_name_recovery = path1.toString();
        System.out.println("The path is: " + path1);
        System.out.println("The last element_name in path is: " + path1.getFileName());
        System.out.println("The number of elements that belong to path is: " + path1.getNameCount());
        for(int i=0;i<path1.getNameCount();i++){
            System.out.println("The element_name " + (i+1) + " is " + path1.getName(i));
        }
        
        //Converting to Absolute Path
        System.out.print("Please enter file name: ");
        String fname = scanner.nextLine();
        Path fp = Paths.get(fname);
        //Using toAbsolutePath() method to convert previous given path(fp which includes only filename) to an Absolute path
        Path abs_path = fp.toAbsolutePath();
        System.out.println("The absolute path is " + abs_path);
        
        //Testing AccessMode on our file
        try{
            abs_path.getFileSystem().provider().checkAccess(abs_path,READ,WRITE);
            System.out.println("The file " + abs_path.getFileName() + " can be accessed for Reading and Writing.");
        }
        catch(IOException e){
            System.out.println("IOException -- The file " + abs_path.getFileName() + " cannot be accessed.");
        }
        
        
        //GETTING FILES ATTRIBUTES
        try{
            BasicFileAttributes bfa = Files.readAttributes(abs_path, BasicFileAttributes.class);
            System.out.println("File " + abs_path.getFileName() + " || Size: " + bfa.size() + " bytes");
            System.out.println("File " + abs_path.getFileName() + " || Created: " + bfa.creationTime());
            System.out.println("File " + abs_path.getFileName() + " || Last time modified: " + bfa.lastModifiedTime());
        }
        catch(IOException e){
            System.out.println("IOException -- The file " + abs_path.getFileName() + " cannot be accessed.");
        }
        
        
        
        //Deleting a file by using delete(Path) method of Class Files(this method deletes last element in path -- file or folder).
        //If we try to delete a file that is not exist we get an NoSuchFileException.
        //If we try to delete a folder, the folder MUST be EMPTY. 
        //If the file IS NOT EMPTY we get an DirectoryNotEmptyException
        
        try{
            System.out.println("Trying to Delete " + abs_path.getFileName());
            Files.delete(abs_path);
            System.out.println("File deleted successfully.");
        }
        //Exception NoSuchFileException
        catch(NoSuchFileException e){
            System.out.println("NoSuchFileException -- There is no such file or directory to delete.");
        }
        //Exception DirectoryNotEmptyException
        catch(DirectoryNotEmptyException e){
            System.out.println("DirectoryNotEmptyException -- The directory about to delete is not empty.");
        }
        catch(IOException e){
            System.out.println("IOException -- There is not such file or directory");
        }
        
        
        scanner.close();
    }
}
