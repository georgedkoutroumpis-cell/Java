/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smart_home_system;

/**
 *
 * @author admin
 */
public class Door extends Device{
    
    
    //constructor
    Door(String device_id, String device_status){
        this.setDeviceId(device_id);
        this.setDeviceStatus(device_status);
    }
    

}
