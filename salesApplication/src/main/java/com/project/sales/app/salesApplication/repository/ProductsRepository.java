package com.project.sales.app.salesApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sales.app.salesApplication.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
