package com.example.product.serviceimpl;

import com.example.product.constants.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Category;
import com.example.product.repository.CategoryRepo;
import com.example.product.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public String add(final Category category) {
		final boolean isExist = !(categoryRepo.findAllByName(category.getName()).isEmpty()) ;
		if(isExist) {
			return ApiConstants.API_CATEGORY_EXISTS;
		}
		
		
		categoryRepo.save(category);
		return ApiConstants.API_ADD_CATEGORY_SUCCESS;
	}

	@Override
	public String update(final Category category) {
		final boolean isExists = categoryRepo.findAllByName(category.getName()).stream().anyMatch(categoryTemp->(categoryTemp.getName().equals(category.getName()) && categoryTemp.getId()!= category.getId()));
		if(isExists) {
			return ApiConstants.API_CATEGORY_EXISTS;
		}
		categoryRepo.save(category);
		return ApiConstants.API_ADD_CATEGORY_SUCCESS;
	}

	@Override
	public String delete(final int id) {
		final boolean isExists = categoryRepo.existsById(id);
		if(!isExists) {
				return ApiConstants.API_CATEGORY_NOT_EXISTS;
		}
		categoryRepo.deleteById(id);
		return ApiConstants.API_CATEGORY_DELETE;

	}

}
