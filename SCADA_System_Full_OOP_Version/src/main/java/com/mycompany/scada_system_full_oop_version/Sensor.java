/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scada_system_full_oop_version;

/**
 *
 * @author admin
 */
public abstract class Sensor {
    private String sensor_id;
    private double value;
    private double limit;
    private String sensor_type;
    
    
    //getters
    String getSensorID(){
        return this.sensor_id;
    }
    
    double getSensorValue(){
        return this.value;
    }
    
    double getSensorLimit(){
        return this.limit;
    }
    
    String getSensorType(){
        return this.sensor_type;
    }
    
    //setters
    void setSensorID(String sensor_id){
        this.sensor_id = sensor_id;
    }
    
    void setSensorValue(double value){
        this.value = value;
    }
    
    void setSensorLimit(double limit){
        this.limit = limit;
    }
    
    void setSensorType(String sensor_type){
        this.sensor_type = sensor_type;
    }
    
    //concrete methods
    
    
    //abstract methods
    abstract String checkAlert();
    
    abstract void updateValue();
    
}
