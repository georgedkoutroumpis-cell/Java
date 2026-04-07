/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smart_home_system;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.util.Random;

public class Smart_Home_System {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    
    public static void main(String[] args) {
        boolean exit = false;
        
        
        System.out.println("***********************************************************");
        System.out.println("\tWELCOME TO SMART HOME SYSTEM");
        System.out.println("***********************************************************");
        
        //creating an array of 20 devices
        Device[] devices = new Device[20];
        devices[0] = new Light("L-01","OFF");
        devices[1] = new AC("AC-01","OFF");
        devices[2] = new Door("D-01","CLOSED");
        int devices_count = 3;
        
        //creating an array of 20 sensors
        Sensor[] sensors = new Sensor[20];
        sensors[0] = new Temperature_Sensor("TS-01",0,32);
        sensors[1] = new Light_Sensor("LS-01",0,30);
        sensors[2] = new Door_Sensor("DS-01",0,1);
        int sensors_count = 3;
        
        while(!exit){
            System.out.println("*******************************************");
            System.out.println("\tSMART HOME SYSTEM MENU");
            System.out.println("*******************************************");
            System.out.println("1. Show Available Devices");
            System.out.println("2. Show available Sensors");
            System.out.println("3. Monitoring Devices");
            System.out.println("4. Add new Device");
            System.out.println("5. Add new Sensor");
            System.out.println("6. Exit Smart Home System");
            System.out.println("*******************************************");
            System.out.print("Please pick a choice on Menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> showAvailableDevices(devices);
                case 2 -> showAvailableSensors(sensors);
                case 3 -> monitoringDevices(devices, sensors);
                case 4 ->{ addNewDevice(devices, devices_count);
                           devices_count++;
                }
                case 5 ->{ addNewSensor(sensors, sensors_count);
                           sensors_count++;
                }
                case 6 ->{
                            exit = true;
                            System.out.println("Exiting Smart Home System....");
                }
                default -> System.out.println("Wrong choice on Menu. Please pick again(1-6).");
            }
            
            
        }
        
        
        scanner.close();
    }
    
    static void showAvailableDevices(Device[] devices){
        System.out.println("********************************");
        System.out.println("\t\tDEVICES");
        System.out.println("********************************");
        for(int i=0;i<devices.length;i++){
            if(devices[i]==null){
                break;
            }else{
                System.out.printf("Device [%d] Device ID: %s || Status: %s\n",i+1,devices[i].getDeviceId(),devices[i].getDeviceStatus());

            }
        }
    }
    
    static void showAvailableSensors(Sensor[] sensors){
        System.out.println("********************************");
        System.out.println("\t\tSENSORS");
        System.out.println("********************************");
        for(int i=0;i<sensors.length;i++){
            if(sensors[i]==null){
                break;
            }else{
                System.out.printf("Sensor [%d] Sensor ID: %s || Limit: %d\n",i+1, sensors[i].getSensorId(), sensors[i].getSensorLimit());
            }
        }
    }
    
    static void addNewDevice(Device[] devices, int devices_count){
        System.out.println("********************************************");
        System.out.println("\tADDING NEW DEVICE");
        System.out.println("1. Light");
        System.out.println("2. AC");
        System.out.println("3. Door");
        System.out.println("********************************************");
        
        System.out.println("Please pick which type of device would like to add: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        
        switch(type){
            case 1 ->{
                        System.out.print("Please enter new Device ID(L-_): ");
                        String device_id = scanner.nextLine();
                        System.out.print("Please enter new Device Status(ON/OFF): ");
                        String device_status = scanner.nextLine();
        
                        //creating the new Light device
                        devices[devices_count] = new Light(device_id,device_status);
            }
            case 2 -> {
                        System.out.print("Please enter new Device ID(AC-_): ");
                        String device_id = scanner.nextLine();
                        System.out.print("Please enter new Device Status(ON/OFF): ");
                        String device_status = scanner.nextLine();
        
                        //creating the new AC device
                        devices[devices_count] = new AC(device_id,device_status);
            }
            case 3 -> {
                        System.out.print("Please enter new Device ID(D-_): ");
                        String device_id = scanner.nextLine();
                        System.out.print("Please enter new Device Status(OPEN/CLOSED): ");
                        String device_status = scanner.nextLine();
        
                        //creating the new Door device
                        devices[devices_count] = new Door(device_id,device_status);
            }
            default -> System.out.println("Wrong choice on Menu. Please pick again(1-3).");
        }
        
        
        
    }
    
    static void addNewSensor(Sensor[] sensors, int sensors_count){
        System.out.println("********************************************");
        System.out.println("\tADDING NEW SENSOR");
        System.out.println("1. Temperature Sensor");
        System.out.println("2. Light Sensor");
        System.out.println("3. Door Sensor");
        System.out.println("********************************************");
        
        System.out.println("Please pick which type of Sensor would like to add: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        
        switch(type){
            case 1 ->{
                        System.out.print("Please enter new Sensor ID(TS-_): ");
                        String sensor_id = scanner.nextLine();
                        System.out.print("Please enter new Sensor Value(Optional for initialization select 0): ");
                        int value = scanner.nextInt();
                        System.out.print("Please enter new Sensor Limit: ");
                        int limit = scanner.nextInt();
                        scanner.nextLine();
                        //creating the new Light device
                        sensors[sensors_count] = new Temperature_Sensor(sensor_id, value, limit);
            }
            case 2 -> {
                        System.out.print("Please enter new Sensor ID(LS-_): ");
                        String sensor_id = scanner.nextLine();
                        System.out.print("Please enter new Sensor Value(Optional for initialization select 0): ");
                        int value = scanner.nextInt();
                        System.out.print("Please enter new Sensor Limit: ");
                        int limit = scanner.nextInt();
                        scanner.nextLine();
                        //creating the new AC device
                        sensors[sensors_count] = new Light_Sensor(sensor_id, value, limit);
            }
            case 3 -> {
                        System.out.print("Please enter new Sensor ID(DS-_): ");
                        String sensor_id = scanner.nextLine();
                        System.out.print("Please enter new Sensor Value(Optional for initialization select 0): ");
                        int value = scanner.nextInt();
                        System.out.print("Please enter new Sensor Limit: ");
                        int limit = scanner.nextInt();
                        scanner.nextLine();
                        //creating the new AC device
                        sensors[sensors_count] = new Door_Sensor(sensor_id, value, limit);
            }
            default -> System.out.println("Wrong choice on Menu. Please pick again(1-3).");
        }
    }
    
    static void monitoringDevices(Device[] devices, Sensor[] sensors){
        for(int i = 0;i<sensors.length;i++){
            if(sensors[i]==null){
                break;
            }else{
                //setting random value for each sensor category
                if(sensors[i].getSensorId().contains("TS")){
                    sensors[i].setSensorValue(random.nextInt(25,40));
                }else if(sensors[i].getSensorId().contains("LS")){
                    sensors[i].setSensorValue(random.nextInt(25,40));
                }else if(sensors[i].getSensorId().contains("DS")){
                    sensors[i].setSensorValue(random.nextInt(0,3));
                }
                
                //checking if sensor value > sensor limit so we can set device status that refers to current sensor category ON/OFF 
                if(sensors[i].getSensorValue()>sensors[i].getSensorLimit()){
                    if(sensors[i].getSensorId().contains("TS")){
                        for(Device device:devices){
                            if(device==null){
                                break;
                            }
                            else if(device.getDeviceId().contains("AC")){
                                device.turnOn();
                            }
                        }
                    }else if(sensors[i].getSensorId().contains("LS")){
                        for(Device device:devices){
                            if(device==null){
                                break;
                            }
                            else if(device.getDeviceId().contains("L")){
                                device.turnOn();
                            }
                        }
                    }else if(sensors[i].getSensorId().contains("DS")){
                        for(Device device:devices){
                            if(device == null){
                                break;
                            }
                            else if(device.getDeviceId().contains("D")){
                                device.turnOn();
                            }
                        }
                    }
                }else if(sensors[i].getSensorValue()<sensors[i].getSensorLimit()){
                    if(sensors[i].getSensorId().contains("TS")){
                        for(Device device:devices){
                            if(device==null){
                                break;
                            }
                            else if(device.getDeviceId().contains("AC")){
                                device.turnOff();
                            }
                        }
                    }else if(sensors[i].getSensorId().contains("LS")){
                        for(Device device:devices){
                            if(device==null){
                                break;
                            }
                            else if(device.getDeviceId().contains("L")){
                                device.turnOff();
                            }
                        }
                    }else if(sensors[i].getSensorId().contains("DS")){
                        for(Device device:devices){
                            if(device == null){
                                break;
                            }
                            else if(device.getDeviceId().contains("D")){
                                device.turnOff();
                            }
                        }
                    }
                }
            }
        }
        
        //displaying Available Devices
        System.out.println("********************************");
        System.out.println("\tMONITORING DEVICES");
        System.out.println("********************************");
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int i=0;i<devices.length;i++){
            if(devices[i]==null){
                break;
            }else{
                System.out.printf("Device [%d] Device ID: %s || Status: %s\n",i+1,devices[i].getDeviceId(),devices[i].getDeviceStatus());
                for(int j=0;j<sensors.length;j++){
                    if(sensors[j]==null){
                        break;
                    }else{
                        if(devices[i].getDeviceId().contains("AC") && sensors[j].getSensorId().contains("TS")){
                            System.out.printf("\t|- Embedded Temperature Sensor: Sensor ID: %s || Value: %d || Limit: %d\n",
                                    sensors[j].getSensorId(), sensors[j].getSensorValue(), sensors[j].getSensorLimit());
                        }else if(devices[i].getDeviceId().contains("L") && sensors[j].getSensorId().contains("LS")){
                            System.out.printf("\t|- Embedded Light Sensor: Sensor ID: %s || Value: %d || Limit: %d\n",
                                    sensors[j].getSensorId(), sensors[j].getSensorValue(), sensors[j].getSensorLimit());
                        }else if(devices[i].getDeviceId().contains("D") && sensors[j].getSensorId().contains("DS")){
                            System.out.printf("\t|- Embedded Door Sensor: Sensor ID: %s || Value: %d || Limit: %d\n",
                                    sensors[j].getSensorId(), sensors[j].getSensorValue(), sensors[j].getSensorLimit());
                        }
                    }
                }
                System.out.println("---------------------------------------------------------------------------------------------");
            }
        }
    }
}
