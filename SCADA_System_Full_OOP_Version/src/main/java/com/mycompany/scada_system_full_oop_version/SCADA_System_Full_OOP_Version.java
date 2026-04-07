/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scada_system_full_oop_version;

/**
 *
 * @author admin
 */
import java.util.Scanner; 

public class SCADA_System_Full_OOP_Version {
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        boolean exit = false;
        
        Sensor[][] sensors = new Sensor[3][10];
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                if(i==0){
                    sensors[i][j] = new TemperatureSensor("Temperature Sensor","-",0,0);
                }else if(i==1){
                    sensors[i][j] = new PressureSensor("Pressure Sensor","-",0,0);
                }else if(i==2){
                    sensors[i][j] = new VoltageSensor("Voltage Sensor","-",0,0);
                }
            }
        }
        //each line of this array refers to each sensor category(temperature,pressure,voltage)
        //We select 10 sensors for each category
        
        System.out.println("\t**********************************************");
        System.out.println("\t\tWELCOME TO SCADA SENSOR SYSTEM");
        System.out.println("\t**********************************************");
        
        /*
        int[] categories_sensors = new int[3];
        System.out.print("Please enter number of sensors for each category: ");
        for(int i=0;i<3;i++){
            categories_sensors[i] = scanner.nextInt();
        }
        //getting newLine character
        scanner.nextLine();
        */
        
        while(!exit){
            System.out.println("\t\t***************************");
            System.out.println("\t\t\t  MENU");
            System.out.println("\t\t***************************");
            System.out.println("\t\t1. Add Temperature Sensors");
            System.out.println("\t\t2. Add Pressure Sensors");
            System.out.println("\t\t3. Add voltage Sensors");
            System.out.println("\t\t4. Monitoring Sensors");
            System.out.println("\t\t5. Exit SCADA System");
            System.out.println("\t\t***************************");
            System.out.print("\tPlease enter a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> addTempSensors(sensors);
                case 2 -> addPressureSensors(sensors);
                case 3 -> addVoltageSensors(sensors);
                case 4 -> monitoringSensors(sensors);
                case 5 -> {exit = true;
                           System.out.println("Exiting SCADA System...");
                }
                default -> System.out.println("Wrong choice on menu. Please try again(1-5).");
            }
        }
        
        
        scanner.close();
    }
    
    static void addTempSensors(Sensor[][] sensors){
        String sensor_id;
        double limit;
        
        System.out.println("*********************************");
        System.out.println("\t Adding Temperature Sensors");
        System.out.println("*********************************");
        System.out.print("How many Temperature Sensors would like to add(MAX 10): ");
        int num_sensors = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0;i<num_sensors;i++){
            System.out.println("Adding Sensor " + (i+1) + " of " + num_sensors + ": ");
            System.out.print("Please enter Sensor-ID: ");
            sensor_id = scanner.nextLine();
            System.out.print("Please enter Sensor Limit: ");
            limit = scanner.nextDouble();
            scanner.nextLine();
            sensors[0][i].setSensorID(sensor_id);
            sensors[0][i].setSensorLimit(limit);
        }
    }
    
    
    static void addPressureSensors(Sensor[][] sensors){
         String sensor_id;
        double limit;
        
        System.out.println("*********************************");
        System.out.println("\t Adding Pressure Sensors");
        System.out.println("*********************************");
        System.out.print("How many Pressure Sensors would like to add(MAX 10): ");
        int num_sensors = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0;i<num_sensors;i++){
            System.out.println("Adding Sensor " + (i+1) + " of " + num_sensors + ": ");
            System.out.print("Please enter Sensor-ID: ");
            sensor_id = scanner.nextLine();
            System.out.print("Please enter Sensor Limit: ");
            limit = scanner.nextDouble();
            scanner.nextLine();
            sensors[1][i].setSensorID(sensor_id);
            sensors[1][i].setSensorLimit(limit);
        }
    }
    
    static void addVoltageSensors(Sensor[][] sensors){
         String sensor_id;
        double limit;
        
        System.out.println("*********************************");
        System.out.println("\t Adding Temperature Sensors");
        System.out.println("*********************************");
        System.out.print("How many Voltage Sensors would like to add(MAX 10): ");
        int num_sensors = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0;i<num_sensors;i++){
            System.out.println("Adding Sensor " + (i+1) + " of " + num_sensors + ": ");
            System.out.print("Please enter Sensor-ID: ");
            sensor_id = scanner.nextLine();
            System.out.print("Please enter Sensor Limit: ");
            limit = scanner.nextDouble();
            scanner.nextLine();
            sensors[2][i].setSensorID(sensor_id);
            sensors[2][i].setSensorLimit(limit);
        }
    }
    
    static void monitoringSensors(Sensor[][] sensors){
        boolean exit = false;
        int choice;
        
        while(!exit){
            for(int i=0;i<3;i++){
                if(i==0){
                    System.out.println("\t*********************************");
                    System.out.println("\t\tTemperature Sensors");
                    System.out.println("\t*********************************");
                }else if(i==1){
                    System.out.println("\t*********************************");
                    System.out.println("\t\tPressure Sensors");
                    System.out.println("\t*********************************");
                }else if(i==2){
                    System.out.println("\t*********************************");
                    System.out.println("\t\tVoltage Sensors");
                    System.out.println("\t*********************************");
                }
                for(int j=0;j<sensors[i].length;j++){
                    sensors[i][j].updateValue();
                    System.out.printf("%s [%d] || Sensor-ID: %s || Value: %.2f || Limit: %.2f || Alert: %s\n",sensors[i][j].getSensorType(),j+1,sensors[i][j].getSensorID(),sensors[i][j].getSensorValue(),sensors[i][j].getSensorLimit(),sensors[i][j].checkAlert());
                }
            }
            
            
            System.out.println("=============================================================================");
            System.out.print("Please enter a choice (1.Continue Monitoring, 2.Exit Monitoring) :: ");
            choice = scanner.nextInt();
            System.out.println("=============================================================================");
            scanner.nextLine();
            switch(choice){
                case 1 -> System.out.println("Continue Monitoring Sensors.");
                case 2 -> exit = true;
                default -> System.out.println("Wrong choice on MENU. Please pick again(1-2).");
            }
        }
    }
}
