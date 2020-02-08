package com.example.product.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
	@Id
	private int id;
	private String name;
	private String description;
	
    @NotNull
    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @Column(name="isactive")
    private Integer active;
	
	
}
