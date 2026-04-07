/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scada_system_full_oop_version;

/**
 *
 * @author admin
 */
import java.util.Random;


public class TemperatureSensor extends Sensor{
    
    static Random random = new Random();
    
    //constructor
    TemperatureSensor(String sensor_type,String sensor_id, double temperature, double limit){
        this.setSensorType(sensor_type);
        this.setSensorID(sensor_id);
        this.setSensorValue(temperature);
        this.setSensorLimit(limit);
    }
    
    @Override
    String checkAlert(){
        if(getSensorValue()>getSensorLimit()){
            return "ON - High Temperature!";
        }else{
            return "OFF - Normal Temperature";
        }
    }
    
    @Override
    void updateValue(){
        setSensorValue(random.nextDouble(80,101));
    }
    
   
}
