package com.item.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.item.model.Item;
import com.item.repo.ItemRepo;

public class ItemDataService {

	/** The Item Repository to contact CouchDb. */
	@Autowired
	private ItemRepo itemRepo;
	
	/** Insert and item.
	 * 
	 * @param item the item
	 */
	public void insertItem(Item item) {
		itemRepo.save(item);
	}
	
	/**
	 * Gets an item by id.
	 * 
	 * @param id the id
	 * 
	 * @return an {@link Optional} of the Item
	 */
	public Optional<Item> getItem(Integer id) {
		return itemRepo.findById(id);
	}
}
