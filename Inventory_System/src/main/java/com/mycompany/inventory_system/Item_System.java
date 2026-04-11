/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory_system;

/**
 *
 * @author admin
 */
import java.util.ArrayList;

public class Item_System {
    private ArrayList<Item> items;
    
    Item_System(){
        items = new ArrayList<>();
    }
    
    void addNewItem(String item_id, String item_name){
        items.add(new Item(item_id, item_name));
    }
    
    void showItems(){
        for(Item item:items){
            System.out.println("Item ID: " + item.getItemID() + " || Item Name: " + item.getItemID());
        }
    }
    
    void removeAnItem(String item_id){
        int count = 0;
        for(Item item:items){
            if(item_id.equals(item.getItemID())){
                System.out.println("Removing item " + item.getItemName() + " with Item ID " + item.getItemID());
                items.remove(count);
                break;
            }
            count++;
        }
    }
    
    int getItemsSize(){
        return items.size();
    }
    
    String getCurrentItem(int index){
        return items.get(index).getItemID() + "," + items.get(index).getItemName();
    }
    
    void clearingForLoad(){
        items.clear();
    }
}
