/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scada_system_oop_version;

/**
 *
 * @author admin
 */
public class System_Sensors {
    Sensor[] sensors_list ;
    
    //constructor
    System_Sensors(int num_of_sensors){
        this.sensors_list = new Sensor[num_of_sensors];
    }
    
    //method
    void sensorSetUp(int array_id,String sensor_id,double sensor_limit){
        this.sensors_list[array_id] = new Sensor(sensor_id,sensor_limit);
    }
    
    void showSensor(int array_id){
        if(this.sensors_list[array_id] != null){
            System.out.printf("Sensor ID: %s || Value: %.2f  || Limit: %.2f\n",this.sensors_list[array_id].id,this.sensors_list[array_id].value,this.sensors_list[array_id].limit);
        }
    }
    
    void valueRandomize(int array_id,double value){
        this.sensors_list[array_id].value = value;
    }
    
    void sensorAlerts(int array_id,String category){
       if(this.sensors_list[array_id].value>this.sensors_list[array_id].limit){
           System.out.printf("Sensor ID: %s || Value: %.2f  || Alert: %s\n",this.sensors_list[array_id].id,this.sensors_list[array_id].value,"On");
           this.sensors_list[array_id].updateAlertHistory(category);
       }else{
           System.out.printf("Sensor ID: %s || Value: %.2f  || Alert: %s\n",this.sensors_list[array_id].id,this.sensors_list[array_id].value,"Off");
       }
    }
}
