/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scada_system_oop_version;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.Random;

public class SCADA_System_OOP_Version {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    
    public static void main(String[] args) {
        boolean exit=false;
        boolean setup =false;
        
        //array 1 of # sensors
        System.out.println("==========================================================");
        System.out.println("\tWELCOME TO SCADA SYSTEM");
        System.out.println("==========================================================");
        System.out.print("Please enter number of sensor categories: ");
        int categories = scanner.nextInt();
        System.out.print("Please enter number of sensors for each category: ");
        int num_sensors = scanner.nextInt();
        scanner.nextLine();
        
        //array for each category title
        String[] categories_titles = new String[categories];
        for(int i=0;i<categories;i++){
            System.out.print("Please enter name of category " + (i+1) + ": ");
            categories_titles[i] = scanner.nextLine();
        }
                
        
        //declaration and construction of an System_Sensors object that is an array of sensor objects of Sensor Class
        //Each array of System_Sensors could be an Industrial Engineering Department
        System_Sensors[] array_of_sensors = new System_Sensors[categories];
        for(int i=0;i<categories;i++){
            array_of_sensors[i] = new System_Sensors(num_sensors);
        }
        
        
        while(!exit){
            System.out.println("========================");
            System.out.println("\tMENU");
            System.out.println("========================");
            System.out.println("1. Sensors Setup");
            System.out.println("2. Monitoring Sensors");
            System.out.println("3. Show Sensors");
            System.out.println("4. Sensor Alert History");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Please enter a choice on menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> setup = sensorsSetup(categories,num_sensors,array_of_sensors,categories_titles);
                case 2 ->{if(setup){
                                monitoringSensors(categories,num_sensors,array_of_sensors,categories_titles);
                          }else{
                                System.out.println("You need to setup Sensors first!");
                          }
                }
                case 3 ->{if(setup){
                                showSensors(categories,num_sensors,array_of_sensors,categories_titles);
                          }else{
                                System.out.println("You need to setup Sensors first!");
                          }
                }
                case 4 -> showAlertHistory(array_of_sensors,categories_titles);
                case 5 -> exit = true;
                default -> System.out.println("Wrong choice on menu. Please pick again(1-4).");
            }
        }
        
        
        scanner.close();
    }
    
    static boolean sensorsSetup(int categories,int num_sensors, System_Sensors[] array_of_sensors, String[] categories_titles){
        System.out.println("*****************************************");
        System.out.println("\t\tSENSORS SETUP");
        System.out.println("*****************************************");
        for(int j=0;j<categories;j++){
            System.out.println("=======================");
            System.out.println("Category " + categories_titles[j]);
            System.out.println("=======================");
            for(int i=0;i<num_sensors;i++){
                System.out.print("Please enter sensor's id: ");
                String sensor_id = scanner.nextLine();
                System.out.print("Please enter sensor's limit: ");
                double sensor_limit = scanner.nextDouble();
                scanner.nextLine();
                //setup for each sensor in each category
                array_of_sensors[j].sensorSetUp(i,sensor_id,sensor_limit);
                
                
            }
        }
        return true;
    }
    
    static void monitoringSensors(int categories,int num_sensors, System_Sensors[] array_of_sensors, String[] categories_titles){
        double value = 0.0;
        boolean exit = false;
        int  count=0;
        
        
        while(!exit){
            System.out.println("***********************************************************");
            System.out.println("\t*  MONITORING SENSORS  *");
            System.out.println("***********************************************************");
            for(int j=0;j<categories;j++){
                System.out.println("=============================");
                System.out.println("Category " + categories_titles[j]);
                System.out.println("=============================");
                for(int i=0;i<num_sensors;i++){
                    //randomizing value of each sensor depend on each category - SEMI-Realistic Monitoring
                    if(categories_titles[j].equalsIgnoreCase("temperature")){
                        value = random.nextDouble(20,81);
                    }else if(categories_titles[j].equalsIgnoreCase("pressure")){
                        value = random.nextDouble(10,101);
                    }else if(categories_titles[j].equalsIgnoreCase("voltage")){
                        value = random.nextDouble(380,481);
                    }
                    //monitoring random sensor values
                    array_of_sensors[j].valueRandomize(i,value);
                    //printing each sensor in each category
                    System.out.print("[" + (i+1) + "]:");
                    array_of_sensors[j].showSensor(i);
                }
            }
            
            System.out.println("********************************************");
            System.out.println("\t*  ALERTS  *");
            System.out.println("********************************************");
            for(int j=0;j<categories;j++){
                System.out.println("=============================");
                System.out.println("Category " + categories_titles[j]);
                System.out.println("=============================");
                for(int i=0;i<num_sensors;i++){
                    System.out.print("[" + (i+1) + "]:");
                    array_of_sensors[j].sensorAlerts(i,categories_titles[j]); //we could add Time attribute in each alert
                }
            }
            
            if(count%4==0){
                System.out.print("Would you like to continue monitoring? Please enter 1 to continue monitoring, 2 to exit to main menu: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 1 -> System.out.println("Continue Monitoring...");
                    case 2 -> { System.out.println("Exiting Monitoring...");
                                exit = true;}
                    default -> System.out.println("Wrong choice. Please pick again(1-2).");
                }
            }
            //printing some blank lines(e.g. clearing page
            for(int i=0;i<30;i++){
                System.out.println();
            }
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            count++;
        }
    }
    
    
    static void showSensors(int categories,int num_sensors,System_Sensors[] array_of_sensors, String[] categories_titles){
        System.out.println("*****************************************");
        System.out.println("\tPRINTING SENSORS LIST");
        System.out.println("*****************************************");
        for(int j=0;j<categories;j++){
            System.out.println("=============================");
            System.out.println("Category " + categories_titles[j]);
            System.out.println("=============================");
            for(int i=0;i<num_sensors;i++){
                //printing each sensor in each category
                System.out.print("[" + (i+1) + "]:");
                array_of_sensors[j].showSensor(i);
            }
        }
    }
    
    static void showAlertHistory(System_Sensors[] array_of_sensors, String[] categories_titles){
        int i = 0;
        int array_id = 0;
        System.out.print("Please enter category of of sensor: ");
        String category = scanner.nextLine();
        for(String category_title:categories_titles){
            if(category.equalsIgnoreCase("temperature")){
                array_id = i;
                break;
            }else if(category.equalsIgnoreCase("pressure")){
                array_id = i;
            }else if(category.equalsIgnoreCase("voltage")){
                array_id = i;
            }
            i++;
        }
        System.out.print("Please enter sensor number: ");
        int sensor_id = scanner.nextInt();
        scanner.nextLine();
        array_of_sensors[array_id].sensors_list[sensor_id-1].showSensorAlertHistory();
    }
    
}
