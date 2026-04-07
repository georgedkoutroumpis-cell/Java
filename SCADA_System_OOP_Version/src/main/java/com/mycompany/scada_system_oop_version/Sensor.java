/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scada_system_oop_version;

/**
 *
 * @author admin
 */
public class Sensor {
    String id;
    double value;
    double limit;
    String[] alert_history;
    
    //constructor
    Sensor(String id,double limit){
        this.id = id;
        this.limit = limit;
        this.alert_history = new String[20];
        //initialize sensors history alert array elementss with"-"
        for(int i=0;i<20;i++){
            this.alert_history[i] = "-";
        }
    }
    
    //methods
    void updateAlertHistory(String category){
        int count = 0;
        for(int i=0;i<this.alert_history.length;i++){
            if(this.alert_history[i].equals("-") && category.equalsIgnoreCase("temperature")){
                this.alert_history[i] = "Alert: Overheating";
                break;
            }else if(this.alert_history[i].equals("-") && category.equalsIgnoreCase("pressure")){
                this.alert_history[i] = "Alert: Over-Pressured";
                break;
            }else if(this.alert_history[i].equals("-") && category.equalsIgnoreCase("voltage")){
                this.alert_history[i] = "Alert: High Voltage";
                break;
            }
            else{
                count++;
            }
        }
        if(count==10){
            for(int i=this.alert_history.length - 1;i>0 ; i--){
                this.alert_history[i] = this.alert_history[i-1];
            }
            if(category.equalsIgnoreCase("temperature")){
                this.alert_history[0] = "Alert: Overheating";
            }else if(category.equalsIgnoreCase("pressure")){
                this.alert_history[0] = "Alert: Over-Pressured";
            }else if(category.equalsIgnoreCase("voltage")){
                this.alert_history[0] = "Alert: High Voltage";
            }
            
        }
    }
    
    void showSensorAlertHistory(){
        System.out.println("***********************");
        System.out.println("Sensor " + this.id + " Alert History");
        System.out.println("***********************");
        for(int i=0;i<this.alert_history.length;i++){
            System.out.println(this.alert_history[i]);
        }
    }
}
