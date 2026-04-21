/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scada_logger_with_files;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class System_Sensors {
    Scanner scanner = new Scanner(System.in); 
    
    private ArrayList<Sensor> sensors;
    
    //constructor
    System_Sensors(){
        sensors = new ArrayList<>();
    }
    
    void addNewSensor(){
        sensors.add(new Sensor(getLastSensorID()));
    }
    
    String getLastSensorID(){
        int count = 1;
        for(Sensor sensor:sensors){
            if(sensor!=null && count!=sensors.size()){
                count++;
            }else if(sensor!=null && count==sensors.size()){
                String sensor_id = sensor.getSensorID();
                String[] sensor_id_parts = sensor_id.split("-");
                int id = Integer.parseInt(sensor_id_parts[1]) + 1;
                return sensor_id_parts[0] + "-" + id;
            }
        }
        return "S-100";
    }
    
    void showAllSensors(){
        System.out.println("\t- AVAILABLE SENSORS -");
        System.out.println("=======================================");
        if(sensors.size()==0){
            System.out.println("There are no available Sensors.");
        }else{
            int count = 0;
            for(Sensor sensor:sensors){
                if(sensor!=null){
                    System.out.println("[" + (count+1) + "] Sensor ID: " + sensor.getSensorID() + " || Value: " + sensor.getSensorValue());
                }else{
                    break;
                }
                count++;
            }
        } 
    }
    
    void getAlarmHistory(){
        showAllSensors();
        System.out.println("=======================================");
        System.out.print("Please pick a sensor: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        sensors.get(choice-1).getSensorAlarmHistory();
    }
    
    void randomizeSensorsValues(){
        for(Sensor sensor:sensors){
            sensor.setRandomSensorValue();
        }
    }
    
    void checkSensorsAlarms()
    {
        for(Sensor sensor:sensors){
            sensor.checkSensorAlarm();
        }
    }
    
    void saveSensorsToFile(){
        try{
            FileWriter fw = new FileWriter("Sensors.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            for(Sensor sensor:sensors){
                pw.println(sensor.getSensorID());
            }
            
            pw.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
    void loadSensorsFromFile(){
        sensors.clear();
        try{
            FileReader fr = new FileReader("Sensors.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line!=null){
                Sensor s = new Sensor(line);
                sensors.add(s);
                line = br.readLine();
            }
            
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
    
    void loadSensorAlarmsFromFile(){
        showAllSensors();
        System.out.println("=====================================================");
        System.out.print("Please pick a sensor to load Alarms History: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        //clear picked sensor's alarm history before loading from file
        sensors.get(choice-1).clearHistory();
        
        String filename = sensors.get(choice -1).getSensorID() + " Alarms.txt";
        
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line!=null){
                sensors.get(choice-1).setAlarmToHistory(line);
                line = br.readLine();
            }
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
    }
}
