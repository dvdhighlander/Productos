package com.project.sales.app.salesApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.sales.app.salesApplication.model.Categories;
import com.project.sales.app.salesApplication.model.CreateProductDTO;
import com.project.sales.app.salesApplication.model.Products;
import com.project.sales.app.salesApplication.model.Suppliers;
import com.project.sales.app.salesApplication.repository.CategoriesRepository;
import com.project.sales.app.salesApplication.repository.ProductsRepository;
import com.project.sales.app.salesApplication.repository.SuppliersRepository;

@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	ProductsRepository productsRepository;
	@Autowired
	CategoriesRepository categoryRepository;
	@Autowired
	SuppliersRepository supplierRepository;
	
	@Override
	public List<Products> getAllProducts(int pageNumber, int pageSize) {
		Pageable page= PageRequest.of(pageNumber, pageSize);
		Page<Products> rta=productsRepository.findAll(page);
		return rta.getContent();
	}

	@Override
	public Optional<Products> getProductById(int id) {
		return productsRepository.findById(id);
	}

	@Override
	public Products createProduct(CreateProductDTO product) {
		Products newProd= new Products();
		Categories category = categoryRepository.findById(product.getCattegoryID()).orElseThrow();
		Suppliers supplier = supplierRepository.findById(product.getSupplierID()).orElseThrow();
		newProd.setCattegories(category);
		newProd.setDiscontinued(product.isDiscontinued());
		newProd.setProductName(product.getProductName());
		newProd.setQuantityPerUnit(product.getQuantityPerUnit());
		newProd.setReorderLevel(product.getReorderLevel());
		newProd.setSupplier(supplier);
		newProd.setUnitPrice(product.getUnitPrice());
		newProd.setUnitsInStock(product.getUnitsInStock());
		newProd.setUnitsOnOrder(product.getUnitsOnOrder());
		return productsRepository.save(newProd);
	}

	@Override
	public Products updateProduct(Products product) {
		return productsRepository.save(product);
	}

	@Override
	public void deleteProduct(int id) {
		productsRepository.deleteById(id);
		
	}

}
