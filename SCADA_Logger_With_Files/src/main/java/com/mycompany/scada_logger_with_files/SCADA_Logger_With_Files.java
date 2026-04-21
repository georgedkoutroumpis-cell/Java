/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scada_logger_with_files;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class SCADA_Logger_With_Files {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        
        //creating a System_Sensors object
        System_Sensors sensors = new System_Sensors();
        
        while(!exit){
            System.out.println("\t- SENSOR LOGGER SYSTEM WITH FILES -");
            System.out.println("================================================");
            System.out.println("1. Add Sensor");
            System.out.println("2. Show Available Sensors");
            System.out.println("3. Show Sensor's Alarm History");
            System.out.println("4. Save Sensors to File");
            System.out.println("5. Load Sensors from File");
            System.out.println("6. Load Sensor's Alarms from File");
            System.out.println("7. Exit Program");
            System.out.println("================================================");
            System.out.print("Please enter a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            //randomizing sensors values
            sensors.randomizeSensorsValues();
            sensors.checkSensorsAlarms();
            
            switch(choice){
                case 1 -> sensors.addNewSensor();
                case 2 -> sensors.showAllSensors();
                case 3 -> sensors.getAlarmHistory();
                case 4 -> sensors.saveSensorsToFile();
                case 5 -> sensors.loadSensorsFromFile();
                case 6 -> sensors.loadSensorAlarmsFromFile();
                case 7 ->{
                            exit = true;
                            System.out.println("Exiting program....");
                }
                default -> System.out.println("Wrong choice on menu. Please try again(1-4).");
            }
        }
        
        
        //scanner.close();
    }
}
