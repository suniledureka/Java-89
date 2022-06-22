package com.posidex.boot.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PRODUCT_MASTER")
@Data
public class Product {
	@Id
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "PRODUCT_PRICE")
	private Float productPrice;

	@Override
	public String toString() {
		String product = String.format("Product[%3d | %-10s | %.2f]",productId, productName, productPrice);
		return product;
	}	
}