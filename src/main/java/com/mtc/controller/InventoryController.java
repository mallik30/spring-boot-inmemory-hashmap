package com.mtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.mtc.entity.Inventory;
import com.mtc.service.InventoryService;


@RestController
@RequestMapping("/inventories")
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;

	@PostMapping(value = "/add")
    @ResponseStatus(value = HttpStatus.OK)
    public void addone(@RequestBody Inventory inventory) throws Exception {
        inventoryService.addInventory(inventory);
    }
	
	
	@GetMapping(value = "/all")
    public Iterable<Inventory> getAll() {
        return inventoryService.getInventories();
    }
	
	
	@GetMapping(value = "{id}")
    public Inventory getOne(@PathVariable("id") int id) throws Exception {
        return inventoryService.getInventory(id);
    }
   
	
    @PutMapping(value = "{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateOne(@PathVariable("id") int id, @RequestBody Inventory inventory) throws Exception {
        inventory.setId(id);
        inventoryService.updateInventory(inventory);
    }


    @DeleteMapping(value = "{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteInventory(@PathVariable("id") int id) throws Exception {
        inventoryService.deleteInventory(id);
    }
	
}
