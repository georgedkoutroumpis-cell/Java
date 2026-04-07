/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_scada_simulation;

/**
 *
 * @author admin
 */
import java.util.Random;
import java.util.Scanner;

public class Mini_SCADA_Simulation {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean overheated;
        String continue_program ="";
        
        //array of sensor-id's
        int[] sensors = new int[10];
        for(int i=0;i<10;i++){
            sensors[i] = i+1;
        }
        
        while(!continue_program.equalsIgnoreCase("F")){
            System.out.println("=========================================================================");
            System.out.println("\t         TEMPERATURE - PRESSURE MONITORING");
            System.out.println("=========================================================================");
        
            //random temperature and pressure for each sensor
            for(int i=0;i<10;i++){
                double temperature = random.nextDouble(30,101);
                double pressure = random.nextDouble(1,6) ;
            
                //checking for overheating
                overheated = checkOverheated(temperature);
            
                if(i%2==0){
                    System.out.println("Sensors Block");
                    System.out.println("=========================================================================");
                }
            
                if(overheated){
                    System.out.printf("Sensor %d: Temperature: %.2f || Pressure: %.2f || Fan-Cooling System: ON\n",(i+1),temperature,pressure);
                }else{
                    System.out.printf("Sensor %d: Temperature: %.2f || Pressure: %.2f || Fan-Cooling System: OFF\n",(i+1),temperature,pressure);
                }
            
                if(i%2==1){
                    System.out.println();
                }
            }
            System.out.println("""
                               
                               
                               
                               
                               
                               
                               """);
            System.out.print("Press Enter to continue Monitoring, or press F to Exit Program: ");
            continue_program = scanner.nextLine();
            for(int i=0; i<30;i++){
                System.out.println();
            }
            Thread.sleep(1500);
        }     
    }
    
    static boolean checkOverheated(double temperature){
        if(temperature>=80){
            return true;
        }else{
            return false;
        }
    }
}
