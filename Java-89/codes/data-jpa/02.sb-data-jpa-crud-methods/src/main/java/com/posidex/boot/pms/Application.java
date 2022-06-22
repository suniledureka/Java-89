package com.posidex.boot.pms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.posidex.boot.pms.entity.Product;
import com.posidex.boot.pms.repository.ProductRepository;

@SpringBootApplication
public class Application {	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		/*
		//---- to save a Product -------
		Product product = new Product();
		product.setProductId(101);
		product.setProductName("Mobile");
		product.setProductPrice(15750.5f);
		
		Product savedProduct = productRepo.save(product);
		System.out.println("Product Saved ---> " + savedProduct);
		*/
		
		/*
		//----- to save multiple products ---------
		List<Product> products = Arrays.asList(
					new Product(102,"Computer", 34000f),
					new Product(103,"Television", 45000f),
					new Product(104,"Printer", 14750f),
					new Product(105,"Speaker", 18250f),
					new Product(106,"Keyboard", 375.50f)
				);
		productRepo.saveAll(products);
		*/
		
		/*
		//---- to get the numbers of records in DB table -----------
		long productsCount = productRepo.count();
		System.out.println("No of Products Available = " + productsCount);
		*/
		
		/*
		//-- to check the availability of Product with product id ----------------
		boolean productStatus = productRepo.existsById(101);
		System.out.println("is product with id = 101 available --> " + productStatus);
		*/
		
		/*
		//--- get a product based on product id -----
		Optional<Product> optProduct = productRepo.findById(101);
		if(optProduct.isPresent()) {
			Product product = optProduct.get();
			System.out.println(product);
			System.out.println("Product["+product.getProductId() + " | "+ product.getProductName() + " | " + product.getProductPrice()+"]");			
		}else {
			System.out.println("no matching product found!!");
		}
		*/
		
		/*
		//-- get a list of product based on multiple product ids
		Iterable<Serializable> productIds = Arrays.asList(101,103,105,108,120,106);
		Iterable<Product> products = productRepo.findAllById(productIds);
		displayProducts(products);
		*/
		
		
		//-- get all the products
		Iterable<Product> products = productRepo.findAll();
		displayProducts(products);
		
		//---- implement all the 5 delete methods -----
		context.close();
	}

	private static void displayProducts(Iterable<Product> products) {
		for(Product prod : products) {
			System.out.println("Product["+prod.getProductId() + " | "+ prod.getProductName() + " | " + prod.getProductPrice()+"]");
		}
	}
}