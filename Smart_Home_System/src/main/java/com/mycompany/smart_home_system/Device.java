/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smart_home_system;

/**
 *
 * @author admin
 */
public abstract class Device implements Controllable{
    //attributes
    private String device_id;
    private String device_status;
    
    
    //getters
    String getDeviceId(){
        return this.device_id;
    }
    
    String getDeviceStatus(){
        return this.device_status;
    }
    
    //setters
    void setDeviceId(String device_id){
        this.device_id = device_id;
    }
    
    void setDeviceStatus(String device_status){
        this.device_status = device_status;
    }
    
    @Override
    public void turnOn(){
        this.setDeviceStatus("ON");
    }
    
    @Override
    public void turnOff(){
        this.setDeviceStatus("OFF");
    }
}
