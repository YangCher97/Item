package com.item.service;

import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.item.model.Item;
import com.item.persistence.ItemDataService;

@Component
public class ItemService {
	
	/**
	 * The logger.
	 */
	private Logger logger;

	/**
	 * The Item Data Service.
	 */
	@Autowired
	private ItemDataService itemDataService;
	
	/**
	 * Inserts an Item.
	 * 
	 * @param item the item
	 * 
	 * @throws IllegalArgumentException the Illegal Argument Exception
	 * @throws Exception the Exception
	 */
	public void insertItem(Item item) throws IllegalArgumentException, Exception {
		try {
			itemDataService.insertItem(item);
		} catch (IllegalArgumentException illegalArg) {
			logger.error("IllegalArgumentException Occured. Exception detail is: {}", illegalArg);
			throw new IllegalArgumentException(illegalArg);
		} catch (Exception exception) {
			logger.error("Exception occurred when trying to insert item. Exception detail is: {}", exception);
			throw new Exception(exception);
		}
	}
	
	/**
	 * Updates an Item.
	 * 
	 * @param item the item
	 * 
	 * @throws IllegalArgumentException the Illegal Argument Exception
	 * @throws Exception the Exception
	 */
	public void updateItem(Item item) throws IllegalArgumentException, Exception {
		try {
			itemDataService.updateItem(item);
		} catch (IllegalArgumentException illegalArg) {
			logger.error("IllegalArgumentException Occured. Exception detail is: {}", illegalArg);
			throw new IllegalArgumentException(illegalArg);
		} catch (Exception exception) {
			logger.error("Exception occurred when trying to update item. Exception detail is: {}", exception);
			throw new Exception(exception);
		}
	}
	
	/**
	 * Get an Item by ID.
	 * 
	 * @param id the id
	 * 
	 * @return the {@Link Optional} of an Item.
	 * 
	 * @throws IllegalArgumentException the Illegal Argument Exception
	 * @throws Exception the Exception
	 */
	public Optional<Item> getItem(Integer id) throws IllegalArgumentException, Exception {
		try {
			return itemDataService.getItem(id);
		} catch (IllegalArgumentException illegalArg) {
			logger.error("IllegalArgumentException occurred when trying to getItem by ID. Exception detail is: {}", illegalArg);
			throw new IllegalArgumentException(illegalArg);
		} catch (Exception exception) {
			logger.error("Exception occurred when trying to getItem by ID. Exception detail is: {}", exception);
			throw new Exception(exception);
		}		
	}
}
