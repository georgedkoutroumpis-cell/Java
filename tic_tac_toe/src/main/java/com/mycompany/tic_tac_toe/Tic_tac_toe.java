/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tic_tac_toe;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.Arrays;

public class Tic_tac_toe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] arena = new String[3][3];
        boolean winner =false;
        boolean full =false;
        int count=0;
        int coordinate_X, coordinate_Y;
       
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arena[i][j] = "-";
            }
        }
        
        
        while(!winner && !full){
            for(String[] row:arena){
                for(String elem:row){
                    System.out.print(elem + "|");
                }
                System.out.println();
            }
            
            if(count%2==0){
                System.out.println("-- Player's 1 turn (X) --");
                System.out.print("Please enter coordinate X: ");
                coordinate_X = scanner.nextInt();
                System.out.print("Please enter coordinate Y: ");
                coordinate_Y = scanner.nextInt();
                arena[coordinate_X-1][coordinate_Y-1] = "X";
            }else{
                System.out.println("-- Player's 2 turn (O) --");
                System.out.print("Please enter coordinate X: ");
                coordinate_X = scanner.nextInt();
                System.out.print("Please enter coordinate Y: ");
                coordinate_Y = scanner.nextInt();
                arena[coordinate_X-1][coordinate_Y-1] = "O";
            }
            
            //checking for winner
            winner = checkWinner(arena);
            if(count%2==0){
                System.out.println("WINNER PLAYER X");
            }else{
                System.out.println("WINNER PLAYER O");
            }
            
            //checking if arena is full
            full = checkIfFull(arena);
            if(full){
                System.out.println("NO WINNER. THE TABLE IS FULL.");
            }
            count++;
        }
        
        scanner.close();
    }
    
    static boolean checkIfFull(String[][] arena){
        int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arena[i][j].equals("X") || arena[i][j].equals("O")){
                    count++;
                }
            }
        }
        if(count==9){
            return true;
        }else{
            return false;
        }
    }
    
    static boolean checkWinner(String[][] arena){
        int count_row_X=0;
        int count_row_O=0;
        int count_column_X=0;
        int count_column_O=0;
        int count_diagonal_X_m=0;
        int count_diagonal_O_m=0;
        int count_diagonal_X_nm=0;
        int count_diagonal_O_nm=0;
        
        //checking rows
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arena[i][j].equals("X")){
                    count_row_X++;
                }else if(arena[i][j].equals("O")){
                    count_row_O++;
                }
            }
            if(count_row_X==3 || count_row_O==3){
                return true;
            }
            count_row_X=0;
            count_row_O=0;
        }
        //checking columns
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arena[j][i].equals("X")){
                    count_column_X++;
                }else if(arena[j][i].equals("O")){
                    count_column_O++;
                }
            }
            if(count_column_X==3 || count_column_O==3){
                return true;
            }
            count_column_X=0;
            count_column_O=0;
        }
        //checking diagonal lines
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //main diagonal
                if(i==j){
                    if(arena[i][j].equals("X")){
                        count_diagonal_X_m++;
                    }else if(arena[i][j].equals("O")){
                        count_diagonal_O_m++;
                    }
                }
                if(i==0 && j==2){
                    if(arena[i][j].equals("X")){
                        count_diagonal_X_nm++;
                    }
                    if(arena[i][j].equals("O")){
                        count_diagonal_O_nm++;
                    }
                }
                if(i==2 && j==0){
                    if(arena[i][j].equals("X")){
                        count_diagonal_X_nm++;
                    }
                    if(arena[i][j].equals("O")){
                        count_diagonal_O_nm++;
                    }
                }
            }
        }
        if(count_diagonal_X_m==3 || count_diagonal_O_m==3){
            return true;
        }
        if(count_diagonal_X_nm==2 && arena[1][1].equals("X")){
            return true;
        }
        if(count_diagonal_O_nm==2 && arena[1][1].equals("O")){
            return true;
        }
        
        return false;
    }
}
