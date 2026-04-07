/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nested_loops;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Nested_loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows,columns;
        
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol to fill in: ");
        String symbol = scanner.next();
        
        for(int i=0;i<rows;i++){
            System.out.println();
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            }
        }
        
        
        
        scanner.close();
    }
}
