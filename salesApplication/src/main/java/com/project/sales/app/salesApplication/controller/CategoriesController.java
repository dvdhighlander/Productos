package com.project.sales.app.salesApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sales.app.salesApplication.model.Categories;
import com.project.sales.app.salesApplication.service.CategoryServiceImpl;

@RestController
@RequestMapping("/Category")
public class CategoriesController {

	@Autowired
	private CategoryServiceImpl categoryService;
	
	@GetMapping
	@ResponseBody
	public List<Categories> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@PostMapping
	public Categories createCategory(@RequestBody Categories newCat) {
		return categoryService.createCategory(newCat);
	}
	
	  @DeleteMapping("/{id}")
	  public ResponseEntity<Void> deleteClient(@PathVariable int id) {
		  categoryService.deleteCategory(id);
	        return ResponseEntity.noContent().build();
	  }
}
