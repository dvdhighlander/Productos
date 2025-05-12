package com.project.sales.app.salesApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sales.app.salesApplication.model.Suppliers;

@Repository
public interface SuppliersRepository extends JpaRepository<Suppliers, Integer>{

}
