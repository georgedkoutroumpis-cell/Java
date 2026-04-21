/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scada_logger_with_files;

/**
 *
 * @author admin
 */
import java.util.Random;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.io.*;

public class Sensor {
    //atributes
    private String sensor_id;
    private int sensor_value;
    private ArrayList<String> alarm_History;
    
    Random random = new Random();
    
    
    //constructor
    Sensor(String sensor_id){
        this.sensor_id = sensor_id;
        this.sensor_value = 0;
        alarm_History = new ArrayList<>();
    }
    
    //getters
    String getSensorID(){
        return this.sensor_id;
    }
    
    int getSensorValue(){
        return this.sensor_value;
    }
    
    //setters
    void setSensorID(String sensor_id){
        this.sensor_id = sensor_id;
    }
    
    void setSensorValue(int sensor_value){
        this.sensor_value = sensor_value;
    }
    
    void setRandomSensorValue(){
        int value = random.nextInt(50,101);
        setSensorValue(value);
    }
    
    void setAlarmToHistory(String alarm){
        
        alarm_History.add(alarm);
        /*
        String filename = getSensorID() + " Alarms.txt";
        try{
            FileWriter fw = new FileWriter(filename,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            //writing the new alarm in file
            pw.println(alarm);
            
            //closing stream
            pw.close();
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }
        */
    }
    
    String checkSensorAlarm(){
        if(getSensorValue()>85){
            String alarm = "ALARM: ON || " + LocalDateTime.now();
            setAlarmToHistory(alarm);
            return alarm;
        }else{
            String alarm = "ALARM: OFF || " + LocalDateTime.now();
            setAlarmToHistory(alarm);
            return alarm;
        }
    }
    
    void getSensorAlarmHistory(){
        System.out.println(getSensorID() + " Alarm History");
        System.out.println("===========================================");
        for(String alarm:alarm_History){
            System.out.println(alarm);
        }
    }
    
    void clearHistory(){
        alarm_History.clear();
    }
}
