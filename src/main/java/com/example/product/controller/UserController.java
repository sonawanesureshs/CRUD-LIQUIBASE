package com.example.product.controller;

import javax.validation.Valid;

import com.example.product.entity.User;
import com.example.product.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.product.constants.ApiConstants;
import com.example.product.entity.Product;
import com.example.product.service.ProductService;


@RestController
@Log4j2
@RequestMapping(ApiConstants.API_USERS_PATH)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private ModelMapper modelMapper;


    
    
    
    /**
     * Function to add new product
     * URL Pattern : URL/category
     * URL JSON for POST: {"firstname":"Suresh","lastname":"Sonawane","emailid":"sonawanesuresh@yopmail.com","addr1":null,"addr2":null,"state":null,"zip":null,"contact":"987654321","altcontact":null,"city":"Pune","country":"India"}
     * @param
     * @return Message depending on transaction status
     */
    @PostMapping()
    public String add(@RequestBody @Valid final User user) {
        log.info("Transaction starts to add Product {}", user.getFirstname());
        return userService.add(user);
    }

    /**
     * Function to update product details
     * URL Pattern : URL/category
     * URL JSON for POST: {"id":"1","name":"Product","description":"Product Description", "active":1, "category":{"id":"1"}}
     * @param
     * @return Message depending on transaction status
     */
    @PutMapping()
    public String update(@RequestBody @Valid final User user) {
        //log.info("Transaction starts to update Product {}", product.getName());
        return userService.update(user);
    }

    /**
     * Function to delete specific product
     * URL Pattern : URL/category
     * @param id
     * @return Message depending on transaction status
     */
    @DeleteMapping(ApiConstants.API_USER_PATH_ID)
    public String delete(@PathVariable @Valid final int id) {
        log.info("Transaction starts to delete Product with id {}", id);
        return userService.delete(id);
    }

    /**
     * Function to fetch Product and Category name in JSON Array
     * URL Pattern : URL/category
     * @return JSONArray string
     */
    @GetMapping()
    public String get(){
        log.info("Transaction starts to get list of Products");
        return userService.get();
    }


}
