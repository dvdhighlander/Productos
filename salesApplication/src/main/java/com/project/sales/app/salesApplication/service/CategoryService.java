package com.project.sales.app.salesApplication.service;

import java.util.List;
import java.util.Optional;

import com.project.sales.app.salesApplication.model.Categories;


public interface CategoryService {

	public abstract List<Categories> getAllCategories();
	public abstract Optional<Categories> getCategoryById(int id);
	public abstract Categories createCategory(Categories category);
	public abstract Categories updateCategory(Categories category);
	public abstract void deleteCategory(int id);
}
