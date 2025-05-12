package com.project.sales.app.salesApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sales.app.salesApplication.model.Categories;
import com.project.sales.app.salesApplication.repository.CategoriesRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Override
	public List<Categories> getAllCategories() {
		return categoriesRepository.findAll();
	}

	@Override
	public Optional<Categories> getCategoryById(int id) {
		return categoriesRepository.findById(id);
	}

	@Override
	public Categories createCategory(Categories category) {
		Categories newCat= new Categories();
		newCat.setCategoryName(category.getCategoryName());
		newCat.setDescription(category.getDescription());
		newCat.setPicture(category.getPicture());
		return categoriesRepository.save(newCat);
	}

	@Override
	public Categories updateCategory(Categories category) {
		return categoriesRepository.save(category);
	}

	@Override
	public void deleteCategory(int id) {
		categoriesRepository.deleteById(id);
	}

}
