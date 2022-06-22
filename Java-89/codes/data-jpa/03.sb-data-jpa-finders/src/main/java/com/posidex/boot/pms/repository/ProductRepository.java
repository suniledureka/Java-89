package com.posidex.boot.pms.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.posidex.boot.pms.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Serializable> {

	Product findByProductName(String pname);

	Optional<Product> findByProductNameAndProductPrice(String pname, float price);
	
	@Query("select productName from com.posidex.boot.pms.entity.Product")
	List<String> findAllProductNames();
	
	@Query(value = "select product_name from product_master", nativeQuery = true)
	List<String> findAllProductNamesWithSQL();
	
	@Query("select prod from com.posidex.boot.pms.entity.Product prod where productName = :pname")
	Product findProductByName(String pname);	
}