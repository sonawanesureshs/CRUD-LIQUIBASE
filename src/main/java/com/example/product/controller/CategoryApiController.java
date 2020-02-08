package com.example.product.controller;

import javax.validation.Valid;

import com.example.product.dto.CategoryDto;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.product.constants.ApiConstants;
import com.example.product.entity.Category;
import com.example.product.service.CategoryService;


@RestController
@Log4j2
@RequestMapping(ApiConstants.API_CATEGORY_PATH)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryApiController {
	
	@Autowired
	CategoryService categoryService;

	@Autowired
	private ModelMapper modelMapper;

	/**
	 * Function to add new category
	 * URL Pattern : URL/category
	 * URL JSON for POST: {"id":"1","name":"Category","description":"Category", "active":"1"}
	 * @param category
	 * @return Message depending on transaction status
	 */
	@PostMapping()
	public String add(@RequestBody @Valid final Category category) {
		log.info("Transaction starts to add Category {}", category.getName());
		return categoryService.add(category);
	}

	/**
	 * Function to update category details
	 * URL Pattern : URL/category
	 * URL JSON for PUT: {"id":"1","name":"Category","description":"Category Description", "active":"1"}
	 * @param category
	 * @return Message depending on transaction status
	 */
	@PutMapping()
	public String update(@RequestBody @Valid final Category category) {
		log.info("Transaction starts to update Category {}", category.getName());
		return categoryService.update(category);
	}

	/**
	 * Function to delete specific category
	 * URL Pattern : URL/category
	 * @param id
	 * @return Message depending on transaction status
	 */
	@DeleteMapping()
	public String delete(@RequestParam @Valid final int id) {
		log.info("Transaction starts to delete Category with id {}", id);
		return categoryService.delete(id);
	}

//	private CategoryDto convertToDto(Category category) {
//		CategoryDto categoryDto = modelMapper.map(category, PostDto.class);
//		return categoryDto;
//	}
//
//	private Category convertToEntity(CategoryDto categoryDto) throws ParseException {
//		Category category = modelMapper.map(categoryDto, Post.class);
//		if (categoryDto!=null) {
//			Post oldPost = postService.getPostById(postDto.getId());
//			post.setRedditID(oldPost.getRedditID());
//			post.setSent(oldPost.isSent());
//		}
//		return post;
//	}
}
