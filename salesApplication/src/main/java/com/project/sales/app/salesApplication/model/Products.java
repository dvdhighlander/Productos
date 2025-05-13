package com.project.sales.app.salesApplication.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Esta clase representa un objeto que contiene información sobre la entidad de Productos.
 *
 * @version 1.0
 * @since 2025-05-13
 */
@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	  private int productID;
	  private String productName;
	  private int quantityPerUnit;
	  private double unitPrice;
	  private int unitsInStock;
	  private int unitsOnOrder;
	  private String reorderLevel;
	  private boolean discontinued;
	  
	  @ManyToOne(cascade = CascadeType.ALL, 
	            fetch = FetchType.EAGER)
	  @JoinColumn(name = "supplierID")
	  private Suppliers supplier;
	  
	  @ManyToOne(cascade = CascadeType.ALL, 
	            fetch = FetchType.EAGER)
	  @JoinColumn(name = "categoryID")
	  private Categories cattegories;

	  

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(int quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public int getUnitsOnOrder() {
		return unitsOnOrder;
	}

	public void setUnitsOnOrder(int unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}

	public String getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(String reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public Suppliers getSupplier() {
		return supplier;
	}

	public void setSupplier(Suppliers supplier) {
		this.supplier = supplier;
	}

	public Categories getCattegories() {
		return cattegories;
	}

	public void setCattegories(Categories cattegories) {
		this.cattegories = cattegories;
	}
	  
	  
}
