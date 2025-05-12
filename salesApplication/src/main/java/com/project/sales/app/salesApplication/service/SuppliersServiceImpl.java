package com.project.sales.app.salesApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sales.app.salesApplication.model.Suppliers;
import com.project.sales.app.salesApplication.repository.SuppliersRepository;

@Service
public class SuppliersServiceImpl implements SuppliersService{

	@Autowired
	SuppliersRepository suprepository;
	
	@Override
	public List<Suppliers> getAllSuppliers() {
		return suprepository.findAll();
	}

	@Override
	public Optional<Suppliers> getSupplierById(int id) {
		return suprepository.findById(id);
	}

	@Override
	public Suppliers createSupplier(Suppliers supplier) {
		Suppliers newSupplier= new Suppliers();
		newSupplier.setAddress(supplier.getAddress());
		newSupplier.setCity(supplier.getCity());
		newSupplier.setCompanyName(supplier.getCompanyName());
		newSupplier.setContactName(supplier.getContactName());
		newSupplier.setContactTitle(supplier.getContactTitle());
		newSupplier.setCountry(supplier.getCountry());
		newSupplier.setFax(supplier.getFax());
		newSupplier.setHomePage(supplier.getHomePage());
		newSupplier.setPhone(supplier.getPhone());
		newSupplier.setPostalCode(supplier.getPostalCode());
		newSupplier.setRegion(supplier.getRegion());
		return suprepository.save(newSupplier);
	}

	@Override
	public Suppliers updateSupplier(Suppliers supplier) {
		return suprepository.save(supplier);
	}

	@Override
	public void deleteSupplier(int id) {
		suprepository.deleteById(id);
		
	}

}
