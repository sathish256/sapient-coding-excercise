package com.globalmart.core.product.catalogue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gm_product")
public class Product {

	@Id
    @GeneratedValue
    @Column(name="id")
    private Long productId;
	
	@Column(name="productname")
    private String productName;
    
    @Column(name="type")
    private String productType;
    
    @Column(name="instockqty")
    private Integer inStockQuantity;
    
    @Column(name="retailprice")
    private Double retailPrice;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getInStockQuantity() {
		return inStockQuantity;
	}

	public void setInStockQuantity(Integer inStockQuantity) {
		this.inStockQuantity = inStockQuantity;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}
    
}
