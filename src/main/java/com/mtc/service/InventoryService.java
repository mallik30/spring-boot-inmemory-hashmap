package com.mtc.service;

import com.mtc.entity.Inventory;

public interface InventoryService {

	public void addInventory(Inventory Inventory)throws Exception;
	public Iterable<Inventory> getInventories();
	public Inventory getInventory(int id) throws Exception;
	public void updateInventory(Inventory Inventory) throws Exception;
	public void deleteInventory(int id) throws Exception;
	
}
