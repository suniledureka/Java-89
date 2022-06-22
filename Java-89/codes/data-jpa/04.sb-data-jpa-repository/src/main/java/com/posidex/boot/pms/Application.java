package com.posidex.boot.pms;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.posidex.boot.pms.entity.Product;
import com.posidex.boot.pms.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		//--- list the products in the ascending order of product name
		List<Product> products = repo.findByOrderByProductNameAsc();
		products.forEach(product -> System.out.println(product));
		
		System.out.println("-------------------------------------------------------------");
		
		//--- list the products in the descending order of product name
		products = repo.findByOrderByProductNameDesc();
		products.forEach(product -> System.out.println(product));		
		
		System.out.println("-------------------------------------------------------------");
		
		//-- approach-2 ---> Sorting with Sort parameter ----
		//products = repo.findAll(Sort.by("productName").ascending());
		products = repo.findAll(Sort.by("productPrice").descending());
		products.forEach(product -> System.out.println(product));
		
		//--retrieving records using pagination
		//int pageNo=0; //first page
		int pageNo=1; //second page
		int pageSize = 3;
		Page<Product> page = repo.findAll(PageRequest.of(pageNo, pageSize));
		
		products = page.getContent();
		products.forEach(product -> System.out.println(product));
	}
}
