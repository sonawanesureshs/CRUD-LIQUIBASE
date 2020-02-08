package com.example.product.dto;

import com.example.product.entity.Category;
import lombok.Data;

@Data
public class ProductDto {
    public class Product {

        private int id;
        private String name;
        private String description;
        private CategoryDto category;
        private Integer active;


    }
}
