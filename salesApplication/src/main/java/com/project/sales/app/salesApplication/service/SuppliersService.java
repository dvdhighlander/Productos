package com.project.sales.app.salesApplication.service;

import java.util.List;
import java.util.Optional;

import com.project.sales.app.salesApplication.model.Suppliers;

public interface SuppliersService {

	public abstract List<Suppliers> getAllSuppliers();
	public abstract Optional<Suppliers> getSupplierById(int id);
	public abstract Suppliers createSupplier(Suppliers supplier);
	public abstract Suppliers updateSupplier(Suppliers supplier);
	public abstract void deleteSupplier(int id);
}
