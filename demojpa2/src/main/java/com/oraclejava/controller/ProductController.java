package com.oraclejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.oraclejava.repository.ProductRepository;

@Controller
public class ProductController {
	
	private final ProductRepository productRepository;

	public ProductController(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@GetMapping("/")
	public String getAllProducts(Model model) {
		model.addAttribute("products", productRepository.findAll());
		return "productList";
	}
	
	
	
}
