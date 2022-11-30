package com.oraclejava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oraclejava.model.Product;
import com.oraclejava.repository.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> findAll() {
		List<Product> list = new ArrayList<>();
		productRepository.findAll().forEach(i -> list.add(i));
		return list;
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> 
		findProductById(@PathVariable String id) {
		return productRepository.findById(id).isPresent() ?
				new ResponseEntity<>(
					productRepository.findById(id).get(),
						HttpStatus.OK)
							: new ResponseEntity<>(null,
						HttpStatus.NOT_FOUND);
	}
}







