package com.project.sales.app.salesApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sales.app.salesApplication.model.CreateProductDTO;
import com.project.sales.app.salesApplication.model.Products;
import com.project.sales.app.salesApplication.service.ProductsServiceImpl;

@RestController
@RequestMapping("/Products")
public class ProductsController {

	@Autowired
	private ProductsServiceImpl productService;
	
	@GetMapping
	@ResponseBody
	public List<Products> getAllProducts(@RequestParam(required = true)  int page, @RequestParam(required = true)  int pageSize){
		return productService.getAllProducts(page, pageSize);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Products> getProductById(@PathVariable int id){
		Optional<Products> product= productService.getProductById(id);
		return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Products createProduct(@RequestBody CreateProductDTO newProd) {
		return productService.createProduct(newProd);
	}
}
