package com.project.sales.app.salesApplication.service;

import java.util.List;
import java.util.Optional;

import com.project.sales.app.salesApplication.model.CreateProductDTO;
import com.project.sales.app.salesApplication.model.Products;

public interface ProductsService {

	public abstract List<Products> getAllProducts(int pageNumber, int pageSize);
	public abstract Optional<Products> getProductById(int id);
	public abstract Products createProduct(CreateProductDTO category);
	public abstract Products updateProduct(Products category);
	public abstract void deleteProduct(int id);
}
