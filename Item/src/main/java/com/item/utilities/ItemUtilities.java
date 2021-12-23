package com.item.utilities;

import java.util.Arrays;
import java.util.List;

import com.item.model.Item;

public class ItemUtilities {

	private List<String> category = Arrays.asList("Plumbing", "Hardware");
	
	/**
	 * Utility method to valid item category.
	 * 
	 * @param item the item
	 * 
	 * @return boolean value of whether or not the item category is valid.
	 */
	public boolean isItemCategoryValid(Item item) {
		return category.contains(item.getCategory());
	}
}
