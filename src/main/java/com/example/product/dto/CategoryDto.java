package com.example.product.dto;


import lombok.Data;

@Data
public class CategoryDto {

    private int id;
    private String name;
    private String description;
    private Integer active;
}
