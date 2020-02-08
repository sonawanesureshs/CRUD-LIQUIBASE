package com.example.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="category")
public class Category {
	@Id
	private int id;
	private String name;
	private String description;

	@Column(name="isactive")
	private Integer active;
	

	
	
}
