package com.mtc.service;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Service;

import com.mtc.entity.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	private static Map<Integer, Inventory> inventories = new HashMap<>();
	
	
	//create
    public void addInventory(Inventory Inventory) throws Exception{
        if(inventories.containsKey(Inventory.getId())) {
        	 throw new Exception("Student already exists");
        }
        else {
            inventories.put(Inventory.getId(), Inventory);
        }
    }

    //get all
    public Iterable<Inventory> getInventories(){
        return inventories.values();
    }

    //get one
    public Inventory getInventory(int id) throws Exception {

        if(inventories.containsKey(id)) {
            return inventories.get(id);
        }
        else {
            throw new Exception("Inventory not found");
        }
    }

    //update
    public void updateInventory(Inventory Inventory) throws Exception {
        if(inventories.containsKey(Inventory.getId())) {
            inventories.put(Inventory.getId(), Inventory);
        }
        else {
            throw new Exception("Inventory not found");
        }
    }
    
    //delete
    public void deleteInventory(int id) throws Exception {
        if(inventories.containsKey(id)) {
            inventories.remove(id);
        }
        else {
            throw new Exception("Inventory not found");
        }
    }
}
