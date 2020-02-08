package com.example.product.service;

import com.example.product.entity.Product;

public interface ProductService {
	
	/**
     * Function to add new product
     * @param Product
     * @return Message depending on transaction status
     */
    public String add(final Product product);
    
    /**
     * Function to update product details
     * @param Product
     * @return Message depending on transaction status
     */
    public String update(final Product product);

    /**
     * Function to delete specific product
     * @param id
     * @return Message depending on transaction status
     */
    public String delete(final int id);

    /**
     * Function to fetch Product and Category name in JSON Array
     * @return JSONArray string
     */
    public String get();
}
