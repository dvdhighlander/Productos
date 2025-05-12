package com.project.sales.app.salesApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sales.app.salesApplication.model.Suppliers;
import com.project.sales.app.salesApplication.service.SuppliersServiceImpl;

@RestController
@RequestMapping("/Supplier")
public class SuppliersController {

	@Autowired
	private SuppliersServiceImpl supplierService;
	
	@GetMapping
	@ResponseBody
	public List<Suppliers> getAllSuppliers(){
		return supplierService.getAllSuppliers();
	}
	
	@PostMapping
	public Suppliers createCategory(@RequestBody Suppliers newSup) {
		return supplierService.createSupplier(newSup);
	}
}
