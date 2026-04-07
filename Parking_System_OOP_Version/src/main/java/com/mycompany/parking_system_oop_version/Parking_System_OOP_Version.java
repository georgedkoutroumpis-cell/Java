/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parking_system_oop_version;

/**
 *
 * @author admin
 */
import java.util.Scanner;


public class Parking_System_OOP_Version {
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int Parking_floors = 10;
        int slots_per_floor = 10;
        boolean exit = false;
        
        System.out.println("*********************************");
        System.out.println("\tPARKING SYSTEM");
        System.out.println("*********************************");
        
        Parking_floor[] parking = new Parking_floor[Parking_floors];
        for(int i=0;i<Parking_floors;i++){
            parking[i] = new Parking_floor(slots_per_floor);
        }
        
        
        
        while(!exit){
            System.out.println("=========================");
            System.out.println("\tMENU");
            System.out.println("=========================");
            System.out.println("1. Add new Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Show Parking Slots");
            System.out.println("4. Exit");
            System.out.println("=========================");
            System.out.print("Please pick a choice on menu above: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> addNewCar(parking,Parking_floors,slots_per_floor);
                case 3 -> showSlots(Parking_floors, slots_per_floor, parking);
                case 4 ->{ exit = true;
                           System.out.println("Exiting Program.");
                }
                default -> System.out.println("Wrong choice on menu. PLease pick again(1-4).");
            }
        }
        
        
        
        
        scanner.close();
    }
    
    static void showSlots(int Parking_floors, int slots_per_floor, Parking_floor[] parking){
        for(int i=0;i<Parking_floors;i++){
            System.out.println("=========================");
            System.out.println("FLOOR: " + (i+1));
            System.out.println("=========================");
            for(int j=0;j<slots_per_floor;j++){
                System.out.printf("%d. ",(j+1));
                parking[i].showParkingSlots(j);
            }
        }
    }
    
    static void addNewCar(Parking_floor[] parking,int Parking_floors, int slots_per_floor){
        //getting licence plate
        System.out.print("Please enter licence plate: ");
        String licence_plate = scanner.nextLine();
        
        //showing parking slots
        showSlots(Parking_floors,slots_per_floor,parking);
        
        //selecting floor and slot for the new car
        System.out.print("Please enter floor: ");
        int floor = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter slot: ");
        int slot = scanner.nextInt();
        scanner.nextLine();
        
        
        //storing the new car
        parking[floor-1].fillParkingSlot((slot-1),licence_plate);
         
    }
    
    
}
