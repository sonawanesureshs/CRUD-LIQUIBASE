package com.example.product.controller;

import javax.validation.Valid;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.product.constants.ApiConstants;
import com.example.product.entity.Product;
import com.example.product.service.ProductService;


@RestController
@Log4j2
@RequestMapping(ApiConstants.API_PRODUCT_PATH)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductApiController {

    @Autowired
    ProductService productService;

    @Autowired
    private ModelMapper modelMapper;

    
    /**
     * Function to add new product
     * URL Pattern : URL/category
     * URL JSON for POST: {"id":"1","name":"Product","description":"Product", "active":1, "category":{"id":"1"}}
     * @param product
     * @return Message depending on transaction status
     */
    @PostMapping()
    public String add(@RequestBody @Valid final Product product) {
        log.info("Transaction starts to add Product {}", product.getName());
        return productService.add(product);
    }

    /**
     * Function to update product details
     * URL Pattern : URL/category
     * URL JSON for POST: {"id":"1","name":"Product","description":"Product Description", "active":1, "category":{"id":"1"}}
     * @param product
     * @return Message depending on transaction status
     */
    @PutMapping()
    public String update(@RequestBody @Valid final Product product) {
        log.info("Transaction starts to update Product {}", product.getName());
        return productService.update(product);
    }

    /**
     * Function to delete specific product
     * URL Pattern : URL/category
     * @param id
     * @return Message depending on transaction status
     */
    @DeleteMapping()
    public String delete(@RequestParam @Valid final int id) {
        log.info("Transaction starts to delete Product with id {}", id);
        return productService.delete(id);
    }

    /**
     * Function to fetch Product and Category name in JSON Array
     * URL Pattern : URL/category
     * @return JSONArray string
     */
    @GetMapping()
    public String get(){
        log.info("Transaction starts to get list of Products");
        return productService.get();
    }


}
