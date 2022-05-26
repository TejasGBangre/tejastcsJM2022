package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Product;


@Service
public interface ProductService {
    
	Product saveProduct(Product product);
	
	Product updateProduct(Product product,Long id);

	List<Product> getProductList();

	void deleteProductById(Long id);

}
