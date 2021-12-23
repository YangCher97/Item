package com.item.model;

import java.util.Objects;

import org.springframework.data.couchbase.core.mapping.Document;

/**
 * Item Model Object.
 * 
 * @author Cher Yang
 *
 */
@Document
public class Item {

	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The category. */
	private String category;
	
	/** The weight. */
	private Double weight;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * Hashcode method default implementation.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, weight);
	}

	/**
	 * Equals method default implementation.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(weight, other.weight);
	}
	
}
