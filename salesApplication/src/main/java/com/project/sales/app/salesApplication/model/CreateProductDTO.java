package com.project.sales.app.salesApplication.model;



/**
 * Esta clase representa el objeto para creacion de los Productos.
 *
 * @version 1.0
 * @since 2025-05-13
 */
public class CreateProductDTO {
	  private String productName;
	  private int quantityPerUnit;
	  private double unitPrice;
	  private int unitsInStock;
	  private int unitsOnOrder;
	  private String reorderLevel;
	  private boolean discontinued;
	  
	  private int supplierID;	  
	  private int cattegoryID;

	  

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

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public int getCattegoryID() {
		return cattegoryID;
	}

	public void setCattegoryID(int cattegoryID) {
		this.cattegoryID = cattegoryID;
	}



	  
}
