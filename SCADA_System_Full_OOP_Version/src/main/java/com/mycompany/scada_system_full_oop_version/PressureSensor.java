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

public class PressureSensor extends Sensor{
    static Random random = new Random();
    
    //constructor
    PressureSensor(String sensor_type, String sensor_id, double pressure, double limit){
        this.setSensorType(sensor_type);
        this.setSensorID(sensor_id);
        this.setSensorValue(pressure);
        this.setSensorLimit(limit);
    }
    
    @Override
    String checkAlert(){
        if(getSensorValue()>getSensorLimit()){
            return "ON - High Pressure!";
        }else{
            return "OFF - Normal Pressure";
        }
    }
    
    @Override
    void updateValue(){
        setSensorValue(random.nextDouble(40,61));
    }
}
