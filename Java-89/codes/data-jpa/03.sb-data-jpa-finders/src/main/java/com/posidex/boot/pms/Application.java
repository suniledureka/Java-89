package com.posidex.boot.pms;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.posidex.boot.pms.entity.Product;
import com.posidex.boot.pms.repository.ProductRepository;

@SpringBootApplication
public class Application {
	private static ProductRepository productRepo;
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		 productRepo = context.getBean(ProductRepository.class);
		 
		 /*
		 String pname = "Mobilee"; 
		 Product product = productRepo.findByProductName(pname);
		 System.out.println(product);
		 */
		 
		 /*
		 String pname = "Computer";
		 float price = 34000;
		 Optional<Product> optProduct =  productRepo.findByProductNameAndProductPrice(pname, price);
		 if(optProduct.isPresent()) {
			 Product product = optProduct.get();
			 System.out.println(product);
		 }else {
			 System.out.println("no matching product found!!");
		 }
		 */
		 
		 //------- list all Product Names --------
		 List<String> productNames = productRepo.findAllProductNames();
		 for(String pname : productNames) {
			 System.out.println("----> " + pname);
		 }
		 System.out.println("-------------------------------------------------------------");
		 
		 productNames = productRepo.findAllProductNamesWithSQL();
		 productNames.forEach((product -> System.out.println("---> " + product)));
		 
		 System.out.println("-------------------------------------------------------------");
		 
		 Product product = productRepo.findProductByName("Mobile");
		 System.out.println(product);
	}
}