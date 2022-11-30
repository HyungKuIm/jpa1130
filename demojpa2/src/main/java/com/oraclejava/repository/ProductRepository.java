package com.oraclejava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.oraclejava.model.Product;

public interface ProductRepository 
	extends CrudRepository<Product, String>{
	
//	@Query("select p from Product p where p.brand = :brand")
//	List<Product> findByBrand(String brand);
}
