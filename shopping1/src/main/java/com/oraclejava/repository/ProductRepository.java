package com.oraclejava.repository;

import java.util.List;

import com.oraclejava.domain.Product;

public interface ProductRepository {
	List<Product> search(String keyword);
}
