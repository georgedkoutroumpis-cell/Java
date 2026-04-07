/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrix_operation_tools;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Matrix_operation_tools {

    public static void main(String[] args) {
        System.out.println("WELCOME TO MATRIX OPERATION TOOLS");
        Scanner scanner = new Scanner(System.in);
        boolean exit=false;
        
        System.out.println("First, you must enter two matrixes dimensions.");
        System.out.print("Please enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine();
        
        int[][] array_A = new int[rows][columns];
        int[][] array_B = new int[rows][columns];
        int[][] combined = new int[rows][columns];
        
        //inserting elements of each matrix
        //matrix1
        System.out.println("Insert elements for Array_A:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Element [" + (i+1) + "]" + "[" +(j+1) + "]: ");
                array_A[i][j] = scanner.nextInt();
            }
        }
        
        //matrix2
        System.out.println("Insert elements for Array_B:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Element [" + (i+1) + "]" + "[" +(j+1) + "]: ");
                array_B[i][j] = scanner.nextInt();
            }
        }
        
        
        //printing arrays
        System.out.println("******************");
        System.out.println("\tARRAY A");
        System.out.println("******************");
        for(int[] arr:array_A){
            for(int num:arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("******************");
        System.out.println("\tARRAY B");
        System.out.println("******************");
        for(int[] arr:array_B){
            for(int num:arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        
        
        while(!exit){
            System.out.println("***********************************");
            System.out.println("\t\tMENU");
            System.out.println("***********************************");
            System.out.println("\t1. Add two matrix");
            System.out.println("\t2. Find max");
            System.out.println("\t3. Sum of each row");
            System.out.println("\t4. Sum of each column");
            System.out.println("\t5. Exit");
            System.out.print("Please pick a menu choice: ");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1 -> {combined = addMatrix(array_A,array_B,rows,columns) ;
                           System.out.println("***********************************************");
                           System.out.println("Combined Matrix - From adding the two initial matrix:");
                           System.out.println("***********************************************");
                           for(int[] comb:combined){
                               for(int num:comb){
                                   System.out.print(num + " ");
                               }
                               System.out.println();
                           }
                }
                case 2 -> findMaxElement(combined);
                case 3 -> {sumOfRow(combined);
                }
                case 4 -> sumOfColumn(combined,rows,columns) ;
                case 5 -> exit=true;
                default -> System.out.println("Wrong choice on Menu. Please pick again!");
            }
            
        }
        
        
        scanner.close();
    }
    
    static int[][] addMatrix(int[][] array_A,int[][] array_B,int rows,int columns){
        int[][] combined = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                combined[i][j] = array_A[i][j] + array_B[i][j];
            }
        }
        return combined;
    }
    
    static void sumOfRow(int[][] combined){
        int count=1;
        int sum=0;
        for(int[] row:combined){
            for(int num:row){
                sum += num;
            }
            System.out.println("Sum of Row " + count + ": " + sum);
            count++;
            sum=0;
        }
    }
    
    static void findMaxElement(int[][] combined){
        int max=-1;
        for(int[] row:combined){
            for(int num:row){
                if(num>max){
                    max = num;
                }
            }
        }
        System.out.printf("The max-value element: %d\n",max);
    }
    
    static void sumOfColumn(int[][] combined,int rows,int columns){
        int sum=0;
        int count=1;
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                sum += combined[j][i];
            }
            System.out.printf("Sum of Column %d: %d\n",i+1,sum);
            sum=0;
            count++;
        }
    }
}
