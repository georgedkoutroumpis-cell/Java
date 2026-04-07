/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smart_home_system;

/**
 *
 * @author admin
 */
public class Door_Sensor extends Sensor{
    
    //constructor
    Door_Sensor(String sensor_id, int sensor_value, int sensor_limit){
        this.setSensorId(sensor_id);
        this.setSensorValue(sensor_value);
        this.setSensorLimit(sensor_limit);
    }
}
