/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smart_home_system;

/**
 *
 * @author admin
 */
public abstract class Sensor {
    private String sensor_id;
    private int sensor_value;
    private int sensor_limit;
    
    //getters
    String getSensorId(){
        return this.sensor_id;
    }
    
    int getSensorValue(){
        return this.sensor_value;
    }
    
    int getSensorLimit(){
        return this.sensor_limit;
    }
    
    //setters
    void setSensorId(String sensor_id){
        this.sensor_id = sensor_id;
    }
    
    void setSensorValue(int sensor_value){
        this.sensor_value = sensor_value;
    }
    
    void setSensorLimit(int sensor_limit){
        this.sensor_limit = sensor_limit;
    }
}
