/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.booking_system_theater_cinema;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Booking_system_theater_cinema {
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        boolean exit=false;
        
        System.out.println("*****************************************************");
        System.out.println("\tBOOKING SYSTEM THEATER/CINEMA");
        System.out.println("*****************************************************");
        
        String[][] seats = new String[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                seats[i][j] = "-";
            }
        }
        
        while(!exit){
            System.out.println("\t***********************");
            System.out.println("\t\tMENU");
            System.out.println("\t***********************");
            
            System.out.println("\t1. Show seats");
            System.out.println("\t2. Book seat");
            System.out.println("\t3. Change booked seat");
            System.out.println("\t4. Cancel booked seat");
            System.out.println("\t5. Exit");
            System.out.println();
            System.out.print("Please pick on menu: ");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1 -> showSeats(seats);
                case 2 -> bookSeat(seats);
                case 3 -> changeBooking(seats) ;
                case 4 -> cancelBooking(seats);
                case 5 -> exit=true;
                default -> System.out.println("Wrong choice on menu. Please pick again(1-5)!");
            }
        }
        
        scanner.close();
    }
    
    static void showSeats(String[][] seats){
        int count=1;
        System.out.println("\t*********************");
        System.out.println("\tSEATS");
        System.out.println("\t*********************");
        
        System.out.println("Seat: \t[ 1 2 3 4 5 6 7 8 9 10]");
        for(String[] row:seats){
            System.out.print("Row " + count +"\t[ ");
            for(String seat:row){
                System.out.print(seat + " ");
            }
            System.out.print("]");
            System.out.println();
            count++;
        }
        System.out.println("Remaining seats: " + remainingSeats(seats));
    }
    
    static void bookSeat(String[][] seats){
        System.out.print("Please enter row: ");
        int row = scanner.nextInt();
        System.out.print("Please enter seat-id: ");
        int seat_id =scanner.nextInt();
        
        seats[row-1][seat_id-1] = "X";
    }
    
    static int remainingSeats(String[][] seats){
        int count=0;
        for(String[] row:seats){
            for(String seat:row){
                if(!seat.equals("X")){
                    count++;
                }
            }
        }
        return count;
    }
    
    static void changeBooking(String[][] seats){
        showSeats(seats);
        System.out.println();
        System.out.println("--Old seat--");
        System.out.print("Please enter the row of the booked seat: ");
        int row = scanner.nextInt();
        System.out.print("Please enter the seat-id: ");
        int seat_id = scanner.nextInt();
        seats[row-1][seat_id-1] = "-";
        
        System.out.println("--New seat--");
        bookSeat(seats);
    }
    
    static void cancelBooking(String[][] seats){
        showSeats(seats);
        System.out.println();
        System.out.println("--Cancel Booking--");
        System.out.print("Please enter the row of the booked seat: ");
        int row = scanner.nextInt();
        System.out.print("Please enter the seat-id: ");
        int seat_id = scanner.nextInt();
        seats[row-1][seat_id-1] = "-";
    }
}
