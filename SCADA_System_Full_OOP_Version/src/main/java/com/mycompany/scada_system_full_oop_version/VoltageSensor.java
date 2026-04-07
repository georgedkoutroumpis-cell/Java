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

public class VoltageSensor extends Sensor{
    static Random random = new Random();
    
    //constructor
    VoltageSensor(String sensor_type, String sensor_id, double voltage, double limit){
        this.setSensorType(sensor_type);
        this.setSensorID(sensor_id);
        this.setSensorValue(voltage);
        this.setSensorLimit(limit);
    }
    
    @Override
    String checkAlert(){
        if(getSensorValue()>getSensorLimit()){
            return "ON - High Voltage!";
        }else{
            return "OFF - Normal Voltage";
        }
    }
    
    @Override
    void updateValue(){
        setSensorValue(random.nextDouble(380,480));
    }
}
