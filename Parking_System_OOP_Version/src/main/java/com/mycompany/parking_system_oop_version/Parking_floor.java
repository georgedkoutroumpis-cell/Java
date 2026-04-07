/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking_system_oop_version;

/**
 *
 * @author admin
 */
public class Parking_floor {
    Car[] parking_slots;
    
    
    Parking_floor(int slots){
        this.parking_slots = new Car[slots];
        for(int i=0;i<slots;i++){
            this.parking_slots[i] = new Car("-","-");
        }
    }
    
    void fillParkingSlot(int slot_id,String licence_plate){
        this.parking_slots[slot_id].licence_plate = licence_plate;
        this.parking_slots[slot_id].parking_slot = "x";
    }
    
    
    void showParkingSlots(int slot_id){
        System.out.printf("Slot: %s || Licence_plate: %s\n",this.parking_slots[slot_id].parking_slot,this.parking_slots[slot_id].licence_plate);
    }
}
