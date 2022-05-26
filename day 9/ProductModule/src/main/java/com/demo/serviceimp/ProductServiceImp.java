package com.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;

public class ProductServiceImp implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product, Long id) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getProductList() {
		return productRepository.findAll();
	}

	@Override
	public void deleteProductById(Long id) {
		productRepository.deleteById(id);		
	}

}
