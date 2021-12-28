package com.item.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.item.model.Item;
import com.item.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**
	 * Gets the Item by id.
	 * 
	 * @param id the id
	 * 
	 * @return the Item
	 * 
	 * @throws NumberFormatException the number format exception
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws Exception the exception
	 */
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Optional<Item> getItemById(@RequestParam String id) throws NumberFormatException, IllegalArgumentException, Exception {
		
		//TODO: to wrap this in Try/Catch
		for (int i = 0; i< 1000; i++) {
			itemService.getItem(Integer.parseInt(id));
		}
		
		return itemService.getItem(Integer.parseInt(id));
	}
	
	/**
	 * Inserts the Item.
	 * 
	 * @param item the item
	 * 
	 * @return the response of inserting the item
	 * 
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws Exception the exception
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String insertItem(@RequestBody Item item) throws IllegalArgumentException, Exception {
		
		//TODO: to wrap this in Try/Catch
		
		itemService.insertItem(item);
		
		return "Item Saved Successfully";
	}
}
