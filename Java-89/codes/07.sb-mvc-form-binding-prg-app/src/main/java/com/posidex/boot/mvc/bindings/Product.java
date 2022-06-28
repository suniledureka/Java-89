package com.posidex.boot.mvc.bindings;

import lombok.Data;

@Data
public class Product {
	private Long productId;
	private String productName;
	private Float productPrice;
}
