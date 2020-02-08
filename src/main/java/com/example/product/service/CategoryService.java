package com.example.product.service;

import com.example.product.entity.Category;

public interface CategoryService {
	
	/**
	 * Function to add new category
	 * @param category
	 * @return Message depending on transaction status
	 */
	public String add(final Category category);
	
	/**
	 * Function to update category details
	 * @param category
	 * @return Message depending on transaction status
	 */
	public String update(final Category category);
	
	/**
	 * Function to delete specific category
	 * @param id
	 * @return Message depending on transaction status
	 */	
	public String delete(final int id);
}
