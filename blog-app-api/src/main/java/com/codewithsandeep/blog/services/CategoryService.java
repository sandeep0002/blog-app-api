package com.codewithsandeep.blog.services;

import java.util.List;

import com.codewithsandeep.blog.paylods.CategoryDto;

public interface CategoryService {

	// create
	
	CategoryDto  createCategory(CategoryDto categoryDto);
	
	//update
	
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	
	void deleteCategory(Integer categoryId);
	
	//get
	
	CategoryDto getCategory(Integer ategoryId);
	
	//getall
	
	List<CategoryDto> getAllCategories();
}
