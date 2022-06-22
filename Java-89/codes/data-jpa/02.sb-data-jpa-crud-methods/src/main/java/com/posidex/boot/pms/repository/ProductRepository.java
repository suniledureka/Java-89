package com.posidex.boot.pms.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.posidex.boot.pms.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Serializable> {

}
