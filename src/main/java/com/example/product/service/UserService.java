package com.example.product.service;

import com.example.product.entity.Product;
import com.example.product.entity.User;

public interface UserService {

    /**
     * Function to add new product
     * @param Product
     * @return Message depending on transaction status
     */
    public String add(final User user);

    /**
     * Function to update product details
     * @param Product
     * @return Message depending on transaction status
     */
    public String update(final User user);

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
