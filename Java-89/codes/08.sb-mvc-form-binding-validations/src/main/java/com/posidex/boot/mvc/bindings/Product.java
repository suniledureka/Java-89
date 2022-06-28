package com.posidex.boot.mvc.bindings;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Product {
	@NotNull(message = "* required")
	private Long productId;
	
	//@NotBlank(message = "* required")
	@NotEmpty(message = "* required")
	@Size(min = 5, max = 10, message = "* 5 to 10 chars")	
	private String productName;
	
	@NotNull(message = "* required")
	private Float productPrice;
}
